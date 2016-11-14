package no.item.ntnu.ttm4160.airqualityapp.sensorapp.component;

public class ComponentSM extends no.ntnu.item.arctis.runtime.IStateMachine {

    private no.item.ntnu.ttm4160.airqualityapp.sensorapp.component.Component b000;
    private no.item.ntnu.ttm4160.airqualityapp.co2sensor.CO2Sensor b001;
    private com.bitreactive.library.mqtt.robustmqtt.RobustMQTT b002;
    private com.bitreactive.library.mqtt.createcallback.CreateCallback b003;
    private com.bitreactive.library.mqtt.connhandler.ConnHandler b004;
    private com.bitreactive.library.mqtt.publishmanager.PublishManager b005;
    private com.bitreactive.library.mqtt.publishhandler.PublishHandler b006;
    private com.bitreactive.library.mqtt.publishpolicy.PublishPolicy b007;
    private com.bitreactive.library.buffering.buffereager.BufferEager<com.bitreactive.library.mqtt.MQTTMessage> b008;
    private com.bitreactive.library.mqtt.publisher.Publisher b009;
    private com.bitreactive.library.mqtt.publishhandler2.PublishHandler2 b010;
    private com.bitreactive.library.mqtt.publisher.Publisher b011;
    private com.bitreactive.library.buffering.persistentbuffer.PersistentBuffer<com.bitreactive.library.mqtt.MQTTMessage> b012;
    private com.bitreactive.library.mqtt.publishpolicy.PublishPolicy b013;
    private com.bitreactive.library.mqtt.subscribehandler.SubscribeHandler b014;
    private com.bitreactive.library.mqtt.subscriber.Subscriber b015;
    private com.bitreactive.library.timers.timer2.Timer2 b016;
    private enum Com_bitreactive_library_mqtt_RobustMQTT {_IDLE, ACTIVE, INITIALIZING};
    private enum Com_bitreactive_library_mqtt_ConnHandler {_IDLE, ACTIVE, INITIALIZING};
    private enum Com_bitreactive_library_mqtt_PublishHandler {_IDLE, ACTIVE};
    private enum Com_bitreactive_library_buffering_BufferEager {_IDLE, ACTIVE, FIRSTITEMADDED, READY, STOPPING};
    private enum Com_bitreactive_library_mqtt_Publisher {_IDLE, ACTIVE};
    private enum Com_bitreactive_library_mqtt_PublishHandler2 {_IDLE, ACTIVE, INITIALIZING};
    private enum Com_bitreactive_library_buffering_PersistentBuffer {_IDLE, ACTIVE, INITIALIZING, REMOVING};
    private enum Com_bitreactive_library_mqtt_Subscriber {_IDLE, ACTIVE};
    private enum Com_bitreactive_library_timers_Timer2 {_IDLE, ACTIVE};
    private Com_bitreactive_library_mqtt_RobustMQTT b002_state;
    private Com_bitreactive_library_mqtt_ConnHandler b004_state;
    private Com_bitreactive_library_mqtt_PublishHandler b006_state;
    private Com_bitreactive_library_buffering_BufferEager b008_state;
    private Com_bitreactive_library_mqtt_Publisher b009_state;
    private Com_bitreactive_library_mqtt_PublishHandler2 b010_state;
    private Com_bitreactive_library_mqtt_Publisher b011_state;
    private Com_bitreactive_library_buffering_PersistentBuffer b012_state;
    private Com_bitreactive_library_mqtt_Subscriber b015_state;
    private Com_bitreactive_library_timers_Timer2 b016_state;
    private enum Com_bitreactive_library_buffering_BufferEager_Stm {_IDLE, ACTIVE, CHECKCONTENTADDALL, FIRSTITEMADDED, HASROOM, HASROOMAFTERADDINGFIRST, HASROOMFORALL, HASROOMFORALLAFTERADDINGFIRST, HASROOMFORALLINITIAL, ISBUFFEREMPTY, ISEMPTYWHILEACTIVE, ISEMPTYWHILESTOPPING, READY, STOPPING};
    private Com_bitreactive_library_buffering_BufferEager_Stm b008_stm_state;
    private no.ntnu.item.arctis.runtime.IStateMachine.Timer _SensorApp_t0;
    private no.ntnu.item.arctis.runtime.IStateMachine.Break _SensorApp_t1;
    private no.ntnu.item.arctis.runtime.IStateMachine.Timer _SensorApp_t2;
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
    private boolean b003_CONN_LOST_r0;
    private boolean b003_MSG_ARRIVED_r2;
    private boolean b004_INIT_OK_r0;
    private boolean b004_INIT_FAILED_r1;
    private boolean b004_RECONN_OK_r2;
    private boolean b004_RECONN_FAILED_r3;
    private boolean b009_PUB_OK_r0;
    private boolean b009_PUB_ERROR_r1;
    private boolean b011_PUB_OK_r0;
    private boolean b011_PUB_ERROR_r1;
    private boolean b012_REMOVED_r0;
    private boolean b012_INIT_r1;
    private boolean b015_SUBS_OK_r0;
    private boolean b015_SUBS_ERROR_r1;

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
        b002 = new com.bitreactive.library.mqtt.robustmqtt.RobustMQTT();
        b002.setBlockID("b002", sessionID);
        b002.setRuntime(scheduler.getRuntime());
        b003 = new com.bitreactive.library.mqtt.createcallback.CreateCallback();
        b003.setBlockID("b003", sessionID);
        b003.setRuntime(scheduler.getRuntime());
        b004 = new com.bitreactive.library.mqtt.connhandler.ConnHandler();
        b004.setBlockID("b004", sessionID);
        b004.setRuntime(scheduler.getRuntime());
        b005 = new com.bitreactive.library.mqtt.publishmanager.PublishManager();
        b005.setBlockID("b005", sessionID);
        b005.setRuntime(scheduler.getRuntime());
        b006 = new com.bitreactive.library.mqtt.publishhandler.PublishHandler();
        b006.setBlockID("b006", sessionID);
        b006.setRuntime(scheduler.getRuntime());
        b007 = new com.bitreactive.library.mqtt.publishpolicy.PublishPolicy();
        b007.setBlockID("b007", sessionID);
        b007.setRuntime(scheduler.getRuntime());
        b008 = new com.bitreactive.library.buffering.buffereager.BufferEager<com.bitreactive.library.mqtt.MQTTMessage>(true, 100, true);
        b008.setBlockID("b008", sessionID);
        b008.setRuntime(scheduler.getRuntime());
        b009 = new com.bitreactive.library.mqtt.publisher.Publisher();
        b009.setBlockID("b009", sessionID);
        b009.setRuntime(scheduler.getRuntime());
        b010 = new com.bitreactive.library.mqtt.publishhandler2.PublishHandler2();
        b010.setBlockID("b010", sessionID);
        b010.setRuntime(scheduler.getRuntime());
        b011 = new com.bitreactive.library.mqtt.publisher.Publisher();
        b011.setBlockID("b011", sessionID);
        b011.setRuntime(scheduler.getRuntime());
        b012 = new com.bitreactive.library.buffering.persistentbuffer.PersistentBuffer<com.bitreactive.library.mqtt.MQTTMessage>();
        b012.setBlockID("b012", sessionID);
        b012.setRuntime(scheduler.getRuntime());
        b013 = new com.bitreactive.library.mqtt.publishpolicy.PublishPolicy();
        b013.setBlockID("b013", sessionID);
        b013.setRuntime(scheduler.getRuntime());
        b014 = new com.bitreactive.library.mqtt.subscribehandler.SubscribeHandler();
        b014.setBlockID("b014", sessionID);
        b014.setRuntime(scheduler.getRuntime());
        b015 = new com.bitreactive.library.mqtt.subscriber.Subscriber();
        b015.setBlockID("b015", sessionID);
        b015.setRuntime(scheduler.getRuntime());
        b016 = new com.bitreactive.library.timers.timer2.Timer2();
        b016.setBlockID("b016", sessionID);
        b016.setRuntime(scheduler.getRuntime());
        b002_state = Com_bitreactive_library_mqtt_RobustMQTT._IDLE;
        b004_state = Com_bitreactive_library_mqtt_ConnHandler._IDLE;
        b006_state = Com_bitreactive_library_mqtt_PublishHandler._IDLE;
        b008_state = Com_bitreactive_library_buffering_BufferEager._IDLE;
        b009_state = Com_bitreactive_library_mqtt_Publisher._IDLE;
        b010_state = Com_bitreactive_library_mqtt_PublishHandler2._IDLE;
        b011_state = Com_bitreactive_library_mqtt_Publisher._IDLE;
        b012_state = Com_bitreactive_library_buffering_PersistentBuffer._IDLE;
        b015_state = Com_bitreactive_library_mqtt_Subscriber._IDLE;
        b016_state = Com_bitreactive_library_timers_Timer2._IDLE;
        b008_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm._IDLE;
        _SensorApp_t0 = new no.ntnu.item.arctis.runtime.IStateMachine.Timer(20000, "_SensorApp_t0", this);
        _SensorApp_t1 = new no.ntnu.item.arctis.runtime.IStateMachine.Break("_SensorApp_t1", this);
        _SensorApp_t2 = new no.ntnu.item.arctis.runtime.IStateMachine.Timer(1000, "_SensorApp_t2", this);
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
        b002.p = b000_o1;
        com.bitreactive.library.mqtt.MQTTConfigParam b002_o0 = b002.getConfig();
        org.eclipse.paho.client.mqttv3.MqttCallback b003_o0 = b003.create(b002_o0);
        com.bitreactive.library.mqtt.connhandler.ConnHandler.Parameters b002_o1 = b002.startConn(b003_o0);
        b004.p = b002_o1;
        b004.start();
        b004.connect();
        b003_CONN_LOST_r0 = true;
        b003_MSG_ARRIVED_r2 = true;
        b004_INIT_OK_r0 = true;
        b004_INIT_FAILED_r1 = true;
        b002_state = Com_bitreactive_library_mqtt_RobustMQTT.INITIALIZING;
        b004_state = Com_bitreactive_library_mqtt_ConnHandler.INITIALIZING;
        // step b1afd;
        return CONSUME_SIGNAL;
    }

    public int fireTimer(java.lang.String _timerID) {
        if (_timerID.equals("_SensorApp_t0")) {
            return handleTimer__SensorApp_t0();
        } else if (_timerID.equals("_SensorApp_t1")) {
            return handleTimer__SensorApp_t1();
        } else if (_timerID.equals("_SensorApp_t2")) {
            return handleTimer__SensorApp_t2();
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
        if (_signalID.equals("CONN_LOST_b003")) {
            return handleEvent_CONN_LOST_b003(_sender, receiverSessionID, _data);
        } else if (_signalID.equals("MSG_ARRIVED_b003")) {
            return handleEvent_MSG_ARRIVED_b003(_sender, receiverSessionID, _data);
        } else if (_signalID.equals("INIT_OK_b004")) {
            return handleEvent_INIT_OK_b004(_sender, receiverSessionID, _data);
        } else if (_signalID.equals("INIT_FAILED_b004")) {
            return handleEvent_INIT_FAILED_b004(_sender, receiverSessionID, _data);
        } else if (_signalID.equals("RECONN_OK_b004")) {
            return handleEvent_RECONN_OK_b004(_sender, receiverSessionID, _data);
        } else if (_signalID.equals("RECONN_FAILED_b004")) {
            return handleEvent_RECONN_FAILED_b004(_sender, receiverSessionID, _data);
        } else if (_signalID.equals("PUB_OK_b009")) {
            return handleEvent_PUB_OK_b009(_sender, receiverSessionID, _data);
        } else if (_signalID.equals("PUB_ERROR_b009")) {
            return handleEvent_PUB_ERROR_b009(_sender, receiverSessionID, _data);
        } else if (_signalID.equals("PUB_OK_b011")) {
            return handleEvent_PUB_OK_b011(_sender, receiverSessionID, _data);
        } else if (_signalID.equals("PUB_ERROR_b011")) {
            return handleEvent_PUB_ERROR_b011(_sender, receiverSessionID, _data);
        } else if (_signalID.equals("REMOVED_b012")) {
            return handleEvent_REMOVED_b012(_sender, receiverSessionID, _data);
        } else if (_signalID.equals("INIT_b012")) {
            return handleEvent_INIT_b012(_sender, receiverSessionID, _data);
        } else if (_signalID.equals("SUBS_OK_b015")) {
            return handleEvent_SUBS_OK_b015(_sender, receiverSessionID, _data);
        } else if (_signalID.equals("SUBS_ERROR_b015")) {
            return handleEvent_SUBS_ERROR_b015(_sender, receiverSessionID, _data);
        }
        return TRIGGER_UNKNOWN;
    }

    private int handleTimer__SensorApp_t0() {
        b001.stop();
        b003.stop();
        b004.stop();
        if (b016_state == Com_bitreactive_library_timers_Timer2._IDLE) {
            if (b015_state == Com_bitreactive_library_mqtt_Subscriber._IDLE) {
                b015.stop();
                if (b010_state == Com_bitreactive_library_mqtt_PublishHandler2._IDLE) {
                    b011.stopped();
                    if (b009_state == Com_bitreactive_library_mqtt_Publisher._IDLE) {
                        b009.stopped();
                        if (b008_state == Com_bitreactive_library_buffering_BufferEager.ACTIVE) {
                            b008.emptyBuffer();
                            b008_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm._IDLE;
                            scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                            // step 3f519;
                            return TERMINATE_MACHINE;
                        } else if (b008_state == Com_bitreactive_library_buffering_BufferEager.FIRSTITEMADDED) {
                            b008.emptyBuffer();
                            b008_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm._IDLE;
                            scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                            // step 0eac1;
                            return TERMINATE_MACHINE;
                        } else if (b008_state == Com_bitreactive_library_buffering_BufferEager.READY) {
                            b008_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm._IDLE;
                            scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                            // step c033e;
                            return TERMINATE_MACHINE;
                        } else {
                            return DISCARD_SIGNAL;
                        }
                    } else if (b009_state == Com_bitreactive_library_mqtt_Publisher.ACTIVE) {
                        b009.stopped();
                        b008.emptyBuffer();
                        b008_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm._IDLE;
                        scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                        // step 347d0;
                        return TERMINATE_MACHINE;
                    } else {
                        return DISCARD_SIGNAL;
                    }
                } else if (b010_state == Com_bitreactive_library_mqtt_PublishHandler2.ACTIVE) {
                    if (b011_state == Com_bitreactive_library_mqtt_Publisher._IDLE) {
                        b011.stopped();
                        b009.stopped();
                        scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                        // step 049b3;
                        return TERMINATE_MACHINE;
                    } else if (b011_state == Com_bitreactive_library_mqtt_Publisher.ACTIVE) {
                        b011.stopped();
                        b009.stopped();
                        scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                        // step 499c2;
                        return TERMINATE_MACHINE;
                    } else {
                        return DISCARD_SIGNAL;
                    }
                } else {
                    return DISCARD_SIGNAL;
                }
            } else if (b015_state == Com_bitreactive_library_mqtt_Subscriber.ACTIVE) {
                b015.stop();
                if (b010_state == Com_bitreactive_library_mqtt_PublishHandler2._IDLE) {
                    b011.stopped();
                    if (b009_state == Com_bitreactive_library_mqtt_Publisher._IDLE) {
                        b009.stopped();
                        if (b008_state == Com_bitreactive_library_buffering_BufferEager.ACTIVE) {
                            b008.emptyBuffer();
                            b008_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm._IDLE;
                            scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                            // step a3d5c;
                            return TERMINATE_MACHINE;
                        } else if (b008_state == Com_bitreactive_library_buffering_BufferEager.FIRSTITEMADDED) {
                            b008.emptyBuffer();
                            b008_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm._IDLE;
                            scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                            // step c7147;
                            return TERMINATE_MACHINE;
                        } else if (b008_state == Com_bitreactive_library_buffering_BufferEager.READY) {
                            b008_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm._IDLE;
                            scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                            // step c2174;
                            return TERMINATE_MACHINE;
                        } else {
                            return DISCARD_SIGNAL;
                        }
                    } else if (b009_state == Com_bitreactive_library_mqtt_Publisher.ACTIVE) {
                        b009.stopped();
                        b008.emptyBuffer();
                        b008_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm._IDLE;
                        scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                        // step da691;
                        return TERMINATE_MACHINE;
                    } else {
                        return DISCARD_SIGNAL;
                    }
                } else if (b010_state == Com_bitreactive_library_mqtt_PublishHandler2.ACTIVE) {
                    if (b011_state == Com_bitreactive_library_mqtt_Publisher._IDLE) {
                        b011.stopped();
                        b009.stopped();
                        scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                        // step ec85c;
                        return TERMINATE_MACHINE;
                    } else if (b011_state == Com_bitreactive_library_mqtt_Publisher.ACTIVE) {
                        b011.stopped();
                        b009.stopped();
                        scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                        // step 1b25a;
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
        } else if (b016_state == Com_bitreactive_library_timers_Timer2.ACTIVE) {
            b015.stop();
            if (b010_state == Com_bitreactive_library_mqtt_PublishHandler2._IDLE) {
                b011.stopped();
                if (b009_state == Com_bitreactive_library_mqtt_Publisher._IDLE) {
                    b009.stopped();
                    if (b008_state == Com_bitreactive_library_buffering_BufferEager.ACTIVE) {
                        b008.emptyBuffer();
                        b008_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm._IDLE;
                        scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                        // step 716a8;
                        return TERMINATE_MACHINE;
                    } else if (b008_state == Com_bitreactive_library_buffering_BufferEager.FIRSTITEMADDED) {
                        b008.emptyBuffer();
                        b008_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm._IDLE;
                        scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                        // step e3bc7;
                        return TERMINATE_MACHINE;
                    } else if (b008_state == Com_bitreactive_library_buffering_BufferEager.READY) {
                        b008_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm._IDLE;
                        scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                        // step 589f2;
                        return TERMINATE_MACHINE;
                    } else {
                        return DISCARD_SIGNAL;
                    }
                } else if (b009_state == Com_bitreactive_library_mqtt_Publisher.ACTIVE) {
                    b009.stopped();
                    b008.emptyBuffer();
                    b008_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm._IDLE;
                    scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                    // step b2147;
                    return TERMINATE_MACHINE;
                } else {
                    return DISCARD_SIGNAL;
                }
            } else if (b010_state == Com_bitreactive_library_mqtt_PublishHandler2.ACTIVE) {
                if (b011_state == Com_bitreactive_library_mqtt_Publisher._IDLE) {
                    b011.stopped();
                    b009.stopped();
                    scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                    // step 20512;
                    return TERMINATE_MACHINE;
                } else if (b011_state == Com_bitreactive_library_mqtt_Publisher.ACTIVE) {
                    b011.stopped();
                    b009.stopped();
                    scheduler.stopBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                    // step f0ed3;
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
    }

    private int handleTimer__SensorApp_t1() {
        java.lang.String b001_o0 = b001.readData();
        b000.printCO2(b001_o0);
        com.bitreactive.library.mqtt.MQTTMessage b000_o2 = b000.createMSG(b001_o0);
        if (b010_state == Com_bitreactive_library_mqtt_PublishHandler2.ACTIVE) {
            b013.msg = b000_o2;
            if (b013.isConnected()) {
                b013.buffer();
                if (b012_state == Com_bitreactive_library_buffering_PersistentBuffer.ACTIVE) {
                    b012.add(b013.msg);
                    scheduler.startOrRestartTimer(_SensorApp_t0);
                    scheduler.startOrRestartTimer(_SensorApp_t2);
                    // step 147ed;
                    return CONSUME_SIGNAL;
                } else if (b012_state == Com_bitreactive_library_buffering_PersistentBuffer.REMOVING) {
                    b012.add(b013.msg);
                    scheduler.startOrRestartTimer(_SensorApp_t0);
                    scheduler.startOrRestartTimer(_SensorApp_t2);
                    // step a10ac;
                    return CONSUME_SIGNAL;
                } else {
                    return DISCARD_SIGNAL;
                }
            } else {
                if (b013.discardDueToQos()) {
                    scheduler.startOrRestartTimer(_SensorApp_t0);
                    scheduler.startOrRestartTimer(_SensorApp_t2);
                    // step cf97d;
                    return CONSUME_SIGNAL;
                } else {
                    b013.buffer();
                    if (b012_state == Com_bitreactive_library_buffering_PersistentBuffer.ACTIVE) {
                        b012.add(b013.msg);
                        scheduler.startOrRestartTimer(_SensorApp_t0);
                        scheduler.startOrRestartTimer(_SensorApp_t2);
                        // step 46fd1;
                        return CONSUME_SIGNAL;
                    } else if (b012_state == Com_bitreactive_library_buffering_PersistentBuffer.REMOVING) {
                        b012.add(b013.msg);
                        scheduler.startOrRestartTimer(_SensorApp_t0);
                        scheduler.startOrRestartTimer(_SensorApp_t2);
                        // step 39692;
                        return CONSUME_SIGNAL;
                    } else {
                        return DISCARD_SIGNAL;
                    }
                }
            }
        } else if (b006_state == Com_bitreactive_library_mqtt_PublishHandler.ACTIVE) {
            b007.msg = b000_o2;
            if (b007.isConnected()) {
                b007.buffer();
                if (b008_state == Com_bitreactive_library_buffering_BufferEager.ACTIVE) {
                    b008.add = b007.msg;
                    if (b008.hasRoom()) {
                        b008.addToBuffer();
                        scheduler.startOrRestartTimer(_SensorApp_t0);
                        scheduler.startOrRestartTimer(_SensorApp_t2);
                        // step f92f4;
                        return CONSUME_SIGNAL;
                    } else {
                        b006.overflow(b008.overflow);
                        scheduler.startOrRestartTimer(_SensorApp_t0);
                        scheduler.startOrRestartTimer(_SensorApp_t2);
                        // step abff5;
                        return CONSUME_SIGNAL;
                    }
                } else if (b008_state == Com_bitreactive_library_buffering_BufferEager.FIRSTITEMADDED) {
                    b008.add = b007.msg;
                    if (b008.hasRoom()) {
                        b008.addToBuffer();
                        scheduler.startOrRestartTimer(_SensorApp_t0);
                        scheduler.startOrRestartTimer(_SensorApp_t2);
                        // step 9c272;
                        return CONSUME_SIGNAL;
                    } else {
                        b006.overflow(b008.overflow);
                        scheduler.startOrRestartTimer(_SensorApp_t0);
                        scheduler.startOrRestartTimer(_SensorApp_t2);
                        // step 0203b;
                        return CONSUME_SIGNAL;
                    }
                } else if (b008_state == Com_bitreactive_library_buffering_BufferEager.READY) {
                    b008.add = b007.msg;
                    b008.addToBuffer();
                    scheduler.startBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                    b008_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm.FIRSTITEMADDED;
                    scheduler.startOrRestartTimer(_SensorApp_t0);
                    scheduler.startOrRestartTimer(_SensorApp_t2);
                    b008_state = Com_bitreactive_library_buffering_BufferEager.FIRSTITEMADDED;
                    // step 20cd8;
                    return CONSUME_SIGNAL;
                } else {
                    return DISCARD_SIGNAL;
                }
            } else {
                if (b007.discardDueToQos()) {
                    scheduler.startOrRestartTimer(_SensorApp_t0);
                    scheduler.startOrRestartTimer(_SensorApp_t2);
                    // step cb6fa;
                    return CONSUME_SIGNAL;
                } else {
                    b007.buffer();
                    if (b008_state == Com_bitreactive_library_buffering_BufferEager.ACTIVE) {
                        b008.add = b007.msg;
                        if (b008.hasRoom()) {
                            b008.addToBuffer();
                            scheduler.startOrRestartTimer(_SensorApp_t0);
                            scheduler.startOrRestartTimer(_SensorApp_t2);
                            // step 164f1;
                            return CONSUME_SIGNAL;
                        } else {
                            b006.overflow(b008.overflow);
                            scheduler.startOrRestartTimer(_SensorApp_t0);
                            scheduler.startOrRestartTimer(_SensorApp_t2);
                            // step a8d5e;
                            return CONSUME_SIGNAL;
                        }
                    } else if (b008_state == Com_bitreactive_library_buffering_BufferEager.FIRSTITEMADDED) {
                        b008.add = b007.msg;
                        if (b008.hasRoom()) {
                            b008.addToBuffer();
                            scheduler.startOrRestartTimer(_SensorApp_t0);
                            scheduler.startOrRestartTimer(_SensorApp_t2);
                            // step 3ad44;
                            return CONSUME_SIGNAL;
                        } else {
                            b006.overflow(b008.overflow);
                            scheduler.startOrRestartTimer(_SensorApp_t0);
                            scheduler.startOrRestartTimer(_SensorApp_t2);
                            // step e9542;
                            return CONSUME_SIGNAL;
                        }
                    } else if (b008_state == Com_bitreactive_library_buffering_BufferEager.READY) {
                        b008.add = b007.msg;
                        b008.addToBuffer();
                        scheduler.startBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                        b008_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm.FIRSTITEMADDED;
                        scheduler.startOrRestartTimer(_SensorApp_t0);
                        scheduler.startOrRestartTimer(_SensorApp_t2);
                        b008_state = Com_bitreactive_library_buffering_BufferEager.FIRSTITEMADDED;
                        // step 4d686;
                        return CONSUME_SIGNAL;
                    } else {
                        return DISCARD_SIGNAL;
                    }
                }
            }
        } else {
            return BLOCKING_CHOICE;
        }
    }

    private int handleTimer__SensorApp_t2() {
        java.lang.String b001_o0 = b001.readData();
        b000.printCO2(b001_o0);
        com.bitreactive.library.mqtt.MQTTMessage b000_o2 = b000.createMSG(b001_o0);
        if (b010_state == Com_bitreactive_library_mqtt_PublishHandler2.ACTIVE) {
            b013.msg = b000_o2;
            if (b013.isConnected()) {
                b013.buffer();
                if (b012_state == Com_bitreactive_library_buffering_PersistentBuffer.ACTIVE) {
                    b012.add(b013.msg);
                    scheduler.startOrRestartTimer(_SensorApp_t0);
                    scheduler.startOrRestartTimer(_SensorApp_t2);
                    // step 2120c;
                    return CONSUME_SIGNAL;
                } else if (b012_state == Com_bitreactive_library_buffering_PersistentBuffer.REMOVING) {
                    b012.add(b013.msg);
                    scheduler.startOrRestartTimer(_SensorApp_t0);
                    scheduler.startOrRestartTimer(_SensorApp_t2);
                    // step ec91a;
                    return CONSUME_SIGNAL;
                } else {
                    return DISCARD_SIGNAL;
                }
            } else {
                if (b013.discardDueToQos()) {
                    scheduler.startOrRestartTimer(_SensorApp_t0);
                    scheduler.startOrRestartTimer(_SensorApp_t2);
                    // step fce31;
                    return CONSUME_SIGNAL;
                } else {
                    b013.buffer();
                    if (b012_state == Com_bitreactive_library_buffering_PersistentBuffer.ACTIVE) {
                        b012.add(b013.msg);
                        scheduler.startOrRestartTimer(_SensorApp_t0);
                        scheduler.startOrRestartTimer(_SensorApp_t2);
                        // step 99af1;
                        return CONSUME_SIGNAL;
                    } else if (b012_state == Com_bitreactive_library_buffering_PersistentBuffer.REMOVING) {
                        b012.add(b013.msg);
                        scheduler.startOrRestartTimer(_SensorApp_t0);
                        scheduler.startOrRestartTimer(_SensorApp_t2);
                        // step 7df50;
                        return CONSUME_SIGNAL;
                    } else {
                        return DISCARD_SIGNAL;
                    }
                }
            }
        } else if (b006_state == Com_bitreactive_library_mqtt_PublishHandler.ACTIVE) {
            b007.msg = b000_o2;
            if (b007.isConnected()) {
                b007.buffer();
                if (b008_state == Com_bitreactive_library_buffering_BufferEager.ACTIVE) {
                    b008.add = b007.msg;
                    if (b008.hasRoom()) {
                        b008.addToBuffer();
                        scheduler.startOrRestartTimer(_SensorApp_t0);
                        scheduler.startOrRestartTimer(_SensorApp_t2);
                        // step e397d;
                        return CONSUME_SIGNAL;
                    } else {
                        b006.overflow(b008.overflow);
                        scheduler.startOrRestartTimer(_SensorApp_t0);
                        scheduler.startOrRestartTimer(_SensorApp_t2);
                        // step b8fab;
                        return CONSUME_SIGNAL;
                    }
                } else if (b008_state == Com_bitreactive_library_buffering_BufferEager.FIRSTITEMADDED) {
                    b008.add = b007.msg;
                    if (b008.hasRoom()) {
                        b008.addToBuffer();
                        scheduler.startOrRestartTimer(_SensorApp_t0);
                        scheduler.startOrRestartTimer(_SensorApp_t2);
                        // step c0af4;
                        return CONSUME_SIGNAL;
                    } else {
                        b006.overflow(b008.overflow);
                        scheduler.startOrRestartTimer(_SensorApp_t0);
                        scheduler.startOrRestartTimer(_SensorApp_t2);
                        // step 554be;
                        return CONSUME_SIGNAL;
                    }
                } else if (b008_state == Com_bitreactive_library_buffering_BufferEager.READY) {
                    b008.add = b007.msg;
                    b008.addToBuffer();
                    scheduler.startBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                    b008_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm.FIRSTITEMADDED;
                    scheduler.startOrRestartTimer(_SensorApp_t0);
                    scheduler.startOrRestartTimer(_SensorApp_t2);
                    b008_state = Com_bitreactive_library_buffering_BufferEager.FIRSTITEMADDED;
                    // step a91bd;
                    return CONSUME_SIGNAL;
                } else {
                    return DISCARD_SIGNAL;
                }
            } else {
                if (b007.discardDueToQos()) {
                    scheduler.startOrRestartTimer(_SensorApp_t0);
                    scheduler.startOrRestartTimer(_SensorApp_t2);
                    // step e53d2;
                    return CONSUME_SIGNAL;
                } else {
                    b007.buffer();
                    if (b008_state == Com_bitreactive_library_buffering_BufferEager.ACTIVE) {
                        b008.add = b007.msg;
                        if (b008.hasRoom()) {
                            b008.addToBuffer();
                            scheduler.startOrRestartTimer(_SensorApp_t0);
                            scheduler.startOrRestartTimer(_SensorApp_t2);
                            // step cee6d;
                            return CONSUME_SIGNAL;
                        } else {
                            b006.overflow(b008.overflow);
                            scheduler.startOrRestartTimer(_SensorApp_t0);
                            scheduler.startOrRestartTimer(_SensorApp_t2);
                            // step df876;
                            return CONSUME_SIGNAL;
                        }
                    } else if (b008_state == Com_bitreactive_library_buffering_BufferEager.FIRSTITEMADDED) {
                        b008.add = b007.msg;
                        if (b008.hasRoom()) {
                            b008.addToBuffer();
                            scheduler.startOrRestartTimer(_SensorApp_t0);
                            scheduler.startOrRestartTimer(_SensorApp_t2);
                            // step fda24;
                            return CONSUME_SIGNAL;
                        } else {
                            b006.overflow(b008.overflow);
                            scheduler.startOrRestartTimer(_SensorApp_t0);
                            scheduler.startOrRestartTimer(_SensorApp_t2);
                            // step 06c6c;
                            return CONSUME_SIGNAL;
                        }
                    } else if (b008_state == Com_bitreactive_library_buffering_BufferEager.READY) {
                        b008.add = b007.msg;
                        b008.addToBuffer();
                        scheduler.startBreak(_b1_c2_b0_c1_Buffer_Eager_t0);
                        b008_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm.FIRSTITEMADDED;
                        scheduler.startOrRestartTimer(_SensorApp_t0);
                        scheduler.startOrRestartTimer(_SensorApp_t2);
                        b008_state = Com_bitreactive_library_buffering_BufferEager.FIRSTITEMADDED;
                        // step 90250;
                        return CONSUME_SIGNAL;
                    } else {
                        return DISCARD_SIGNAL;
                    }
                }
            }
        } else {
            return BLOCKING_CHOICE;
        }
    }

    private int handleTimer__b1_c1_Conn_Handler_t0() {
        b004.reconnect();
        b004_RECONN_OK_r2 = true;
        b004_RECONN_FAILED_r3 = true;
        // step b3dfb;
        return CONSUME_SIGNAL;
    }

    private int handleTimer__b1_c1_Conn_Handler_t1() {
        b004.connect();
        b004_INIT_OK_r0 = true;
        b004_INIT_FAILED_r1 = true;
        // step 315fb;
        return CONSUME_SIGNAL;
    }

    private int handleTimer__b1_c2_Publish_Manager_t0() {
        scheduler.startBreak(_SensorApp_t1);
        b002_state = Com_bitreactive_library_mqtt_RobustMQTT.ACTIVE;
        // step 97660;
        return CONSUME_SIGNAL;
    }

    private int handleTimer__b1_c2_b0_Publish_Handler_t0() {
        b009.publish(_b1_c2_b0_Publish_Handler_t0_data);
        b009_PUB_OK_r0 = true;
        b009_PUB_ERROR_r1 = true;
        b009_state = Com_bitreactive_library_mqtt_Publisher.ACTIVE;
        // step dd958;
        return CONSUME_SIGNAL;
    }

    private int handleTimer__b1_c2_b0_Publish_Handler_t2() {
        b007.msg = _b1_c2_b0_Publish_Handler_t2_data;
        if (b007.discardDueToFreshness()) {
            b007.getNext();
            scheduler.startBreak(_b1_c2_b0_Publish_Handler_t3);
            // step 2ebc2;
            return CONSUME_SIGNAL;
        } else {
            if (b007.isConnected()) {
                com.bitreactive.library.mqtt.publisher.Publisher.Parameters b007_o2 = b007.addClient();
                _b1_c2_b0_Publish_Handler_t0_data = b007_o2;
                scheduler.startBreak(_b1_c2_b0_Publish_Handler_t0);
                // step f13f5;
                return CONSUME_SIGNAL;
            } else {
                if (b007.discardDueToQos()) {
                    b007.getNext();
                    scheduler.startBreak(_b1_c2_b0_Publish_Handler_t3);
                    // step 0def9;
                    return CONSUME_SIGNAL;
                } else {
                    b007.toWait();
                    _b1_c2_b0_Publish_Handler_t2_data = b007.msg;
                    scheduler.startOrRestartTimer(_b1_c2_b0_Publish_Handler_t2);
                    // step ea09f;
                    return CONSUME_SIGNAL;
                }
            }
        }
    }

    private int handleTimer__b1_c2_b0_Publish_Handler_t3() {
        if (b008.isEmpty()) {
            b008_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm.READY;
            b008_state = Com_bitreactive_library_buffering_BufferEager.READY;
            // step 4c632;
            return CONSUME_SIGNAL;
        } else {
            b008.getFromBuffer();
            b007.msg = b008.out;
            if (b007.discardDueToFreshness()) {
                b007.getNext();
                scheduler.startBreak(_b1_c2_b0_Publish_Handler_t3);
                // step d5c43;
                return CONSUME_SIGNAL;
            } else {
                if (b007.isConnected()) {
                    com.bitreactive.library.mqtt.publisher.Publisher.Parameters b007_o2 = b007.addClient();
                    _b1_c2_b0_Publish_Handler_t0_data = b007_o2;
                    scheduler.startBreak(_b1_c2_b0_Publish_Handler_t0);
                    // step 76d39;
                    return CONSUME_SIGNAL;
                } else {
                    if (b007.discardDueToQos()) {
                        b007.getNext();
                        scheduler.startBreak(_b1_c2_b0_Publish_Handler_t3);
                        // step 0ef3c;
                        return CONSUME_SIGNAL;
                    } else {
                        b007.toWait();
                        _b1_c2_b0_Publish_Handler_t2_data = b007.msg;
                        scheduler.startOrRestartTimer(_b1_c2_b0_Publish_Handler_t2);
                        // step 58a26;
                        return CONSUME_SIGNAL;
                    }
                }
            }
        }
    }

    private int handleTimer__b1_c2_b0_c1_Buffer_Eager_t0() {
        if (b008_state == Com_bitreactive_library_buffering_BufferEager.FIRSTITEMADDED) {
            if (b008_stm_state == Com_bitreactive_library_buffering_BufferEager_Stm.FIRSTITEMADDED) {
                b008.getFromBuffer();
                b008_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm.ACTIVE;
                b007.msg = b008.out;
                if (b007.discardDueToFreshness()) {
                    b007.getNext();
                    scheduler.startBreak(_b1_c2_b0_Publish_Handler_t3);
                    b008_state = Com_bitreactive_library_buffering_BufferEager.ACTIVE;
                    // step b1371;
                    return CONSUME_SIGNAL;
                } else {
                    if (b007.isConnected()) {
                        com.bitreactive.library.mqtt.publisher.Publisher.Parameters b007_o2 = b007.addClient();
                        _b1_c2_b0_Publish_Handler_t0_data = b007_o2;
                        scheduler.startBreak(_b1_c2_b0_Publish_Handler_t0);
                        b008_state = Com_bitreactive_library_buffering_BufferEager.ACTIVE;
                        // step cb69b;
                        return CONSUME_SIGNAL;
                    } else {
                        if (b007.discardDueToQos()) {
                            b007.getNext();
                            scheduler.startBreak(_b1_c2_b0_Publish_Handler_t3);
                            b008_state = Com_bitreactive_library_buffering_BufferEager.ACTIVE;
                            // step a78eb;
                            return CONSUME_SIGNAL;
                        } else {
                            b007.toWait();
                            _b1_c2_b0_Publish_Handler_t2_data = b007.msg;
                            scheduler.startOrRestartTimer(_b1_c2_b0_Publish_Handler_t2);
                            b008_state = Com_bitreactive_library_buffering_BufferEager.ACTIVE;
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
        com.bitreactive.library.mqtt.MQTTMessage b012_o1 = b012.peek();
        if (b012_o1 == null) {
            b010.empty();
            int b010_o2 = b010.getDuration();
            scheduler.startOrRestartTimer(_b1_c2_b1_Publish_Handler_2_t0, b010_o2);
            // step cb18a;
            return CONSUME_SIGNAL;
        } else {
            b013.msg = b012_o1;
            if (b013.discardDueToFreshness()) {
                b013.getNext();
                scheduler.startBreak(_b1_c2_b1_Publish_Handler_2_t2);
                // step f4912;
                return CONSUME_SIGNAL;
            } else {
                if (b013.isConnected()) {
                    com.bitreactive.library.mqtt.publisher.Publisher.Parameters b013_o2 = b013.addClient();
                    _b1_c2_b1_Publish_Handler_2_t3_data = b013_o2;
                    scheduler.startBreak(_b1_c2_b1_Publish_Handler_2_t3);
                    // step 580c7;
                    return CONSUME_SIGNAL;
                } else {
                    if (b013.discardDueToQos()) {
                        b013.getNext();
                        scheduler.startBreak(_b1_c2_b1_Publish_Handler_2_t2);
                        // step 3ed7d;
                        return CONSUME_SIGNAL;
                    } else {
                        b013.toWait();
                        _b1_c2_b1_Publish_Handler_2_t1_data = b013.msg;
                        scheduler.startOrRestartTimer(_b1_c2_b1_Publish_Handler_2_t1);
                        // step 35233;
                        return CONSUME_SIGNAL;
                    }
                }
            }
        }
    }

    private int handleTimer__b1_c2_b1_Publish_Handler_2_t1() {
        b013.msg = _b1_c2_b1_Publish_Handler_2_t1_data;
        if (b013.discardDueToFreshness()) {
            b013.getNext();
            scheduler.startBreak(_b1_c2_b1_Publish_Handler_2_t2);
            // step c590a;
            return CONSUME_SIGNAL;
        } else {
            if (b013.isConnected()) {
                com.bitreactive.library.mqtt.publisher.Publisher.Parameters b013_o2 = b013.addClient();
                _b1_c2_b1_Publish_Handler_2_t3_data = b013_o2;
                scheduler.startBreak(_b1_c2_b1_Publish_Handler_2_t3);
                // step 6d968;
                return CONSUME_SIGNAL;
            } else {
                if (b013.discardDueToQos()) {
                    b013.getNext();
                    scheduler.startBreak(_b1_c2_b1_Publish_Handler_2_t2);
                    // step 10bc4;
                    return CONSUME_SIGNAL;
                } else {
                    b013.toWait();
                    _b1_c2_b1_Publish_Handler_2_t1_data = b013.msg;
                    scheduler.startOrRestartTimer(_b1_c2_b1_Publish_Handler_2_t1);
                    // step f998b;
                    return CONSUME_SIGNAL;
                }
            }
        }
    }

    private int handleTimer__b1_c2_b1_Publish_Handler_2_t2() {
        b012.remove();
        b012_REMOVED_r0 = true;
        b012_state = Com_bitreactive_library_buffering_PersistentBuffer.REMOVING;
        // step 83aba;
        return CONSUME_SIGNAL;
    }

    private int handleTimer__b1_c2_b1_Publish_Handler_2_t3() {
        b011.publish(_b1_c2_b1_Publish_Handler_2_t3_data);
        b011_PUB_OK_r0 = true;
        b011_PUB_ERROR_r1 = true;
        b011_state = Com_bitreactive_library_mqtt_Publisher.ACTIVE;
        // step 18a15;
        return CONSUME_SIGNAL;
    }

    private int handleTimer__b1_c3_Subscribe_Handler_t0() {
        b015.subscribe(b014.p);
        b015_SUBS_OK_r0 = true;
        b015_SUBS_ERROR_r1 = true;
        b015_state = Com_bitreactive_library_mqtt_Subscriber.ACTIVE;
        // step 22331;
        return CONSUME_SIGNAL;
    }

    private int handleTimer__b1_c3_c1_Timer_2_timer() {
        b015.subscribe(b014.p);
        b015_SUBS_OK_r0 = true;
        b015_SUBS_ERROR_r1 = true;
        b015_state = Com_bitreactive_library_mqtt_Subscriber.ACTIVE;
        b016_state = Com_bitreactive_library_timers_Timer2._IDLE;
        // step aa3d3;
        return CONSUME_SIGNAL;
    }

    private int handleEvent_CONN_LOST_b003(java.lang.Object _sender, java.lang.Object receiverSessionID, java.lang.Object _data) {
        if (b003_CONN_LOST_r0) {
            b002.connLost(((java.lang.String) _data));
            if (b004_state == Com_bitreactive_library_mqtt_ConnHandler.ACTIVE) {
                boolean b004_o5 = b004.tryReconnect();
                if (b004_o5 == true) {
                    // step 22acb;
                    return CONSUME_SIGNAL;
                } else {
                    b004.reconnect();
                    b004_RECONN_OK_r2 = true;
                    b004_RECONN_FAILED_r3 = true;
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

    private int handleEvent_MSG_ARRIVED_b003(java.lang.Object _sender, java.lang.Object receiverSessionID, java.lang.Object _data) {
        if (b003_MSG_ARRIVED_r2) {
            if (b002_state == Com_bitreactive_library_mqtt_RobustMQTT.ACTIVE) {
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

    private int handleEvent_INIT_OK_b004(java.lang.Object _sender, java.lang.Object receiverSessionID, java.lang.Object _data) {
        if (b004_INIT_OK_r0) {
            if (b004_state == Com_bitreactive_library_mqtt_ConnHandler.INITIALIZING) {
                b002.client = ((org.eclipse.paho.client.mqttv3.MqttClient) _data);
                com.bitreactive.library.mqtt.subscriber.Subscriber.Parameters b002_o2 = b002.getSubscribeParam();
                b014.p = b002_o2;
                if (b014.containTopic()) {
                    b015.stop();
                    com.bitreactive.library.mqtt.publishmanager.PublishManager.Parameters b002_o3 = b002.getPublishParam();
                    b005.p = b002_o3;
                    boolean b005_o0 = b005.usePersistent();
                    if (b005_o0 == true) {
                        com.bitreactive.library.mqtt.publishhandler2.PublishHandler2.Parameters b005_o2 = b005.createParam2();
                        b010.p = b005_o2;
                        java.lang.String b010_o0 = b010.getFilename();
                        com.bitreactive.library.mqtt.publishpolicy.PublishPolicy.Parameters b010_o5 = b010.getParams();
                        b012.init(b010_o0);
                        b013.p = b010_o5;
                        scheduler.stopTimer(_b1_c3_c1_Timer_2_timer);
                        scheduler.startBreak(_b1_c3_Subscribe_Handler_t0);
                        b004_INIT_OK_r0 = false;
                        b015_SUBS_OK_r0 = false;
                        scheduler.flushEventQueue(sessionID, "SUBS_OK_b015");
                        b015_SUBS_ERROR_r1 = false;
                        scheduler.flushEventQueue(sessionID, "SUBS_ERROR_b015");
                        b012_INIT_r1 = true;
                        b004_state = Com_bitreactive_library_mqtt_ConnHandler.ACTIVE;
                        b010_state = Com_bitreactive_library_mqtt_PublishHandler2.INITIALIZING;
                        b012_state = Com_bitreactive_library_buffering_PersistentBuffer.INITIALIZING;
                        // step 832de;
                        return CONSUME_SIGNAL;
                    } else {
                        com.bitreactive.library.mqtt.publishpolicy.PublishPolicy.Parameters b005_o1 = b005.createParam();
                        b007.p = b005_o1;
                        b008.emptyBuffer();
                        b008_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm.READY;
                        scheduler.stopTimer(_b1_c3_c1_Timer_2_timer);
                        scheduler.startBreak(_b1_c2_Publish_Manager_t0);
                        scheduler.startBreak(_b1_c3_Subscribe_Handler_t0);
                        b004_INIT_OK_r0 = false;
                        b015_SUBS_OK_r0 = false;
                        scheduler.flushEventQueue(sessionID, "SUBS_OK_b015");
                        b015_SUBS_ERROR_r1 = false;
                        scheduler.flushEventQueue(sessionID, "SUBS_ERROR_b015");
                        b004_state = Com_bitreactive_library_mqtt_ConnHandler.ACTIVE;
                        b006_state = Com_bitreactive_library_mqtt_PublishHandler.ACTIVE;
                        b008_state = Com_bitreactive_library_buffering_BufferEager.READY;
                        // step 5b5d4;
                        return CONSUME_SIGNAL;
                    }
                } else {
                    com.bitreactive.library.mqtt.publishmanager.PublishManager.Parameters b002_o3 = b002.getPublishParam();
                    b005.p = b002_o3;
                    boolean b005_o0 = b005.usePersistent();
                    if (b005_o0 == true) {
                        com.bitreactive.library.mqtt.publishhandler2.PublishHandler2.Parameters b005_o2 = b005.createParam2();
                        b010.p = b005_o2;
                        java.lang.String b010_o0 = b010.getFilename();
                        com.bitreactive.library.mqtt.publishpolicy.PublishPolicy.Parameters b010_o5 = b010.getParams();
                        b012.init(b010_o0);
                        b013.p = b010_o5;
                        b004_INIT_OK_r0 = false;
                        b012_INIT_r1 = true;
                        b004_state = Com_bitreactive_library_mqtt_ConnHandler.ACTIVE;
                        b010_state = Com_bitreactive_library_mqtt_PublishHandler2.INITIALIZING;
                        b012_state = Com_bitreactive_library_buffering_PersistentBuffer.INITIALIZING;
                        // step dcef1;
                        return CONSUME_SIGNAL;
                    } else {
                        com.bitreactive.library.mqtt.publishpolicy.PublishPolicy.Parameters b005_o1 = b005.createParam();
                        b007.p = b005_o1;
                        b008.emptyBuffer();
                        b008_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm.READY;
                        scheduler.startBreak(_b1_c2_Publish_Manager_t0);
                        b004_INIT_OK_r0 = false;
                        b004_state = Com_bitreactive_library_mqtt_ConnHandler.ACTIVE;
                        b006_state = Com_bitreactive_library_mqtt_PublishHandler.ACTIVE;
                        b008_state = Com_bitreactive_library_buffering_BufferEager.READY;
                        // step 89a29;
                        return CONSUME_SIGNAL;
                    }
                }
            } else {
                b004_INIT_OK_r0 = false;
                // step 116f9;
                return CONSUME_SIGNAL;
            }
        } else {
            return DISCARD_SIGNAL;
        }
    }

    private int handleEvent_INIT_FAILED_b004(java.lang.Object _sender, java.lang.Object receiverSessionID, java.lang.Object _data) {
        if (b004_INIT_FAILED_r1) {
            int b004_o4 = b004.getWaitingDuration();
            scheduler.startOrRestartTimer(_b1_c1_Conn_Handler_t1, b004_o4);
            b004_INIT_FAILED_r1 = false;
            // step 8fa8d;
            return CONSUME_SIGNAL;
        } else {
            return DISCARD_SIGNAL;
        }
    }

    private int handleEvent_RECONN_OK_b004(java.lang.Object _sender, java.lang.Object receiverSessionID, java.lang.Object _data) {
        if (b004_RECONN_OK_r2) {
            if (b014.containTopic()) {
                if (b016_state == Com_bitreactive_library_timers_Timer2._IDLE) {
                    if (b015_state == Com_bitreactive_library_mqtt_Subscriber._IDLE) {
                        b015.stop();
                        scheduler.stopTimer(_b1_c3_c1_Timer_2_timer);
                        scheduler.startBreak(_b1_c3_Subscribe_Handler_t0);
                        b004_RECONN_OK_r2 = false;
                        b015_SUBS_OK_r0 = false;
                        scheduler.flushEventQueue(sessionID, "SUBS_OK_b015");
                        b015_SUBS_ERROR_r1 = false;
                        scheduler.flushEventQueue(sessionID, "SUBS_ERROR_b015");
                        // step 8ef1b;
                        return CONSUME_SIGNAL;
                    } else if (b015_state == Com_bitreactive_library_mqtt_Subscriber.ACTIVE) {
                        b015.stop();
                        scheduler.stopTimer(_b1_c3_c1_Timer_2_timer);
                        scheduler.startBreak(_b1_c3_Subscribe_Handler_t0);
                        b004_RECONN_OK_r2 = false;
                        b015_SUBS_OK_r0 = false;
                        scheduler.flushEventQueue(sessionID, "SUBS_OK_b015");
                        b015_SUBS_ERROR_r1 = false;
                        scheduler.flushEventQueue(sessionID, "SUBS_ERROR_b015");
                        b015_state = Com_bitreactive_library_mqtt_Subscriber._IDLE;
                        // step 79415;
                        return CONSUME_SIGNAL;
                    } else {
                        return DISCARD_SIGNAL;
                    }
                } else if (b016_state == Com_bitreactive_library_timers_Timer2.ACTIVE) {
                    b015.stop();
                    scheduler.stopTimer(_b1_c3_c1_Timer_2_timer);
                    scheduler.startBreak(_b1_c3_Subscribe_Handler_t0);
                    b004_RECONN_OK_r2 = false;
                    b015_SUBS_OK_r0 = false;
                    scheduler.flushEventQueue(sessionID, "SUBS_OK_b015");
                    b015_SUBS_ERROR_r1 = false;
                    scheduler.flushEventQueue(sessionID, "SUBS_ERROR_b015");
                    b016_state = Com_bitreactive_library_timers_Timer2._IDLE;
                    // step 15a39;
                    return CONSUME_SIGNAL;
                } else {
                    return DISCARD_SIGNAL;
                }
            } else {
                b004_RECONN_OK_r2 = false;
                // step 7f206;
                return CONSUME_SIGNAL;
            }
        } else {
            return DISCARD_SIGNAL;
        }
    }

    private int handleEvent_RECONN_FAILED_b004(java.lang.Object _sender, java.lang.Object receiverSessionID, java.lang.Object _data) {
        if (b004_RECONN_FAILED_r3) {
            int b004_o3 = b004.getWaitingDuration();
            scheduler.startOrRestartTimer(_b1_c1_Conn_Handler_t0, b004_o3);
            b004_RECONN_FAILED_r3 = false;
            // step 4d10f;
            return CONSUME_SIGNAL;
        } else {
            return DISCARD_SIGNAL;
        }
    }

    private int handleEvent_PUB_OK_b009(java.lang.Object _sender, java.lang.Object receiverSessionID, java.lang.Object _data) {
        if (b009_PUB_OK_r0) {
            if (b008.isEmpty()) {
                b008_stm_state = Com_bitreactive_library_buffering_BufferEager_Stm.READY;
                b009_PUB_OK_r0 = false;
                scheduler.flushEventQueue(sessionID, "PUB_OK_b009");
                b009_PUB_ERROR_r1 = false;
                scheduler.flushEventQueue(sessionID, "PUB_ERROR_b009");
                b008_state = Com_bitreactive_library_buffering_BufferEager.READY;
                b009_state = Com_bitreactive_library_mqtt_Publisher._IDLE;
                // step 3f0c6;
                return CONSUME_SIGNAL;
            } else {
                b008.getFromBuffer();
                b007.msg = b008.out;
                if (b007.discardDueToFreshness()) {
                    b007.getNext();
                    scheduler.startBreak(_b1_c2_b0_Publish_Handler_t3);
                    b009_PUB_OK_r0 = false;
                    scheduler.flushEventQueue(sessionID, "PUB_OK_b009");
                    b009_PUB_ERROR_r1 = false;
                    scheduler.flushEventQueue(sessionID, "PUB_ERROR_b009");
                    b009_state = Com_bitreactive_library_mqtt_Publisher._IDLE;
                    // step afd78;
                    return CONSUME_SIGNAL;
                } else {
                    if (b007.isConnected()) {
                        com.bitreactive.library.mqtt.publisher.Publisher.Parameters b007_o2 = b007.addClient();
                        _b1_c2_b0_Publish_Handler_t0_data = b007_o2;
                        scheduler.startBreak(_b1_c2_b0_Publish_Handler_t0);
                        b009_PUB_OK_r0 = false;
                        scheduler.flushEventQueue(sessionID, "PUB_OK_b009");
                        b009_PUB_ERROR_r1 = false;
                        scheduler.flushEventQueue(sessionID, "PUB_ERROR_b009");
                        b009_state = Com_bitreactive_library_mqtt_Publisher._IDLE;
                        // step 4cee6;
                        return CONSUME_SIGNAL;
                    } else {
                        if (b007.discardDueToQos()) {
                            b007.getNext();
                            scheduler.startBreak(_b1_c2_b0_Publish_Handler_t3);
                            b009_PUB_OK_r0 = false;
                            scheduler.flushEventQueue(sessionID, "PUB_OK_b009");
                            b009_PUB_ERROR_r1 = false;
                            scheduler.flushEventQueue(sessionID, "PUB_ERROR_b009");
                            b009_state = Com_bitreactive_library_mqtt_Publisher._IDLE;
                            // step fd167;
                            return CONSUME_SIGNAL;
                        } else {
                            b007.toWait();
                            _b1_c2_b0_Publish_Handler_t2_data = b007.msg;
                            scheduler.startOrRestartTimer(_b1_c2_b0_Publish_Handler_t2);
                            b009_PUB_OK_r0 = false;
                            scheduler.flushEventQueue(sessionID, "PUB_OK_b009");
                            b009_PUB_ERROR_r1 = false;
                            scheduler.flushEventQueue(sessionID, "PUB_ERROR_b009");
                            b009_state = Com_bitreactive_library_mqtt_Publisher._IDLE;
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

    private int handleEvent_PUB_ERROR_b009(java.lang.Object _sender, java.lang.Object receiverSessionID, java.lang.Object _data) {
        if (b009_PUB_ERROR_r1) {
            b007.msg = ((com.bitreactive.library.mqtt.MQTTMessage) _data);
            if (b007.discardDueToFreshness()) {
                b007.getNext();
                scheduler.startBreak(_b1_c2_b0_Publish_Handler_t3);
                b009_PUB_OK_r0 = false;
                scheduler.flushEventQueue(sessionID, "PUB_OK_b009");
                b009_PUB_ERROR_r1 = false;
                scheduler.flushEventQueue(sessionID, "PUB_ERROR_b009");
                b009_state = Com_bitreactive_library_mqtt_Publisher._IDLE;
                // step 2e63e;
                return CONSUME_SIGNAL;
            } else {
                if (b007.discardDueToQos()) {
                    b007.getNext();
                    scheduler.startBreak(_b1_c2_b0_Publish_Handler_t3);
                    b009_PUB_OK_r0 = false;
                    scheduler.flushEventQueue(sessionID, "PUB_OK_b009");
                    b009_PUB_ERROR_r1 = false;
                    scheduler.flushEventQueue(sessionID, "PUB_ERROR_b009");
                    b009_state = Com_bitreactive_library_mqtt_Publisher._IDLE;
                    // step 11297;
                    return CONSUME_SIGNAL;
                } else {
                    com.bitreactive.library.mqtt.publisher.Publisher.Parameters b007_o2 = b007.addClient();
                    _b1_c2_b0_Publish_Handler_t0_data = b007_o2;
                    scheduler.startBreak(_b1_c2_b0_Publish_Handler_t0);
                    b009_PUB_OK_r0 = false;
                    scheduler.flushEventQueue(sessionID, "PUB_OK_b009");
                    b009_PUB_ERROR_r1 = false;
                    scheduler.flushEventQueue(sessionID, "PUB_ERROR_b009");
                    b009_state = Com_bitreactive_library_mqtt_Publisher._IDLE;
                    // step dad2f;
                    return CONSUME_SIGNAL;
                }
            }
        } else {
            return DISCARD_SIGNAL;
        }
    }

    private int handleEvent_PUB_OK_b011(java.lang.Object _sender, java.lang.Object receiverSessionID, java.lang.Object _data) {
        if (b011_PUB_OK_r0) {
            b012.remove();
            b011_PUB_OK_r0 = false;
            scheduler.flushEventQueue(sessionID, "PUB_OK_b011");
            b011_PUB_ERROR_r1 = false;
            scheduler.flushEventQueue(sessionID, "PUB_ERROR_b011");
            b012_REMOVED_r0 = true;
            b011_state = Com_bitreactive_library_mqtt_Publisher._IDLE;
            b012_state = Com_bitreactive_library_buffering_PersistentBuffer.REMOVING;
            // step ae94f;
            return CONSUME_SIGNAL;
        } else {
            return DISCARD_SIGNAL;
        }
    }

    private int handleEvent_PUB_ERROR_b011(java.lang.Object _sender, java.lang.Object receiverSessionID, java.lang.Object _data) {
        if (b011_PUB_ERROR_r1) {
            b013.msg = ((com.bitreactive.library.mqtt.MQTTMessage) _data);
            if (b013.discardDueToFreshness()) {
                b013.getNext();
                scheduler.startBreak(_b1_c2_b1_Publish_Handler_2_t2);
                b011_PUB_OK_r0 = false;
                scheduler.flushEventQueue(sessionID, "PUB_OK_b011");
                b011_PUB_ERROR_r1 = false;
                scheduler.flushEventQueue(sessionID, "PUB_ERROR_b011");
                b011_state = Com_bitreactive_library_mqtt_Publisher._IDLE;
                // step 839d5;
                return CONSUME_SIGNAL;
            } else {
                if (b013.discardDueToQos()) {
                    b013.getNext();
                    scheduler.startBreak(_b1_c2_b1_Publish_Handler_2_t2);
                    b011_PUB_OK_r0 = false;
                    scheduler.flushEventQueue(sessionID, "PUB_OK_b011");
                    b011_PUB_ERROR_r1 = false;
                    scheduler.flushEventQueue(sessionID, "PUB_ERROR_b011");
                    b011_state = Com_bitreactive_library_mqtt_Publisher._IDLE;
                    // step ea271;
                    return CONSUME_SIGNAL;
                } else {
                    com.bitreactive.library.mqtt.publisher.Publisher.Parameters b013_o2 = b013.addClient();
                    _b1_c2_b1_Publish_Handler_2_t3_data = b013_o2;
                    scheduler.startBreak(_b1_c2_b1_Publish_Handler_2_t3);
                    b011_PUB_OK_r0 = false;
                    scheduler.flushEventQueue(sessionID, "PUB_OK_b011");
                    b011_PUB_ERROR_r1 = false;
                    scheduler.flushEventQueue(sessionID, "PUB_ERROR_b011");
                    b011_state = Com_bitreactive_library_mqtt_Publisher._IDLE;
                    // step cdb3b;
                    return CONSUME_SIGNAL;
                }
            }
        } else {
            return DISCARD_SIGNAL;
        }
    }

    private int handleEvent_REMOVED_b012(java.lang.Object _sender, java.lang.Object receiverSessionID, java.lang.Object _data) {
        if (b012_REMOVED_r0) {
            if (((com.bitreactive.library.mqtt.MQTTMessage) _data) == null) {
                b010.empty();
                int b010_o2 = b010.getDuration();
                scheduler.startOrRestartTimer(_b1_c2_b1_Publish_Handler_2_t0, b010_o2);
                b012_REMOVED_r0 = false;
                b012_state = Com_bitreactive_library_buffering_PersistentBuffer.ACTIVE;
                // step bf021;
                return CONSUME_SIGNAL;
            } else {
                b010.removed();
                int b010_o2 = b010.getDuration();
                scheduler.startOrRestartTimer(_b1_c2_b1_Publish_Handler_2_t0, b010_o2);
                b012_REMOVED_r0 = false;
                b012_state = Com_bitreactive_library_buffering_PersistentBuffer.ACTIVE;
                // step 490ed;
                return CONSUME_SIGNAL;
            }
        } else {
            return DISCARD_SIGNAL;
        }
    }

    private int handleEvent_INIT_b012(java.lang.Object _sender, java.lang.Object receiverSessionID, java.lang.Object _data) {
        if (b012_INIT_r1) {
            int b010_o2 = b010.getDuration();
            scheduler.startBreak(_SensorApp_t1);
            scheduler.startOrRestartTimer(_b1_c2_b1_Publish_Handler_2_t0, b010_o2);
            b012_INIT_r1 = false;
            b002_state = Com_bitreactive_library_mqtt_RobustMQTT.ACTIVE;
            b010_state = Com_bitreactive_library_mqtt_PublishHandler2.ACTIVE;
            b012_state = Com_bitreactive_library_buffering_PersistentBuffer.ACTIVE;
            // step 88f0f;
            return CONSUME_SIGNAL;
        } else {
            return DISCARD_SIGNAL;
        }
    }

    private int handleEvent_SUBS_OK_b015(java.lang.Object _sender, java.lang.Object receiverSessionID, java.lang.Object _data) {
        if (b015_SUBS_OK_r0) {
            b015_SUBS_OK_r0 = false;
            scheduler.flushEventQueue(sessionID, "SUBS_OK_b015");
            b015_SUBS_ERROR_r1 = false;
            scheduler.flushEventQueue(sessionID, "SUBS_ERROR_b015");
            b015_state = Com_bitreactive_library_mqtt_Subscriber._IDLE;
            // step 927c6;
            return CONSUME_SIGNAL;
        } else {
            return DISCARD_SIGNAL;
        }
    }

    private int handleEvent_SUBS_ERROR_b015(java.lang.Object _sender, java.lang.Object receiverSessionID, java.lang.Object _data) {
        if (b015_SUBS_ERROR_r1) {
            int b014_o0 = b014.getDuration();
            b016.duration = b014_o0;
            scheduler.startOrRestartTimer(_b1_c3_c1_Timer_2_timer, b016.duration);
            b015_SUBS_OK_r0 = false;
            scheduler.flushEventQueue(sessionID, "SUBS_OK_b015");
            b015_SUBS_ERROR_r1 = false;
            scheduler.flushEventQueue(sessionID, "SUBS_ERROR_b015");
            b015_state = Com_bitreactive_library_mqtt_Subscriber._IDLE;
            b016_state = Com_bitreactive_library_timers_Timer2.ACTIVE;
            // step 84d7f;
            return CONSUME_SIGNAL;
        } else {
            return DISCARD_SIGNAL;
        }
    }
}
