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
	private boolean running;
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
	public void stop() {
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
	public String handleInput(String measurement) {
		measurement = measurement.substring(0,8);
		//float value = Float.parseFloat( measurement.substring(2) );
		return measurement.substring(2);

	}

	

}
