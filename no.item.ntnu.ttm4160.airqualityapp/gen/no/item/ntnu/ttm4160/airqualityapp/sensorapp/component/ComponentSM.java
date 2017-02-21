package no.item.ntnu.ttm4160.airqualityapp.sensorapp.component;

public class ComponentSM extends no.ntnu.item.arctis.runtime.IStateMachine {

    private no.item.ntnu.ttm4160.airqualityapp.sensorapp.component.Component b000;
    private no.item.ntnu.ttm4160.airqualityapp.co2sensor.CO2Sensor b001;
    private no.item.ntnu.ttm4160.airqualityapp.measureco2.MeasureCO2 b002;
    private com.bitreactive.library.mqtt.robustmqtt.RobustMQTT b003;
    private com.bitreactive.library.mqtt.createcallback.CreateCallback b004;
    private com.bitreactive.library.mqtt.connhandler.ConnHandler b005;
    private com.bitreactive.library.mqtt.publishmanager.PublishManager b006;
    private com.bitreactive.library.mqtt.publishhandler.PublishHandler b007;
    private com.bitreactive.library.mqtt.publishpolicy.PublishPolicy b008;
    private com.bitreactive.library.buffering.buffereager.BufferEager<com.bitreactive.library.mqtt.MQTTMessage> b009;
    private com.bitreactive.library.mqtt.publisher.Publisher b010;
    private com.bitreactive.library.mqtt.publishhandler2.PublishHandler2 b011;
    private com.bitreactive.library.mqtt.publisher.Publisher b012;
    private com.bitreactive.library.buffering.persistentbuffer.PersistentBuffer<com.bitreactive.library.mqtt.MQTTMessage> b013;
    private com.bitreactive.library.mqtt.publishpolicy.PublishPolicy b014;
    private com.bitreactive.library.mqtt.subscribehandler.SubscribeHandler b015;
    private com.bitreactive.library.mqtt.subscriber.Subscriber b016;
    private com.bitreactive.library.timers.timer2.Timer2 b017;
    private enum Com_bitreactive_library_mqtt_RobustMQTT {_IDLE, ACTIVE, INITIALIZING};
    private enum Com_bitreactive_library_mqtt_ConnHandler {_IDLE, ACTIVE, INITIALIZING};
    private enum Com_bitreactive_library_mqtt_PublishHandler {_IDLE, ACTIVE};
    private enum Com_bitreactive_library_buffering_BufferEager {_IDLE, ACTIVE, FIRSTITEMADDED, READY, STOPPING};
    private enum Com_bitreactive_library_mqtt_Publisher {_IDLE, ACTIVE};
    private enum Com_bitreactive_library_mqtt_PublishHandler2 {_IDLE, ACTIVE, INITIALIZING};
    private enum Com_bitreactive_library_buffering_PersistentBuffer {_IDLE, ACTIVE, INITIALIZING, REMOVING};
    private enum Com_bitreactive_library_mqtt_Subscriber {_IDLE, ACTIVE};
    private enum Com_bitreactive_library_timers_Timer2 {_IDLE, ACTIVE};
    private Com_bitreactive_library_mqtt_RobustMQTT b003_state;
    private Com_bitreactive_library_mqtt_ConnHandler b005_state;
    private Com_bitreactive_library_mqtt_PublishHandler b007_state;
    private Com_bitreactive_library_buffering_BufferEager b009_state;
    private Com_bitreactive_library_mqtt_Publisher b010_state;
    private Com_bitreactive_library_mqtt_PublishHandler2 b011_state;
    private Com_bitreactive_library_mqtt_Publisher b012_state;
    private Com_bitreactive_library_buffering_PersistentBuffer b013_state;
    private Com_bitreactive_library_mqtt_Subscriber b016_state;
    private Com_bitreactive_library_timers_Timer2 b017_state;
    private enum Com_bitreactive_library_buffering_BufferEager_Stm {_IDLE, ACTIVE, CHECKCONTENTADDALL, FIRSTITEMADDED, HASROOM, HASROOMAFTERADDINGFIRST, HASROOMFORALL, HASROOMFORALLAFTERADDINGFIRST, HASROOMFORALLINITIAL, ISBUFFEREMPTY, ISEMPTYWHILEACTIVE, ISEMPTYWHILESTOPPING, READY, STOPPING};
    private Com_bitreactive_library_buffering_BufferEager_Stm b009_stm_state;
    private no.ntnu.item.arctis.runtime.IStateMachine.Timer _b0_CO2Sensor_t0;
    private no.ntnu.item.arctis.runtime.IStateMachine.Timer _b1_c1_Conn_Handler_t0;
    private no.ntnu.item.arctis.runtime.IStateMachine.Timer _b1_c1_Conn_Handler_t1;
    private no.ntnu.item.arctis.runtime.IStateMachine.Break _b1_c2_Publish_Manager_t0;
    private no.ntnu.item.arctis.runtime.IStateMachine.Break _b1_c2_b0_Publish_Handler_t0;
    private com.bitreactive.library.mqtt.publisher.Publisher.Parameters _b1_c2_b0_Publish_Handler_t0_data;
    private no.ntnu.item.arctis.runtime.IStateMachine.Timer _b1_c2_b0_Publish_Handler_t2;
    private com.bitreactive.library.mqtt.MQTTMessage _b1_c2_b0_Publish_Handler_t2_data;
    private no.ntnu.item.arctis.runtime.IStateMachine.Break _b1_c2_b0_Publish_Handler_t3;
    private no.ntnu.item.arctis.runtime.IStateMachine.Break _b1_c2_b0_c1_Buffer_Eager_t0;
    private no.ntnu.item.arctis.runtime.IStateMachine.Timer _b1_c2_b1_Publish_Handler_2_t0;
    private no.ntnu.item.arctis.runtime.IStateMachine.Timer _b1_c2_b1_Publish_Handler_2_t1;
    private com.bitreactive.library.mqtt.MQTTMessage _b1_c2_b1_Publish_Handler_2_t1_data;
    private no.ntnu.item.arctis.runtime.IStateMachine.Break _b1_c2_b1_Publish_Handler_2_t2;
    private no.ntnu.item.arctis.runtime.IStateMachine.Break _b1_c2_b1_Publish_Handler_2_t3;
    private com.bitreactive.library.mqtt.publisher.Publisher.Parameters _b1_c2_b1_Publish_Handler_2_t3_data;
    private no.ntnu.item.arctis.runtime.IStateMachine.Break _b1_c3_Subscribe_Handler_t0;
    private no.ntnu.item.arctis.runtime.IStateMachine.Timer _b1_c3_c1_Timer_2_timer;
    private boolean b002_FAILED_r0;
    private boolean b002_SUCCESS_r1;
    private boolean b004_CONN_LOST_r0;
    private boolean b004_MSG_ARRIVED_r2;
    private boolean b005_INIT_OK_r0;
    private boolean b005_INIT_FAILED_r1;
    private boolean b005_RECONN_OK_r2;
    private boolean b005_RECONN_FAILED_r3;
    private boolean b010_PUB_OK_r0;
    private boolean b010_PUB_ERROR_r1;
    private boolean b012_PUB_OK_r0;
    private boolean b012_PUB_ERROR_r1;
    private boolean b013_REMOVED_r0;
    private boolean b013_INIT_r1;
    private boolean b016_SUBS_OK_r0;
    private boolean b016_SUBS_ERROR_r1;

    public ComponentSM(no.ntnu.item.arctis.runtime.Scheduler scheduler) {
        super(scheduler);
    }

