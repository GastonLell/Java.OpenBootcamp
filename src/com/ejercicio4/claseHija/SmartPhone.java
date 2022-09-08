package com.ejercicio4.claseHija;

import com.ejercicio4.clasePadre.SmartDevice;

public class SmartPhone extends SmartDevice {
    double camera;
    boolean bluetoothActivated;
    //constructores
    public SmartPhone() {}

    public SmartPhone(boolean enable, boolean wifiEnabled, int battery, double camera) {
        super(enable, wifiEnabled, battery);
        this.camera = camera;
        this.bluetoothActivated = false;
    }

    //metodos
    public void activateBuetooth(boolean enable){
        this.bluetoothActivated = enable;
    }

    //geters

    @Override
    public String toString() {
        return "SmartPhone{" +
                "camera=" + camera +
                ", bluetoothActivated=" + bluetoothActivated +
                '}';
    }
}
