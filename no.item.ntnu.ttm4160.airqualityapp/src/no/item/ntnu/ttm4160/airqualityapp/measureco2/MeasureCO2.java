package no.item.ntnu.ttm4160.airqualityapp.measureco2;

import no.ntnu.item.arctis.runtime.Block;
import com.pi4j.io.serial.Serial;
import java.io.IOException;

public class MeasureCO2 extends Block {

	public void requestData(final Serial serial) {
		Runnable r = new Runnable(){

            @Override
            public void run() {
                try {
                    serial.write("Q\r\n");
                    byte[] byteArray = serial.read(10);
                    String level_hex = MeasureCO2.this.byteArrayToString(byteArray);
                    String level_ascii = MeasureCO2.this.hexToAscii(level_hex);
                    level_ascii = level_ascii.substring(4).trim();
                    level_ascii = level_ascii.replaceFirst("^0+(?!$)", "");
                    MeasureCO2.this.sendToBlock("SUCCESS", level_ascii);
                }
                catch (IllegalStateException e) {
                    e.printStackTrace();
                    MeasureCO2.this.sendToBlock("FAILED");
                }
                catch (IOException e) {
                    e.printStackTrace();
                    MeasureCO2.this.sendToBlock("FAILED");
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
	}
	
	private String byteArrayToString(byte[] in) {
        char[] out = new char[in.length * 2];
        int i = 0;
        while (i < in.length) {
            out[i * 2] = "0123456789ABCDEF".charAt(in[i] >> 4 & 15);
            out[i * 2 + 1] = "0123456789ABCDEF".charAt(in[i] & 15);
            ++i;
        }
        return new String(out);
    }

    private String hexToAscii(String hex) {
        StringBuilder output = new StringBuilder();
        int i = 0;
        while (i < hex.length()) {
            String str = hex.substring(i, i + 2);
            output.append((char)Integer.parseInt(str, 16));
            i += 2;
        }
        return output.toString();
    }
}