package no.item.ntnu.ttm4160.airqualityapp.co2sensor;

import no.ntnu.item.arctis.runtime.Block;

import com.pi4j.io.gpio.exception.UnsupportedBoardType;
import com.pi4j.io.serial.*;
import com.pi4j.util.CommandArgumentParser;
import com.pi4j.util.Console;

import java.io.IOException;
import java.util.Date;

public class CO2Sensor extends Block {
	final Serial serial = SerialFactory.createInstance();
	// Instance parameter. Edit only in overview page.
	public final int interval;
	
	public CO2Sensor(int interval) {
		this.interval = interval;
	}
	public CO2Sensor() {
		this.interval = 5;
	}
	
	public void init(int interval) {
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
	
	
	public String test() {
		String msg = "Paradise";
		System.out.println(msg);
		return msg;
	}
	
	public String readData() {
		String level;
		try {
			serial.write("Q\r\n");
			level = serial.read(10).toString();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			level = "Failed";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			level = "Failed";
		}
		return level;
	}
	
	

}