    public int fireInitial() {
        b000 = new no.item.ntnu.ttm4160.airqualityapp.sensorapp.component.Component();
        b000.setBlockID("b000", sessionID);
        b000.setRuntime(scheduler.getRuntime());
        b001 = new no.item.ntnu.ttm4160.airqualityapp.co2sensor.CO2Sensor(5000);
        b001.setBlockID("b001", sessionID);
        b001.setRuntime(scheduler.getRuntime());
        b002 = new no.item.ntnu.ttm4160.airqualityapp.measureco2.MeasureCO2();
        b002.setBlockID("b002", sessionID);
        b002.setRuntime(scheduler.getRuntime());
        b003 = new com.bitreactive.library.mqtt.robustmqtt.RobustMQTT();
        b003.setBlockID("b003", sessionID);
        b003.setRuntime(scheduler.getRuntime());
        b004 = new com.bitreactive.library.mqtt.createcallback.CreateCallback();
        b004.setBlockID("b004", sessionID);
        b004.setRuntime(scheduler.getRuntime());
        b005 = new com.bitreactive.library.mqtt.connhandler.ConnHandler();
        b005.setBlockID("b005", sessionID);
        b005.setRuntime(scheduler.getRuntime());
        b006 = new com.bitreactive.library.mqtt.publishmanager.PublishManager();
        b006.setBlockID("b006", sessionID);
        b006.setRuntime(scheduler.getRuntime());
        b007 = new com.bitreactive.library.mqtt.publishhandler.PublishHandler();
        b007.setBlockID("b007", sessionID);
        b007.setRuntime(scheduler.getRuntime());
        b008 = new com.bitreactive.library.mqtt.publishpolicy.PublishPolicy();
        b008.setBlockID("b008", sessionID);
        b008.setRuntime(scheduler.getRuntime());
        b009 = new com.bitreactive.library.buffering.buffereager.BufferEager<com.bitreactive.library.mqtt.MQTTMessage>(true, 100, true);
        b009.setBlockID("b009", sessionID);
        b009.setRuntime(scheduler.getRuntime());
        b010 = new com.bitreactive.library.mqtt.publisher.Publisher();
        b010.setBlockID("b010", sessionID);
        b010.setRuntime(scheduler.getRuntime());
        b011 = new com.bitreactive.library.mqtt.publishhandler2.PublishHandler2();
        b011.setBlockID("b011", sessionID);
        b011.setRuntime(scheduler.getRuntime());
        b012 = new com.bitreactive.library.mqtt.publisher.Publisher();
        b012.setBlockID("b012", sessionID);
        b012.setRuntime(scheduler.getRuntime());
        b013 = new com.bitreactive.library.buffering.persistentbuffer.PersistentBuffer<com.bitreactive.library.mqtt.MQTTMessage>();
        b013.setBlockID("b013", sessionID);
        b013.setRuntime(scheduler.getRuntime());
        b014 = new com.bitreactive.library.mqtt.publishpolicy.PublishPolicy();
        b014.setBlockID("b014", sessionID);
        b014.setRuntime(scheduler.getRuntime());
        b015 = new com.bitreactive.library.mqtt.subscribehandler.SubscribeHandler();
        b015.setBlockID("b015", sessionID);
        b015.setRuntime(scheduler.getRuntime());
        b016 = new com.bitreactive.library.mqtt.subscriber.Subscriber();
        b016.setBlockID("b016", sessionID);
        b016.setRuntime(scheduler.getRuntime());
        b017 = new com.bitreactive.library.timers.timer2.Timer2();
        b017.setBlockID("b017", sessionID);
        b017.setRuntime(scheduler.getRuntime());
        b003_state = Com_bitreactive_library_mqtt_RobustMQTT._IDLE;
        b005_state = Com_bitreactive_library_mqtt_ConnHandler._IDLE;
        b007_state = Com_bitreactive_library_mqtt_PublishHandler._IDLE;
        b009_state = Com_bitreactive_library_buffering_BufferEager._IDLE;
        b010_state = Com_bitreactive_library_mqtt_Publisher._IDLE;
        b011_state = Com_bitreactive_library_mqtt_PublishHandler2._IDLE;
        b012_state = Com_bitreactive_library_mqtt_Publisher._IDLE;
        b013_state = Com_bitreactive_library_buffering_PersistentBuffer._IDLE;
        b016_state = Com_bitreactive_library_mqtt_Subscriber._IDLE;
        b017_state = Com_bitreactive_library_timers_Timer2._IDLE;
        b009_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm._IDLE;
        _b0_CO2Sensor_t0 = new no.ntnu.item.arctis.runtime.IStateMachine.Timer("_b0_CO2Sensor_t0", this);
        _b1_c1_Conn_Handler_t0 = new no.ntnu.item.arctis.runtime.IStateMachine.Timer("_b1_c1_Conn_Handler_t0", this);
        _b1_c1_Conn_Handler_t1 = new no.ntnu.item.arctis.runtime.IStateMachine.Timer("_b1_c1_Conn_Handler_t1", this);
        _b1_c2_Publish_Manager_t0 = new no.ntnu.item.arctis.runtime.IStateMachine.Break("_b1_c2_Publish_Manager_t0", this);
        _b1_c2_b0_Publish_Handler_t0 = new no.ntnu.item.arctis.runtime.IStateMachine.Break("_b1_c2_b0_Publish_Handler_t0", this);
        _b1_c2_b0_Publish_Handler_t2 = new no.ntnu.item.arctis.runtime.IStateMachine.Timer(5000, "_b1_c2_b0_Publish_Handler_t2", this);
        _b1_c2_b0_Publish_Handler_t3 = new no.ntnu.item.arctis.runtime.IStateMachine.Break("_b1_c2_b0_Publish_Handler_t3", this);
        _b1_c2_b0_c1_Buffer_Eager_t0 = new no.ntnu.item.arctis.runtime.IStateMachine.Break("_b1_c2_b0_c1_Buffer_Eager_t0", this);
        _b1_c2_b1_Publish_Handler_2_t0 = new no.ntnu.item.arctis.runtime.IStateMachine.Timer("_b1_c2_b1_Publish_Handler_2_t0", this);
        _b1_c2_b1_Publish_Handler_2_t1 = new no.ntnu.item.arctis.runtime.IStateMachine.Timer(1000, "_b1_c2_b1_Publish_Handler_2_t1", this);
        _b1_c2_b1_Publish_Handler_2_t2 = new no.ntnu.item.arctis.runtime.IStateMachine.Break("_b1_c2_b1_Publish_Handler_2_t2", this);
        _b1_c2_b1_Publish_Handler_2_t3 = new no.ntnu.item.arctis.runtime.IStateMachine.Break("_b1_c2_b1_Publish_Handler_2_t3", this);
        _b1_c3_Subscribe_Handler_t0 = new no.ntnu.item.arctis.runtime.IStateMachine.Break("_b1_c3_Subscribe_Handler_t0", this);
        _b1_c3_c1_Timer_2_timer = new no.ntnu.item.arctis.runtime.IStateMachine.Timer("_b1_c3_c1_Timer_2_timer", this);
        b001.init();
        com.bitreactive.library.mqtt.robustmqtt.RobustMQTT.Parameters b000_o1 = b000.init();
        b003.p = b000_o1;
        com.bitreactive.library.mqtt.MQTTConfigParam b003_o0 = b003.getConfig();
        org.eclipse.paho.client.mqttv3.MqttCallback b004_o0 = b004.create(b003_o0);
        com.bitreactive.library.mqtt.connhandler.ConnHandler.Parameters b003_o1 = b003.startConn(b004_o0);
        b005.p = b003_o1;
        b005.start();
        b005.connect();
        b004_CONN_LOST_r0 = true;
        b004_MSG_ARRIVED_r2 = true;
        b005_INIT_OK_r0 = true;
        b005_INIT_FAILED_r1 = true;
        b003_state = Com_bitreactive_library_mqtt_RobustMQTT.INITIALIZING;
        b005_state = Com_bitreactive_library_mqtt_ConnHandler.INITIALIZING;
        // step 34810;
        return CONSUME_SIGNAL;
    }

    public int fireTimer(java.lang.String _timerID) {
        if (_timerID.equals("_b0_CO2Sensor_t0")) {
            return handleTimer__b0_CO2Sensor_t0();
        } else if (_timerID.equals("_b1_c1_Conn_Handler_t0")) {
            return handleTimer__b1_c1_Conn_Handler_t0();
        } else if (_timerID.equals("_b1_c1_Conn_Handler_t1")) {
            return handleTimer__b1_c1_Conn_Handler_t1();
        } else if (_timerID.equals("_b1_c2_Publish_Manager_t0")) {
            return handleTimer__b1_c2_Publish_Manager_t0();
        } else if (_timerID.equals("_b1_c2_b0_Publish_Handler_t0")) {
            return handleTimer__b1_c2_b0_Publish_Handler_t0();
        } else if (_timerID.equals("_b1_c2_b0_Publish_Handler_t2")) {
            return handleTimer__b1_c2_b0_Publish_Handler_t2();
        } else if (_timerID.equals("_b1_c2_b0_Publish_Handler_t3")) {
            return handleTimer__b1_c2_b0_Publish_Handler_t3();
        } else if (_timerID.equals("_b1_c2_b0_c1_Buffer_Eager_t0")) {
            return handleTimer__b1_c2_b0_c1_Buffer_Eager_t0();
        } else if (_timerID.equals("_b1_c2_b1_Publish_Handler_2_t0")) {
            return handleTimer__b1_c2_b1_Publish_Handler_2_t0();
        } else if (_timerID.equals("_b1_c2_b1_Publish_Handler_2_t1")) {
            return handleTimer__b1_c2_b1_Publish_Handler_2_t1();
        } else if (_timerID.equals("_b1_c2_b1_Publish_Handler_2_t2")) {
            return handleTimer__b1_c2_b1_Publish_Handler_2_t2();
        } else if (_timerID.equals("_b1_c2_b1_Publish_Handler_2_t3")) {
            return handleTimer__b1_c2_b1_Publish_Handler_2_t3();
        } else if (_timerID.equals("_b1_c3_Subscribe_Handler_t0")) {
            return handleTimer__b1_c3_Subscribe_Handler_t0();
        } else if (_timerID.equals("_b1_c3_c1_Timer_2_timer")) {
            return handleTimer__b1_c3_c1_Timer_2_timer();
        }
        return DISCARD_SIGNAL;
    }

