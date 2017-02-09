package no.item.ntnu.ttm4160.airqualityapp.co2sensor;

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
			//if(!(serial.read(10).toString()==" K 00002\r\n")){
			//	serial.close();
			//};
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
}
