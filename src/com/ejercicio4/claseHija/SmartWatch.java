package com.ejercicio4.claseHija;

import com.ejercicio4.clasePadre.SmartDevice;

public class SmartWatch extends SmartDevice {
    //atributos
    double camera;
    boolean cameraActivated;
    //constructores
    public SmartWatch() {}

    public SmartWatch(boolean enable, boolean wifiEnabled, int battery, double camera) {
        super(enable, wifiEnabled, battery);
        this.camera = camera;
        this.cameraActivated = false;
    }

    //metodos
    public void useCamera(boolean enable){
        this.cameraActivated = enable;
    }

    //geters

    @Override
    public String toString() {
        return "SmartWatch{" +
                "camera=" + camera +
                ", cameraActivated=" + cameraActivated +
                '}';
    }
}