    public int fire(java.lang.Object _sender, java.lang.Object receiverSessionID, java.lang.String _signalID, java.lang.Object _data) {
        if (_signalID.equals("FAILED_b002")) {
            return handleEvent_FAILED_b002(_sender, receiverSessionID, _data);
        } else if (_signalID.equals("SUCCESS_b002")) {
            return handleEvent_SUCCESS_b002(_sender, receiverSessionID, _data);
        } else if (_signalID.equals("CONN_LOST_b004")) {
            return handleEvent_CONN_LOST_b004(_sender, receiverSessionID, _data);
        } else if (_signalID.equals("MSG_ARRIVED_b004")) {
            return handleEvent_MSG_ARRIVED_b004(_sender, receiverSessionID, _data);
        } else if (_signalID.equals("INIT_OK_b005")) {
            return handleEvent_INIT_OK_b005(_sender, receiverSessionID, _data);
        } else if (_signalID.equals("INIT_FAILED_b005")) {
            return handleEvent_INIT_FAILED_b005(_sender, receiverSessionID, _data);
        } else if (_signalID.equals("RECONN_OK_b005")) {
            return handleEvent_RECONN_OK_b005(_sender, receiverSessionID, _data);
        } else if (_signalID.equals("RECONN_FAILED_b005")) {
            return handleEvent_RECONN_FAILED_b005(_sender, receiverSessionID, _data);
        } else if (_signalID.equals("PUB_OK_b010")) {
            return handleEvent_PUB_OK_b010(_sender, receiverSessionID, _data);
        } else if (_signalID.equals("PUB_ERROR_b010")) {
            return handleEvent_PUB_ERROR_b010(_sender, receiverSessionID, _data);
        } else if (_signalID.equals("PUB_OK_b012")) {
            return handleEvent_PUB_OK_b012(_sender, receiverSessionID, _data);
        } else if (_signalID.equals("PUB_ERROR_b012")) {
            return handleEvent_PUB_ERROR_b012(_sender, receiverSessionID, _data);
        } else if (_signalID.equals("REMOVED_b013")) {
            return handleEvent_REMOVED_b013(_sender, receiverSessionID, _data);
        } else if (_signalID.equals("INIT_b013")) {
            return handleEvent_INIT_b013(_sender, receiverSessionID, _data);
        } else if (_signalID.equals("SUBS_OK_b016")) {
            return handleEvent_SUBS_OK_b016(_sender, receiverSessionID, _data);
        } else if (_signalID.equals("SUBS_ERROR_b016")) {
            return handleEvent_SUBS_ERROR_b016(_sender, receiverSessionID, _data);
        }
        return TRIGGER_UNKNOWN;
    }

    private int handleTimer__b0_CO2Sensor_t0() {
        com.pi4j.io.serial.Serial b001_o0 = b001.getSerial();
        b002.requestData(b001_o0);
        b002_FAILED_r0 = true;
        b002_SUCCESS_r1 = true;
        // step d1027;
        return CONSUME_SIGNAL;
    }

    private int handleTimer__b1_c1_Conn_Handler_t0() {
        b005.reconnect();
        b005_RECONN_OK_r2 = true;
        b005_RECONN_FAILED_r3 = true;
        // step b3dfb;
        return CONSUME_SIGNAL;
    }

    private int handleTimer__b1_c1_Conn_Handler_t1() {
        b005.connect();
        b005_INIT_OK_r0 = true;
        b005_INIT_FAILED_r1 = true;
        // step 315fb;
        return CONSUME_SIGNAL;
    }

    private int handleTimer__b1_c2_Publish_Manager_t0() {
        com.pi4j.io.serial.Serial b001_o0 = b001.getSerial();
        b002.requestData(b001_o0);
        b002_FAILED_r0 = true;
        b002_SUCCESS_r1 = true;
        b003_state = Com_bitreactive_library_mqtt_RobustMQTT.ACTIVE;
        // step 39691;
        return CONSUME_SIGNAL;
    }

    private int handleTimer__b1_c2_b0_Publish_Handler_t0() {
        b010.publish(_b1_c2_b0_Publish_Handler_t0_data);
        b010_PUB_OK_r0 = true;
        b010_PUB_ERROR_r1 = true;
        b010_state = Com_bitreactive_library_mqtt_Publisher.ACTIVE;
        // step dd958;
        return CONSUME_SIGNAL;
    }

    private int handleTimer__b1_c2_b0_Publish_Handler_t2() {
        b008.msg = _b1_c2_b0_Publish_Handler_t2_data;
        if (b008.discardDueToFreshness()) {
            b008.getNext();
            scheduler.startBreak(_b1_c2_b0_Publish_Handler_t3);
            // step 2ebc2;
            return CONSUME_SIGNAL;
        } else {
            if (b008.isConnected()) {
                com.bitreactive.library.mqtt.publisher.Publisher.Parameters b008_o2 = b008.addClient();
                _b1_c2_b0_Publish_Handler_t0_data = b008_o2;
                scheduler.startBreak(_b1_c2_b0_Publish_Handler_t0);
                // step f13f5;
                return CONSUME_SIGNAL;
            } else {
                if (b008.discardDueToQos()) {
                    b008.getNext();
                    scheduler.startBreak(_b1_c2_b0_Publish_Handler_t3);
                    // step 0def9;
                    return CONSUME_SIGNAL;
                } else {
                    b008.toWait();
                    _b1_c2_b0_Publish_Handler_t2_data = b008.msg;
                    scheduler.startOrRestartTimer(_b1_c2_b0_Publish_Handler_t2);
                    // step ea09f;
                    return CONSUME_SIGNAL;
                }
            }
        }
    }

    private int handleTimer__b1_c2_b0_Publish_Handler_t3() {
        if (b009.isEmpty()) {
            b009_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm.READY;
            b009_state = Com_bitreactive_library_buffering_BufferEager.READY;
            // step 4c632;
            return CONSUME_SIGNAL;
        } else {
            b009.getFromBuffer();
            b008.msg = b009.out;
            if (b008.discardDueToFreshness()) {
                b008.getNext();
                scheduler.startBreak(_b1_c2_b0_Publish_Handler_t3);
                // step d5c43;
                return CONSUME_SIGNAL;
            } else {
                if (b008.isConnected()) {
                    com.bitreactive.library.mqtt.publisher.Publisher.Parameters b008_o2 = b008.addClient();
                    _b1_c2_b0_Publish_Handler_t0_data = b008_o2;
                    scheduler.startBreak(_b1_c2_b0_Publish_Handler_t0);
                    // step 76d39;
                    return CONSUME_SIGNAL;
                } else {
                    if (b008.discardDueToQos()) {
                        b008.getNext();
                        scheduler.startBreak(_b1_c2_b0_Publish_Handler_t3);
                        // step 0ef3c;
                        return CONSUME_SIGNAL;
                    } else {
                        b008.toWait();
                        _b1_c2_b0_Publish_Handler_t2_data = b008.msg;
                        scheduler.startOrRestartTimer(_b1_c2_b0_Publish_Handler_t2);
                        // step 58a26;
                        return CONSUME_SIGNAL;
                    }
                }
            }
        }
    }

    private int handleTimer__b1_c2_b0_c1_Buffer_Eager_t0() {
        if (b009_state == Com_bitreactive_library_buffering_BufferEager.FIRSTITEMADDED) {
            if (b009_stm_state == Com_bitreactive_library_buffering_BufferEager_Stm.FIRSTITEMADDED) {
                b009.getFromBuffer();
                b009_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm.ACTIVE;
                b008.msg = b009.out;
                if (b008.discardDueToFreshness()) {
                    b008.getNext();
                    scheduler.startBreak(_b1_c2_b0_Publish_Handler_t3);
                    b009_state = Com_bitreactive_library_buffering_BufferEager.ACTIVE;
                    // step b1371;
                    return CONSUME_SIGNAL;
                } else {
                    if (b008.isConnected()) {
                        com.bitreactive.library.mqtt.publisher.Publisher.Parameters b008_o2 = b008.addClient();
                        _b1_c2_b0_Publish_Handler_t0_data = b008_o2;
                        scheduler.startBreak(_b1_c2_b0_Publish_Handler_t0);
                        b009_state = Com_bitreactive_library_buffering_BufferEager.ACTIVE;
                        // step cb69b;
                        return CONSUME_SIGNAL;
                    } else {
                        if (b008.discardDueToQos()) {
                            b008.getNext();
                            scheduler.startBreak(_b1_c2_b0_Publish_Handler_t3);
                            b009_state = Com_bitreactive_library_buffering_BufferEager.ACTIVE;
                            // step a78eb;
                            return CONSUME_SIGNAL;
                        } else {
                            b008.toWait();
                            _b1_c2_b0_Publish_Handler_t2_data = b008.msg;
                            scheduler.startOrRestartTimer(_b1_c2_b0_Publish_Handler_t2);
                            b009_state = Com_bitreactive_library_buffering_BufferEager.ACTIVE;
                            // step c6b45;
                            return CONSUME_SIGNAL;
                        }
                    }
                }
            } else {
                return DISCARD_SIGNAL;
            }
        } else {
            return DISCARD_SIGNAL;
        }
    }

