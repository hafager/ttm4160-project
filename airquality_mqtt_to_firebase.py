import paho.mqtt.client as mqtt
from firebase import firebase
import time

co2_topic = "airquality/co2"
mqtt_broker = "blocks2.bitreactive.com"
firebase = firebase.FirebaseApplication("https://reactivedesign-179e8.firebaseio.com", None)

def on_connect(client, userdata, flags, rc):
    print("Connected with result code "+str(rc))
    client.subscribe(co2_topic)

def on_message(client, userdata, msg):
	data = str(msg.payload)
	if (data!="Failed"):
		try:
			value = int(str(msg.payload))
			print("Value sent to firebase: " + str(value))
			timenow = time.strftime("%Y-%m-%d %H:%M:%S")
			update = firebase.post("/db", {"time": timenow, "value": value})
		except:
			print("Couldn't convert to int.")

def handleinput(data):
	try:
		return int(str(msg.payload))
	except:
		print("Couldn't convert to int.")

client = mqtt.Client()
client.on_connect = on_connect
client.on_message = on_message

client.connect(mqtt_broker, 1883, 60)

client.loop_forever()