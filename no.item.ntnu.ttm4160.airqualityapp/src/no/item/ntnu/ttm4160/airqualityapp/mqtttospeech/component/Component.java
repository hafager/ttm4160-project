package no.item.ntnu.ttm4160.airqualityapp.mqtttospeech.component;

import com.bitreactive.library.mqtt.MQTTConfigParam;
import com.bitreactive.library.mqtt.MQTTMessage;
import com.bitreactive.library.mqtt.robustmqtt.RobustMQTT.Parameters;

import no.ntnu.item.arctis.runtime.Block;

public class Component extends Block {

	public Parameters init() {
		MQTTConfigParam p = new MQTTConfigParam("blocks2.bitreactive.com");
		p.addSubscribeTopic("airquality/co2");
		System.out.println("init");
		return new Parameters(p, 2);
	}

	public String readMSG(MQTTMessage m) {
		String s;
		if (m == null) {
			s = "Error: Empty payload!";
		} else {
			s = new String(m.getPayload());
		}
		System.out.println("Receiving message '" + s + "'");
		return s;
	}

}