    private int handleTimer__b1_c2_b1_Publish_Handler_2_t0() {
        com.bitreactive.library.mqtt.MQTTMessage b013_o1 = b013.peek();
        if (b013_o1 == null) {
            b011.empty();
            int b011_o2 = b011.getDuration();
            scheduler.startOrRestartTimer(_b1_c2_b1_Publish_Handler_2_t0, b011_o2);
            // step cb18a;
            return CONSUME_SIGNAL;
        } else {
            b014.msg = b013_o1;
            if (b014.discardDueToFreshness()) {
                b014.getNext();
                scheduler.startBreak(_b1_c2_b1_Publish_Handler_2_t2);
                // step f4912;
                return CONSUME_SIGNAL;
            } else {
                if (b014.isConnected()) {
                    com.bitreactive.library.mqtt.publisher.Publisher.Parameters b014_o2 = b014.addClient();
                    _b1_c2_b1_Publish_Handler_2_t3_data = b014_o2;
                    scheduler.startBreak(_b1_c2_b1_Publish_Handler_2_t3);
                    // step 580c7;
                    return CONSUME_SIGNAL;
                } else {
                    if (b014.discardDueToQos()) {
                        b014.getNext();
                        scheduler.startBreak(_b1_c2_b1_Publish_Handler_2_t2);
                        // step 3ed7d;
                        return CONSUME_SIGNAL;
                    } else {
                        b014.toWait();
                        _b1_c2_b1_Publish_Handler_2_t1_data = b014.msg;
                        scheduler.startOrRestartTimer(_b1_c2_b1_Publish_Handler_2_t1);
                        // step 35233;
                        return CONSUME_SIGNAL;
                    }
                }
            }
        }
    }

    private int handleTimer__b1_c2_b1_Publish_Handler_2_t1() {
        b014.msg = _b1_c2_b1_Publish_Handler_2_t1_data;
        if (b014.discardDueToFreshness()) {
            b014.getNext();
            scheduler.startBreak(_b1_c2_b1_Publish_Handler_2_t2);
            // step c590a;
            return CONSUME_SIGNAL;
        } else {
            if (b014.isConnected()) {
                com.bitreactive.library.mqtt.publisher.Publisher.Parameters b014_o2 = b014.addClient();
                _b1_c2_b1_Publish_Handler_2_t3_data = b014_o2;
                scheduler.startBreak(_b1_c2_b1_Publish_Handler_2_t3);
                // step 6d968;
                return CONSUME_SIGNAL;
            } else {
                if (b014.discardDueToQos()) {
                    b014.getNext();
                    scheduler.startBreak(_b1_c2_b1_Publish_Handler_2_t2);
                    // step 10bc4;
                    return CONSUME_SIGNAL;
                } else {
                    b014.toWait();
                    _b1_c2_b1_Publish_Handler_2_t1_data = b014.msg;
                    scheduler.startOrRestartTimer(_b1_c2_b1_Publish_Handler_2_t1);
                    // step f998b;
                    return CONSUME_SIGNAL;
                }
            }
        }
    }

    private int handleTimer__b1_c2_b1_Publish_Handler_2_t2() {
        b013.remove();
        b013_REMOVED_r0 = true;
        b013_state = Com_bitreactive_library_buffering_PersistentBuffer.REMOVING;
        // step 83aba;
        return CONSUME_SIGNAL;
    }

    private int handleTimer__b1_c2_b1_Publish_Handler_2_t3() {
        b012.publish(_b1_c2_b1_Publish_Handler_2_t3_data);
        b012_PUB_OK_r0 = true;
        b012_PUB_ERROR_r1 = true;
        b012_state = Com_bitreactive_library_mqtt_Publisher.ACTIVE;
        // step 18a15;
        return CONSUME_SIGNAL;
    }

    private int handleTimer__b1_c3_Subscribe_Handler_t0() {
        b016.subscribe(b015.p);
        b016_SUBS_OK_r0 = true;
        b016_SUBS_ERROR_r1 = true;
        b016_state = Com_bitreactive_library_mqtt_Subscriber.ACTIVE;
        // step 22331;
        return CONSUME_SIGNAL;
    }

    private int handleTimer__b1_c3_c1_Timer_2_timer() {
        b016.subscribe(b015.p);
        b016_SUBS_OK_r0 = true;
        b016_SUBS_ERROR_r1 = true;
        b016_state = Com_bitreactive_library_mqtt_Subscriber.ACTIVE;
        b017_state = Com_bitreactive_library_timers_Timer2._IDLE;
        // step aa3d3;
        return CONSUME_SIGNAL;
    }

    private int handleEvent_FAILED_b002(java.lang.Object _sender, java.lang.Object receiverSessionID, java.lang.Object _data) {
        if (b002_FAILED_r0) {
            b001.shutdown();
            b004.stop();
            b005.stop();
            if (b017_state == Com_bitreactive_library_timers_Timer2._IDLE) {
                if (b016_state == Com_bitreactive_library_mqtt_Subscriber._IDLE) {
                    b016.stop();
                    if (b011_state == Com_bitreactive_library_mqtt_PublishHandler2._IDLE) {
                        b012.stopped();
                        if (b010_state == Com_bitreactive_library_mqtt_Publisher._IDLE) {
                            b010.stopped();
                            if (b009_state == Com_bitreactive_library_buffering_BufferEager.ACTIVE) {
                                b009.emptyBuffer();
                                b009_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm._IDLE;
                                scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                                // step 0b02e;
                                return TERMINATE_MACHINE;
                            } else if (b009_state == Com_bitreactive_library_buffering_BufferEager.FIRSTITEMADDED) {
                                b009.emptyBuffer();
                                b009_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm._IDLE;
                                scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                                // step b81c2;
                                return TERMINATE_MACHINE;
                            } else if (b009_state == Com_bitreactive_library_buffering_BufferEager.READY) {
                                b009_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm._IDLE;
                                scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                                // step 38f40;
                                return TERMINATE_MACHINE;
                            } else {
                                return DISCARD_SIGNAL;
                            }
                        } else if (b010_state == Com_bitreactive_library_mqtt_Publisher.ACTIVE) {
                            b010.stopped();
                            b009.emptyBuffer();
                            b009_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm._IDLE;
                            scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                            // step cf8fe;
                            return TERMINATE_MACHINE;
                        } else {
                            return DISCARD_SIGNAL;
                        }
                    } else if (b011_state == Com_bitreactive_library_mqtt_PublishHandler2.ACTIVE) {
                        if (b012_state == Com_bitreactive_library_mqtt_Publisher._IDLE) {
                            b012.stopped();
                            b010.stopped();
                            scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                            // step 2d610;
                            return TERMINATE_MACHINE;
                        } else if (b012_state == Com_bitreactive_library_mqtt_Publisher.ACTIVE) {
                            b012.stopped();
                            b010.stopped();
                            scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                            // step 68ded;
                            return TERMINATE_MACHINE;
                        } else {
                            return DISCARD_SIGNAL;
                        }
                    } else {
                        return DISCARD_SIGNAL;
                    }
                } else if (b016_state == Com_bitreactive_library_mqtt_Subscriber.ACTIVE) {
                    b016.stop();
                    if (b011_state == Com_bitreactive_library_mqtt_PublishHandler2._IDLE) {
                        b012.stopped();
                        if (b010_state == Com_bitreactive_library_mqtt_Publisher._IDLE) {
                            b010.stopped();
                            if (b009_state == Com_bitreactive_library_buffering_BufferEager.ACTIVE) {
                                b009.emptyBuffer();
                                b009_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm._IDLE;
                                scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                                // step 0e90a;
                                return TERMINATE_MACHINE;
                            } else if (b009_state == Com_bitreactive_library_buffering_BufferEager.FIRSTITEMADDED) {
                                b009.emptyBuffer();
                                b009_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm._IDLE;
                                scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                                // step 9fd90;
                                return TERMINATE_MACHINE;
                            } else if (b009_state == Com_bitreactive_library_buffering_BufferEager.READY) {
                                b009_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm._IDLE;
                                scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                                // step 77896;
                                return TERMINATE_MACHINE;
                            } else {
                                return DISCARD_SIGNAL;
                            }
                        } else if (b010_state == Com_bitreactive_library_mqtt_Publisher.ACTIVE) {
                            b010.stopped();
                            b009.emptyBuffer();
                            b009_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm._IDLE;
                            scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                            // step e873a;
                            return TERMINATE_MACHINE;
                        } else {
                            return DISCARD_SIGNAL;
                        }
                    } else if (b011_state == Com_bitreactive_library_mqtt_PublishHandler2.ACTIVE) {
                        if (b012_state == Com_bitreactive_library_mqtt_Publisher._IDLE) {
                            b012.stopped();
                            b010.stopped();
                            scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                            // step 6de0a;
                            return TERMINATE_MACHINE;
                        } else if (b012_state == Com_bitreactive_library_mqtt_Publisher.ACTIVE) {
                            b012.stopped();
                            b010.stopped();
                            scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                            // step 5e851;
                            return TERMINATE_MACHINE;
                        } else {
                            return DISCARD_SIGNAL;
                        }
                    } else {
                        return DISCARD_SIGNAL;
                    }
                } else {
                    return DISCARD_SIGNAL;
                }
            } else if (b017_state == Com_bitreactive_library_timers_Timer2.ACTIVE) {
                b016.stop();
                if (b011_state == Com_bitreactive_library_mqtt_PublishHandler2._IDLE) {
                    b012.stopped();
                    if (b010_state == Com_bitreactive_library_mqtt_Publisher._IDLE) {
                        b010.stopped();
                        if (b009_state == Com_bitreactive_library_buffering_BufferEager.ACTIVE) {
                            b009.emptyBuffer();
                            b009_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm._IDLE;
                            scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                            // step cec91;
                            return TERMINATE_MACHINE;
                        } else if (b009_state == Com_bitreactive_library_buffering_BufferEager.FIRSTITEMADDED) {
                            b009.emptyBuffer();
                            b009_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm._IDLE;
                            scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                            // step 8dff1;
                            return TERMINATE_MACHINE;
                        } else if (b009_state == Com_bitreactive_library_buffering_BufferEager.READY) {
                            b009_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm._IDLE;
                            scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                            // step ab50d;
                            return TERMINATE_MACHINE;
                        } else {
                            return DISCARD_SIGNAL;
                        }
                    } else if (b010_state == Com_bitreactive_library_mqtt_Publisher.ACTIVE) {
                        b010.stopped();
                        b009.emptyBuffer();
                        b009_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm._IDLE;
                        scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                        // step 94e67;
                        return TERMINATE_MACHINE;
                    } else {
                        return DISCARD_SIGNAL;
                    }
                } else if (b011_state == Com_bitreactive_library_mqtt_PublishHandler2.ACTIVE) {
                    if (b012_state == Com_bitreactive_library_mqtt_Publisher._IDLE) {
                        b012.stopped();
                        b010.stopped();
                        scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                        // step 40e51;
                        return TERMINATE_MACHINE;
                    } else if (b012_state == Com_bitreactive_library_mqtt_Publisher.ACTIVE) {
                        b012.stopped();
                        b010.stopped();
                        scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                        // step 6f8e6;
                        return TERMINATE_MACHINE;
                    } else {
                        return DISCARD_SIGNAL;
                    }
                } else {
                    return DISCARD_SIGNAL;
                }
            } else {
                return DISCARD_SIGNAL;
            }
        } else {
            return DISCARD_SIGNAL;
        }
    }

