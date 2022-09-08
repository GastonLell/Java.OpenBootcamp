package com.ejercicio4.clasePadre;

public abstract class SmartDevice {
    boolean enable;
    boolean wifiEnabled;
    int battery;

    public SmartDevice() {}
    public SmartDevice(boolean enable, boolean wifiEnabled, int battery) {
        this.enable = enable;
        this.wifiEnabled = wifiEnabled;
        this.battery = battery;
    }

    //metodos
    public void wifiToggle(boolean isEnable){
        this.wifiEnabled = isEnable;
    }
    public void enableToggle(boolean isEnable){
        this.enable = isEnable;
    }
    public void batteryCharge(int amount){
        if(amount >= 100){
            System.out.println("Full load");
        } else {
            this.battery = amount;
        }
    }

    // geters
    @Override
    public String toString() {
        return "SmartDevice{" +
                "enable=" + enable +
                ", wifiEnabled=" + wifiEnabled +
                ", batery=" + battery +
                '}';
    }

}
