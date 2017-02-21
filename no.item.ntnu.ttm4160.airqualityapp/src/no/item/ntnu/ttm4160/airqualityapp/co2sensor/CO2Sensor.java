package no.item.ntnu.ttm4160.airqualityapp.co2sensor;

import no.item.ntnu.ttm4160.airqualityapp.measureco2.MeasureCO2;
import no.ntnu.item.arctis.runtime.Block;

import com.pi4j.io.gpio.exception.UnsupportedBoardType;
import com.pi4j.io.serial.*;

import java.io.IOException;

public class CO2Sensor extends Block {
	final Serial serial = SerialFactory.createInstance();
	
	// Instance parameter. Edit only in overview page.
	public final int interval;
	
	
	// Do not edit this constructor.
	public CO2Sensor(int interval) {
		this.interval = interval;
	}
	
	
	public void init() {
		try {
			SerialConfig config = new SerialConfig();
			config.device(SerialPort.getDefaultPort())
			.baud(Baud._9600)
			.dataBits(DataBits._8)
			.parity(Parity.NONE)
			.stopBits(StopBits._1)
			.flowControl(FlowControl.NONE);
			
			serial.open(config);
			serial.write("K 2\r\n");
			serial.discardInput();
			
			byte[] first_input = serial.read(10);
			String level_hex = byteArrayToString(first_input);
            String level_ascii = hexToAscii(level_hex);
			System.out.println(level_ascii.substring(1, 8));
			if( ! level_ascii.substring(1, 8).equals("K 00002") ){
				System.out.println("Error writing to device.");
				serial.close();
				System.exit(1);
			};
		}
		catch(IOException ex) {
			System.out.println("Failed");
		} catch (UnsupportedBoardType e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public int getInterval() {
		return this.interval;
	}
	public Serial getSerial() {
		return serial;
	}
	
	
	
	public void shutdown() {
		try {
			serial.close();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