    private int handleEvent_SUCCESS_b002(java.lang.Object _sender, java.lang.Object receiverSessionID, java.lang.Object _data) {
        if (b002_SUCCESS_r1) {
            int b001_o4 = b001.getInterval();
            b000.printCO2(((java.lang.String) _data));
            com.bitreactive.library.mqtt.MQTTMessage b000_o2 = b000.createMSG(((java.lang.String) _data));
            if (b011_state == Com_bitreactive_library_mqtt_PublishHandler2.ACTIVE) {
                b014.msg = b000_o2;
                if (b014.isConnected()) {
                    b014.buffer();
                    if (b013_state == Com_bitreactive_library_buffering_PersistentBuffer.ACTIVE) {
                        b013.add(b014.msg);
                        scheduler.startOrRestartTimer(_b0_CO2Sensor_t0, b001_o4);
                        b002_FAILED_r0 = false;
                        scheduler.flushEventQueue(sessionID, "FAILED_b002");
                        b002_SUCCESS_r1 = false;
                        scheduler.flushEventQueue(sessionID, "SUCCESS_b002");
                        // step fa370;
                        return CONSUME_SIGNAL;
                    } else if (b013_state == Com_bitreactive_library_buffering_PersistentBuffer.REMOVING) {
                        b013.add(b014.msg);
                        scheduler.startOrRestartTimer(_b0_CO2Sensor_t0, b001_o4);
                        b002_FAILED_r0 = false;
                        scheduler.flushEventQueue(sessionID, "FAILED_b002");
                        b002_SUCCESS_r1 = false;
                        scheduler.flushEventQueue(sessionID, "SUCCESS_b002");
                        // step 9953d;
                        return CONSUME_SIGNAL;
                    } else {
                        return DISCARD_SIGNAL;
                    }
                } else {
                    if (b014.discardDueToQos()) {
                        scheduler.startOrRestartTimer(_b0_CO2Sensor_t0, b001_o4);
                        b002_FAILED_r0 = false;
                        scheduler.flushEventQueue(sessionID, "FAILED_b002");
                        b002_SUCCESS_r1 = false;
                        scheduler.flushEventQueue(sessionID, "SUCCESS_b002");
                        // step 72d9b;
                        return CONSUME_SIGNAL;
                    } else {
                        b014.buffer();
                        if (b013_state == Com_bitreactive_library_buffering_PersistentBuffer.ACTIVE) {
                            b013.add(b014.msg);
                            scheduler.startOrRestartTimer(_b0_CO2Sensor_t0, b001_o4);
                            b002_FAILED_r0 = false;
                            scheduler.flushEventQueue(sessionID, "FAILED_b002");
                            b002_SUCCESS_r1 = false;
                            scheduler.flushEventQueue(sessionID, "SUCCESS_b002");
                            // step 3c359;
                            return CONSUME_SIGNAL;
                        } else if (b013_state == Com_bitreactive_library_buffering_PersistentBuffer.REMOVING) {
                            b013.add(b014.msg);
                            scheduler.startOrRestartTimer(_b0_CO2Sensor_t0, b001_o4);
                            b002_FAILED_r0 = false;
                            scheduler.flushEventQueue(sessionID, "FAILED_b002");
                            b002_SUCCESS_r1 = false;
                            scheduler.flushEventQueue(sessionID, "SUCCESS_b002");
                            // step 55292;
                            return CONSUME_SIGNAL;
                        } else {
                            return DISCARD_SIGNAL;
                        }
                    }
                }
            } else if (b007_state == Com_bitreactive_library_mqtt_PublishHandler.ACTIVE) {
                b008.msg = b000_o2;
                if (b008.isConnected()) {
                    b008.buffer();
                    if (b009_state == Com_bitreactive_library_buffering_BufferEager.ACTIVE) {
                        b009.add = b008.msg;
                        if (b009.hasRoom()) {
                            b009.addToBuffer();
                            scheduler.startOrRestartTimer(_b0_CO2Sensor_t0, b001_o4);
                            b002_FAILED_r0 = false;
                            scheduler.flushEventQueue(sessionID, "FAILED_b002");
                            b002_SUCCESS_r1 = false;
                            scheduler.flushEventQueue(sessionID, "SUCCESS_b002");
                            // step ff9a9;
                            return CONSUME_SIGNAL;
                        } else {
                            b007.overflow(b009.overflow);
                            scheduler.startOrRestartTimer(_b0_CO2Sensor_t0, b001_o4);
                            b002_FAILED_r0 = false;
                            scheduler.flushEventQueue(sessionID, "FAILED_b002");
                            b002_SUCCESS_r1 = false;
                            scheduler.flushEventQueue(sessionID, "SUCCESS_b002");
                            // step 70ef0;
                            return CONSUME_SIGNAL;
                        }
                    } else if (b009_state == Com_bitreactive_library_buffering_BufferEager.FIRSTITEMADDED) {
                        b009.add = b008.msg;
                        if (b009.hasRoom()) {
                            b009.addToBuffer();
                            scheduler.startOrRestartTimer(_b0_CO2Sensor_t0, b001_o4);
                            b002_FAILED_r0 = false;
                            scheduler.flushEventQueue(sessionID, "FAILED_b002");
                            b002_SUCCESS_r1 = false;
                            scheduler.flushEventQueue(sessionID, "SUCCESS_b002");
                            // step e5e8e;
                            return CONSUME_SIGNAL;
                        } else {
                            b007.overflow(b009.overflow);
                            scheduler.startOrRestartTimer(_b0_CO2Sensor_t0, b001_o4);
                            b002_FAILED_r0 = false;
                            scheduler.flushEventQueue(sessionID, "FAILED_b002");
                            b002_SUCCESS_r1 = false;
                            scheduler.flushEventQueue(sessionID, "SUCCESS_b002");
                            // step 0dab6;
                            return CONSUME_SIGNAL;
                        }
                    } else if (b009_state == Com_bitreactive_library_buffering_BufferEager.READY) {
                        b009.add = b008.msg;
                        b009.addToBuffer();
                        scheduler.startBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                        b009_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm.FIRSTITEMADDED;
                        scheduler.startOrRestartTimer(_b0_CO2Sensor_t0, b001_o4);
                        b002_FAILED_r0 = false;
                        scheduler.flushEventQueue(sessionID, "FAILED_b002");
                        b002_SUCCESS_r1 = false;
                        scheduler.flushEventQueue(sessionID, "SUCCESS_b002");
                        b009_state = Com_bitreactive_library_buffering_BufferEager.FIRSTITEMADDED;
                        // step 28075;
                        return CONSUME_SIGNAL;
                    } else {
                        return DISCARD_SIGNAL;
                    }
                } else {
                    if (b008.discardDueToQos()) {
                        scheduler.startOrRestartTimer(_b0_CO2Sensor_t0, b001_o4);
                        b002_FAILED_r0 = false;
                        scheduler.flushEventQueue(sessionID, "FAILED_b002");
                        b002_SUCCESS_r1 = false;
                        scheduler.flushEventQueue(sessionID, "SUCCESS_b002");
                        // step 5fc73;
                        return CONSUME_SIGNAL;
                    } else {
                        b008.buffer();
                        if (b009_state == Com_bitreactive_library_buffering_BufferEager.ACTIVE) {
                            b009.add = b008.msg;
                            if (b009.hasRoom()) {
                                b009.addToBuffer();
                                scheduler.startOrRestartTimer(_b0_CO2Sensor_t0, b001_o4);
                                b002_FAILED_r0 = false;
                                scheduler.flushEventQueue(sessionID, "FAILED_b002");
                                b002_SUCCESS_r1 = false;
                                scheduler.flushEventQueue(sessionID, "SUCCESS_b002");
                                // step 6c987;
                                return CONSUME_SIGNAL;
                            } else {
                                b007.overflow(b009.overflow);
                                scheduler.startOrRestartTimer(_b0_CO2Sensor_t0, b001_o4);
                                b002_FAILED_r0 = false;
                                scheduler.flushEventQueue(sessionID, "FAILED_b002");
                                b002_SUCCESS_r1 = false;
                                scheduler.flushEventQueue(sessionID, "SUCCESS_b002");
                                // step 827d8;
                                return CONSUME_SIGNAL;
                            }
                        } else if (b009_state == Com_bitreactive_library_buffering_BufferEager.FIRSTITEMADDED) {
                            b009.add = b008.msg;
                            if (b009.hasRoom()) {
                                b009.addToBuffer();
                                scheduler.startOrRestartTimer(_b0_CO2Sensor_t0, b001_o4);
                                b002_FAILED_r0 = false;
                                scheduler.flushEventQueue(sessionID, "FAILED_b002");
                                b002_SUCCESS_r1 = false;
                                scheduler.flushEventQueue(sessionID, "SUCCESS_b002");
                                // step dffc1;
                                return CONSUME_SIGNAL;
                            } else {
                                b007.overflow(b009.overflow);
                                scheduler.startOrRestartTimer(_b0_CO2Sensor_t0, b001_o4);
                                b002_FAILED_r0 = false;
                                scheduler.flushEventQueue(sessionID, "FAILED_b002");
                                b002_SUCCESS_r1 = false;
                                scheduler.flushEventQueue(sessionID, "SUCCESS_b002");
                                // step 682ee;
                                return CONSUME_SIGNAL;
                            }
                        } else if (b009_state == Com_bitreactive_library_buffering_BufferEager.READY) {
                            b009.add = b008.msg;
                            b009.addToBuffer();
                            scheduler.startBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                            b009_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm.FIRSTITEMADDED;
                            scheduler.startOrRestartTimer(_b0_CO2Sensor_t0, b001_o4);
                            b002_FAILED_r0 = false;
                            scheduler.flushEventQueue(sessionID, "FAILED_b002");
                            b002_SUCCESS_r1 = false;
                            scheduler.flushEventQueue(sessionID, "SUCCESS_b002");
                            b009_state = Com_bitreactive_library_buffering_BufferEager.FIRSTITEMADDED;
                            // step 28b33;
                            return CONSUME_SIGNAL;
                        } else {
                            return DISCARD_SIGNAL;
                        }
                    }
                }
            } else {
                return BLOCKING_CHOICE;
            }
        } else {
            return DISCARD_SIGNAL;
        }
    }

