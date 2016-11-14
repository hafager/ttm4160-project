package no.item.ntnu.ttm4160.airqualityapp.sensorapp.component;

public class ComponentSM extends no.ntnu.item.arctis.runtime.IStateMachine {

    private no.item.ntnu.ttm4160.airqualityapp.sensorapp.component.Component b000;
    private no.item.ntnu.ttm4160.airqualityapp.co2sensor.CO2Sensor b001;
    private no.ntnu.item.arctis.runtime.IStateMachine.Timer _SensorApp_t0;
    private no.ntnu.item.arctis.runtime.IStateMachine.Break _SensorApp_t1;
    private no.ntnu.item.arctis.runtime.IStateMachine.Timer _SensorApp_t2;

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
        _SensorApp_t0 = new no.ntnu.item.arctis.runtime.IStateMachine.Timer(20000, "_SensorApp_t0", this);
        _SensorApp_t1 = new no.ntnu.item.arctis.runtime.IStateMachine.Break("_SensorApp_t1", this);
        _SensorApp_t2 = new no.ntnu.item.arctis.runtime.IStateMachine.Timer(1000, "_SensorApp_t2", this);
        b001.init();
        scheduler.startBreak(_SensorApp_t1);
        // step 48828;
        return CONSUME_SIGNAL;
    }

    public int fireTimer(java.lang.String _timerID) {
        if (_timerID.equals("_SensorApp_t0")) {
            return handleTimer__SensorApp_t0();
        } else if (_timerID.equals("_SensorApp_t1")) {
            return handleTimer__SensorApp_t1();
        } else if (_timerID.equals("_SensorApp_t2")) {
            return handleTimer__SensorApp_t2();
        }
        return DISCARD_SIGNAL;
    }

    public int fire(java.lang.Object _sender, java.lang.Object receiverSessionID, java.lang.String _signalID, java.lang.Object _data) {
        return TRIGGER_UNKNOWN;
    }

    private int handleTimer__SensorApp_t0() {
        b001.stop();
        // step a97f9;
        return TERMINATE_MACHINE;
    }

    private int handleTimer__SensorApp_t1() {
        java.lang.String b001_o0 = b001.readData();
        b000.printCO2(b001_o0);
        scheduler.startOrRestartTimer(_SensorApp_t0);
        scheduler.startOrRestartTimer(_SensorApp_t2);
        // step af993;
        return CONSUME_SIGNAL;
    }

    private int handleTimer__SensorApp_t2() {
        java.lang.String b001_o0 = b001.readData();
        b000.printCO2(b001_o0);
        scheduler.startOrRestartTimer(_SensorApp_t0);
        scheduler.startOrRestartTimer(_SensorApp_t2);
        // step 33361;
        return CONSUME_SIGNAL;
    }
}
