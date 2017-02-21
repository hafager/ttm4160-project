package no.item.ntnu.ttm4160.airqualityapp.sensorapp.component;

import com.bitreactive.library.mqtt.MQTTConfigParam;
import com.bitreactive.library.mqtt.MQTTMessage;
import com.bitreactive.library.mqtt.robustmqtt.RobustMQTT.Parameters;

import no.ntnu.item.arctis.runtime.Block;

//import org.json;

public class Component extends Block {

	public void printCO2(String level) {
		System.out.println("CO2 level: " + level);
	}

	public Parameters init() {
		MQTTConfigParam p = new MQTTConfigParam("nyx.bjornhaug.net");
		return new Parameters(p, 2); 
	}
	
	public MQTTMessage createMSG(String co2) {
		byte[] b = co2.getBytes();
		MQTTMessage m = new MQTTMessage(b, "paradise/api/co2");
		m.setQoS(2);
		return m;
	}

}