    private int handleEvent_CONN_LOST_b004(java.lang.Object _sender, java.lang.Object receiverSessionID, java.lang.Object _data) {
        if (b004_CONN_LOST_r0) {
            b003.connLost(((java.lang.String) _data));
            if (b005_state == Com_bitreactive_library_mqtt_ConnHandler.ACTIVE) {
                boolean b005_o5 = b005.tryReconnect();
                if (b005_o5 == true) {
                    // step 22acb;
                    return CONSUME_SIGNAL;
                } else {
                    b005.reconnect();
                    b005_RECONN_OK_r2 = true;
                    b005_RECONN_FAILED_r3 = true;
                    // step f9138;
                    return CONSUME_SIGNAL;
                }
            } else {
                // step 4cae9;
                return CONSUME_SIGNAL;
            }
        } else {
            return DISCARD_SIGNAL;
        }
    }

    private int handleEvent_MSG_ARRIVED_b004(java.lang.Object _sender, java.lang.Object receiverSessionID, java.lang.Object _data) {
        if (b004_MSG_ARRIVED_r2) {
            if (b003_state == Com_bitreactive_library_mqtt_RobustMQTT.ACTIVE) {
                // step bb4cf;
                return CONSUME_SIGNAL;
            } else {
                // step 57708;
                return CONSUME_SIGNAL;
            }
        } else {
            return DISCARD_SIGNAL;
        }
    }

    private int handleEvent_INIT_OK_b005(java.lang.Object _sender, java.lang.Object receiverSessionID, java.lang.Object _data) {
        if (b005_INIT_OK_r0) {
            if (b005_state == Com_bitreactive_library_mqtt_ConnHandler.INITIALIZING) {
                b003.client = ((org.eclipse.paho.client.mqttv3.MqttClient) _data);
                com.bitreactive.library.mqtt.subscriber.Subscriber.Parameters b003_o2 = b003.getSubscribeParam();
                b015.p = b003_o2;
                if (b015.containTopic()) {
                    b016.stop();
                    com.bitreactive.library.mqtt.publishmanager.PublishManager.Parameters b003_o3 = b003.getPublishParam();
                    b006.p = b003_o3;
                    boolean b006_o0 = b006.usePersistent();
                    if (b006_o0 == true) {
                        com.bitreactive.library.mqtt.publishhandler2.PublishHandler2.Parameters b006_o2 = b006.createParam2();
                        b011.p = b006_o2;
                        java.lang.String b011_o0 = b011.getFilename();
                        com.bitreactive.library.mqtt.publishpolicy.PublishPolicy.Parameters b011_o5 = b011.getParams();
                        b013.init(b011_o0);
                        b014.p = b011_o5;
                        scheduler.stopTimer(_b1_c3_c1_Timer_2_timer);
                        scheduler.startBreak(_b1_c3_Subscribe_Handler_t0);
                        b005_INIT_OK_r0 = false;
                        b016_SUBS_OK_r0 = false;
                        scheduler.flushEventQueue(sessionID, "SUBS_OK_b016");
                        b016_SUBS_ERROR_r1 = false;
                        scheduler.flushEventQueue(sessionID, "SUBS_ERROR_b016");
                        b013_INIT_r1 = true;
                        b005_state = Com_bitreactive_library_mqtt_ConnHandler.ACTIVE;
                        b011_state = Com_bitreactive_library_mqtt_PublishHandler2.INITIALIZING;
                        b013_state = Com_bitreactive_library_buffering_PersistentBuffer.INITIALIZING;
                        // step 832de;
                        return CONSUME_SIGNAL;
                    } else {
                        com.bitreactive.library.mqtt.publishpolicy.PublishPolicy.Parameters b006_o1 = b006.createParam();
                        b008.p = b006_o1;
                        b009.emptyBuffer();
                        b009_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm.READY;
                        scheduler.stopTimer(_b1_c3_c1_Timer_2_timer);
                        scheduler.startBreak(_b1_c2_Publish_Manager_t0);
                        scheduler.startBreak(_b1_c3_Subscribe_Handler_t0);
                        b005_INIT_OK_r0 = false;
                        b016_SUBS_OK_r0 = false;
                        scheduler.flushEventQueue(sessionID, "SUBS_OK_b016");
                        b016_SUBS_ERROR_r1 = false;
                        scheduler.flushEventQueue(sessionID, "SUBS_ERROR_b016");
                        b005_state = Com_bitreactive_library_mqtt_ConnHandler.ACTIVE;
                        b007_state = Com_bitreactive_library_mqtt_PublishHandler.ACTIVE;
                        b009_state = Com_bitreactive_library_buffering_BufferEager.READY;
                        // step 5b5d4;
                        return CONSUME_SIGNAL;
                    }
                } else {
                    com.bitreactive.library.mqtt.publishmanager.PublishManager.Parameters b003_o3 = b003.getPublishParam();
                    b006.p = b003_o3;
                    boolean b006_o0 = b006.usePersistent();
                    if (b006_o0 == true) {
                        com.bitreactive.library.mqtt.publishhandler2.PublishHandler2.Parameters b006_o2 = b006.createParam2();
                        b011.p = b006_o2;
                        java.lang.String b011_o0 = b011.getFilename();
                        com.bitreactive.library.mqtt.publishpolicy.PublishPolicy.Parameters b011_o5 = b011.getParams();
                        b013.init(b011_o0);
                        b014.p = b011_o5;
                        b005_INIT_OK_r0 = false;
                        b013_INIT_r1 = true;
                        b005_state = Com_bitreactive_library_mqtt_ConnHandler.ACTIVE;
                        b011_state = Com_bitreactive_library_mqtt_PublishHandler2.INITIALIZING;
                        b013_state = Com_bitreactive_library_buffering_PersistentBuffer.INITIALIZING;
                        // step dcef1;
                        return CONSUME_SIGNAL;
                    } else {
                        com.bitreactive.library.mqtt.publishpolicy.PublishPolicy.Parameters b006_o1 = b006.createParam();
                        b008.p = b006_o1;
                        b009.emptyBuffer();
                        b009_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm.READY;
                        scheduler.startBreak(_b1_c2_Publish_Manager_t0);
                        b005_INIT_OK_r0 = false;
                        b005_state = Com_bitreactive_library_mqtt_ConnHandler.ACTIVE;
                        b007_state = Com_bitreactive_library_mqtt_PublishHandler.ACTIVE;
                        b009_state = Com_bitreactive_library_buffering_BufferEager.READY;
                        // step 89a29;
                        return CONSUME_SIGNAL;
                    }
                }
            } else {
                b005_INIT_OK_r0 = false;
                // step 116f9;
                return CONSUME_SIGNAL;
            }
        } else {
            return DISCARD_SIGNAL;
        }
    }

    private int handleEvent_INIT_FAILED_b005(java.lang.Object _sender, java.lang.Object receiverSessionID, java.lang.Object _data) {
        if (b005_INIT_FAILED_r1) {
            int b005_o4 = b005.getWaitingDuration();
            scheduler.startOrRestartTimer(_b1_c1_Conn_Handler_t1, b005_o4);
            b005_INIT_FAILED_r1 = false;
            // step 8fa8d;
            return CONSUME_SIGNAL;
        } else {
            return DISCARD_SIGNAL;
        }
    }

    private int handleEvent_RECONN_OK_b005(java.lang.Object _sender, java.lang.Object receiverSessionID, java.lang.Object _data) {
        if (b005_RECONN_OK_r2) {
            if (b015.containTopic()) {
                if (b017_state == Com_bitreactive_library_timers_Timer2._IDLE) {
                    if (b016_state == Com_bitreactive_library_mqtt_Subscriber._IDLE) {
                        b016.stop();
                        scheduler.stopTimer(_b1_c3_c1_Timer_2_timer);
                        scheduler.startBreak(_b1_c3_Subscribe_Handler_t0);
                        b005_RECONN_OK_r2 = false;
                        b016_SUBS_OK_r0 = false;
                        scheduler.flushEventQueue(sessionID, "SUBS_OK_b016");
                        b016_SUBS_ERROR_r1 = false;
                        scheduler.flushEventQueue(sessionID, "SUBS_ERROR_b016");
                        // step 8ef1b;
                        return CONSUME_SIGNAL;
                    } else if (b016_state == Com_bitreactive_library_mqtt_Subscriber.ACTIVE) {
                        b016.stop();
                        scheduler.stopTimer(_b1_c3_c1_Timer_2_timer);
                        scheduler.startBreak(_b1_c3_Subscribe_Handler_t0);
                        b005_RECONN_OK_r2 = false;
                        b016_SUBS_OK_r0 = false;
                        scheduler.flushEventQueue(sessionID, "SUBS_OK_b016");
                        b016_SUBS_ERROR_r1 = false;
                        scheduler.flushEventQueue(sessionID, "SUBS_ERROR_b016");
                        b016_state = Com_bitreactive_library_mqtt_Subscriber._IDLE;
                        // step 79415;
                        return CONSUME_SIGNAL;
                    } else {
                        return DISCARD_SIGNAL;
                    }
                } else if (b017_state == Com_bitreactive_library_timers_Timer2.ACTIVE) {
                    b016.stop();
                    scheduler.stopTimer(_b1_c3_c1_Timer_2_timer);
                    scheduler.startBreak(_b1_c3_Subscribe_Handler_t0);
                    b005_RECONN_OK_r2 = false;
                    b016_SUBS_OK_r0 = false;
                    scheduler.flushEventQueue(sessionID, "SUBS_OK_b016");
                    b016_SUBS_ERROR_r1 = false;
                    scheduler.flushEventQueue(sessionID, "SUBS_ERROR_b016");
                    b017_state = Com_bitreactive_library_timers_Timer2._IDLE;
                    // step 15a39;
                    return CONSUME_SIGNAL;
                } else {
                    return DISCARD_SIGNAL;
                }
            } else {
                b005_RECONN_OK_r2 = false;
                // step 7f206;
                return CONSUME_SIGNAL;
            }
        } else {
            return DISCARD_SIGNAL;
        }
    }

    private int handleEvent_RECONN_FAILED_b005(java.lang.Object _sender, java.lang.Object receiverSessionID, java.lang.Object _data) {
        if (b005_RECONN_FAILED_r3) {
            int b005_o3 = b005.getWaitingDuration();
            scheduler.startOrRestartTimer(_b1_c1_Conn_Handler_t0, b005_o3);
            b005_RECONN_FAILED_r3 = false;
            // step 4d10f;
            return CONSUME_SIGNAL;
        } else {
            return DISCARD_SIGNAL;
        }
    }

    private int handleEvent_PUB_OK_b010(java.lang.Object _sender, java.lang.Object receiverSessionID, java.lang.Object _data) {
        if (b010_PUB_OK_r0) {
            if (b009.isEmpty()) {
                b009_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm.READY;
                b010_PUB_OK_r0 = false;
                scheduler.flushEventQueue(sessionID, "PUB_OK_b010");
                b010_PUB_ERROR_r1 = false;
                scheduler.flushEventQueue(sessionID, "PUB_ERROR_b010");
                b009_state = Com_bitreactive_library_buffering_BufferEager.READY;
                b010_state = Com_bitreactive_library_mqtt_Publisher._IDLE;
                // step 3f0c6;
                return CONSUME_SIGNAL;
            } else {
                b009.getFromBuffer();
                b008.msg = b009.out;
                if (b008.discardDueToFreshness()) {
                    b008.getNext();
                    scheduler.startBreak(_b1_c2_b0_Publish_Handler_t3);
                    b010_PUB_OK_r0 = false;
                    scheduler.flushEventQueue(sessionID, "PUB_OK_b010");
                    b010_PUB_ERROR_r1 = false;
                    scheduler.flushEventQueue(sessionID, "PUB_ERROR_b010");
                    b010_state = Com_bitreactive_library_mqtt_Publisher._IDLE;
                    // step afd78;
                    return CONSUME_SIGNAL;
                } else {
                    if (b008.isConnected()) {
                        com.bitreactive.library.mqtt.publisher.Publisher.Parameters b008_o2 = b008.addClient();
                        _b1_c2_b0_Publish_Handler_t0_data = b008_o2;
                        scheduler.startBreak(_b1_c2_b0_Publish_Handler_t0);
                        b010_PUB_OK_r0 = false;
                        scheduler.flushEventQueue(sessionID, "PUB_OK_b010");
                        b010_PUB_ERROR_r1 = false;
                        scheduler.flushEventQueue(sessionID, "PUB_ERROR_b010");
                        b010_state = Com_bitreactive_library_mqtt_Publisher._IDLE;
                        // step 4cee6;
                        return CONSUME_SIGNAL;
                    } else {
                        if (b008.discardDueToQos()) {
                            b008.getNext();
                            scheduler.startBreak(_b1_c2_b0_Publish_Handler_t3);
                            b010_PUB_OK_r0 = false;
                            scheduler.flushEventQueue(sessionID, "PUB_OK_b010");
                            b010_PUB_ERROR_r1 = false;
                            scheduler.flushEventQueue(sessionID, "PUB_ERROR_b010");
                            b010_state = Com_bitreactive_library_mqtt_Publisher._IDLE;
                            // step fd167;
                            return CONSUME_SIGNAL;
                        } else {
                            b008.toWait();
                            _b1_c2_b0_Publish_Handler_t2_data = b008.msg;
                            scheduler.startOrRestartTimer(_b1_c2_b0_Publish_Handler_t2);
                            b010_PUB_OK_r0 = false;
                            scheduler.flushEventQueue(sessionID, "PUB_OK_b010");
                            b010_PUB_ERROR_r1 = false;
                            scheduler.flushEventQueue(sessionID, "PUB_ERROR_b010");
                            b010_state = Com_bitreactive_library_mqtt_Publisher._IDLE;
                            // step 5d2b8;
                            return CONSUME_SIGNAL;
                        }
                    }
                }
            }
        } else {
            return DISCARD_SIGNAL;
        }
    }

    private int handleEvent_PUB_ERROR_b010(java.lang.Object _sender, java.lang.Object receiverSessionID, java.lang.Object _data) {
        if (b010_PUB_ERROR_r1) {
            b008.msg = ((com.bitreactive.library.mqtt.MQTTMessage) _data);
            if (b008.discardDueToFreshness()) {
                b008.getNext();
                scheduler.startBreak(_b1_c2_b0_Publish_Handler_t3);
                b010_PUB_OK_r0 = false;
                scheduler.flushEventQueue(sessionID, "PUB_OK_b010");
                b010_PUB_ERROR_r1 = false;
                scheduler.flushEventQueue(sessionID, "PUB_ERROR_b010");
                b010_state = Com_bitreactive_library_mqtt_Publisher._IDLE;
                // step 2e63e;
                return CONSUME_SIGNAL;
            } else {
                if (b008.discardDueToQos()) {
                    b008.getNext();
                    scheduler.startBreak(_b1_c2_b0_Publish_Handler_t3);
                    b010_PUB_OK_r0 = false;
                    scheduler.flushEventQueue(sessionID, "PUB_OK_b010");
                    b010_PUB_ERROR_r1 = false;
                    scheduler.flushEventQueue(sessionID, "PUB_ERROR_b010");
                    b010_state = Com_bitreactive_library_mqtt_Publisher._IDLE;
                    // step 11297;
                    return CONSUME_SIGNAL;
                } else {
                    com.bitreactive.library.mqtt.publisher.Publisher.Parameters b008_o2 = b008.addClient();
                    _b1_c2_b0_Publish_Handler_t0_data = b008_o2;
                    scheduler.startBreak(_b1_c2_b0_Publish_Handler_t0);
                    b010_PUB_OK_r0 = false;
                    scheduler.flushEventQueue(sessionID, "PUB_OK_b010");
                    b010_PUB_ERROR_r1 = false;
                    scheduler.flushEventQueue(sessionID, "PUB_ERROR_b010");
                    b010_state = Com_bitreactive_library_mqtt_Publisher._IDLE;
                    // step dad2f;
                    return CONSUME_SIGNAL;
                }
            }
        } else {
            return DISCARD_SIGNAL;
        }
    }

    private int handleEvent_PUB_OK_b012(java.lang.Object _sender, java.lang.Object receiverSessionID, java.lang.Object _data) {
        if (b012_PUB_OK_r0) {
            b013.remove();
            b012_PUB_OK_r0 = false;
            scheduler.flushEventQueue(sessionID, "PUB_OK_b012");
            b012_PUB_ERROR_r1 = false;
            scheduler.flushEventQueue(sessionID, "PUB_ERROR_b012");
            b013_REMOVED_r0 = true;
            b012_state = Com_bitreactive_library_mqtt_Publisher._IDLE;
            b013_state = Com_bitreactive_library_buffering_PersistentBuffer.REMOVING;
            // step ae94f;
            return CONSUME_SIGNAL;
        } else {
            return DISCARD_SIGNAL;
        }
    }

    private int handleEvent_PUB_ERROR_b012(java.lang.Object _sender, java.lang.Object receiverSessionID, java.lang.Object _data) {
        if (b012_PUB_ERROR_r1) {
            b014.msg = ((com.bitreactive.library.mqtt.MQTTMessage) _data);
            if (b014.discardDueToFreshness()) {
                b014.getNext();
                scheduler.startBreak(_b1_c2_b1_Publish_Handler_2_t2);
                b012_PUB_OK_r0 = false;
                scheduler.flushEventQueue(sessionID, "PUB_OK_b012");
                b012_PUB_ERROR_r1 = false;
                scheduler.flushEventQueue(sessionID, "PUB_ERROR_b012");
                b012_state = Com_bitreactive_library_mqtt_Publisher._IDLE;
                // step 839d5;
                return CONSUME_SIGNAL;
            } else {
                if (b014.discardDueToQos()) {
                    b014.getNext();
                    scheduler.startBreak(_b1_c2_b1_Publish_Handler_2_t2);
                    b012_PUB_OK_r0 = false;
                    scheduler.flushEventQueue(sessionID, "PUB_OK_b012");
                    b012_PUB_ERROR_r1 = false;
                    scheduler.flushEventQueue(sessionID, "PUB_ERROR_b012");
                    b012_state = Com_bitreactive_library_mqtt_Publisher._IDLE;
                    // step ea271;
                    return CONSUME_SIGNAL;
                } else {
                    com.bitreactive.library.mqtt.publisher.Publisher.Parameters b014_o2 = b014.addClient();
                    _b1_c2_b1_Publish_Handler_2_t3_data = b014_o2;
                    scheduler.startBreak(_b1_c2_b1_Publish_Handler_2_t3);
                    b012_PUB_OK_r0 = false;
                    scheduler.flushEventQueue(sessionID, "PUB_OK_b012");
                    b012_PUB_ERROR_r1 = false;
                    scheduler.flushEventQueue(sessionID, "PUB_ERROR_b012");
                    b012_state = Com_bitreactive_library_mqtt_Publisher._IDLE;
                    // step cdb3b;
                    return CONSUME_SIGNAL;
                }
            }
        } else {
            return DISCARD_SIGNAL;
        }
    }

    private int handleEvent_REMOVED_b013(java.lang.Object _sender, java.lang.Object receiverSessionID, java.lang.Object _data) {
        if (b013_REMOVED_r0) {
            if (((com.bitreactive.library.mqtt.MQTTMessage) _data) == null) {
                b011.empty();
                int b011_o2 = b011.getDuration();
                scheduler.startOrRestartTimer(_b1_c2_b1_Publish_Handler_2_t0, b011_o2);
                b013_REMOVED_r0 = false;
                b013_state = Com_bitreactive_library_buffering_PersistentBuffer.ACTIVE;
                // step bf021;
                return CONSUME_SIGNAL;
            } else {
                b011.removed();
                int b011_o2 = b011.getDuration();
                scheduler.startOrRestartTimer(_b1_c2_b1_Publish_Handler_2_t0, b011_o2);
                b013_REMOVED_r0 = false;
                b013_state = Com_bitreactive_library_buffering_PersistentBuffer.ACTIVE;
                // step 490ed;
                return CONSUME_SIGNAL;
            }
        } else {
            return DISCARD_SIGNAL;
        }
    }

    private int handleEvent_INIT_b013(java.lang.Object _sender, java.lang.Object receiverSessionID, java.lang.Object _data) {
        if (b013_INIT_r1) {
            int b011_o2 = b011.getDuration();
            com.pi4j.io.serial.Serial b001_o0 = b001.getSerial();
            b002.requestData(b001_o0);
            scheduler.startOrRestartTimer(_b1_c2_b1_Publish_Handler_2_t0, b011_o2);
            b013_INIT_r1 = false;
            b002_FAILED_r0 = true;
            b002_SUCCESS_r1 = true;
            b003_state = Com_bitreactive_library_mqtt_RobustMQTT.ACTIVE;
            b011_state = Com_bitreactive_library_mqtt_PublishHandler2.ACTIVE;
            b013_state = Com_bitreactive_library_buffering_PersistentBuffer.ACTIVE;
            // step 6bd85;
            return CONSUME_SIGNAL;
        } else {
            return DISCARD_SIGNAL;
        }
    }

    private int handleEvent_SUBS_OK_b016(java.lang.Object _sender, java.lang.Object receiverSessionID, java.lang.Object _data) {
        if (b016_SUBS_OK_r0) {
            b016_SUBS_OK_r0 = false;
            scheduler.flushEventQueue(sessionID, "SUBS_OK_b016");
            b016_SUBS_ERROR_r1 = false;
            scheduler.flushEventQueue(sessionID, "SUBS_ERROR_b016");
            b016_state = Com_bitreactive_library_mqtt_Subscriber._IDLE;
            // step 927c6;
            return CONSUME_SIGNAL;
        } else {
            return DISCARD_SIGNAL;
        }
    }

    private int handleEvent_SUBS_ERROR_b016(java.lang.Object _sender, java.lang.Object receiverSessionID, java.lang.Object _data) {
        if (b016_SUBS_ERROR_r1) {
            int b015_o0 = b015.getDuration();
            b017.duration = b015_o0;
            scheduler.startOrRestartTimer(_b1_c3_c1_Timer_2_timer, b017.duration);
            b016_SUBS_OK_r0 = false;
            scheduler.flushEventQueue(sessionID, "SUBS_OK_b016");
            b016_SUBS_ERROR_r1 = false;
            scheduler.flushEventQueue(sessionID, "SUBS_ERROR_b016");
            b016_state = Com_bitreactive_library_mqtt_Subscriber._IDLE;
            b017_state = Com_bitreactive_library_timers_Timer2.ACTIVE;
            // step 84d7f;
            return CONSUME_SIGNAL;
        } else {
            return DISCARD_SIGNAL;
        }
    }
}
