package com.ejercicio4;

import com.ejercicio4.claseHija.SmartPhone;
import com.ejercicio4.claseHija.SmartWatch;

public class Main {
    public static void main(String[] args) {

        //SmartPhone
        SmartPhone mySmartPhone = new SmartPhone(true, false, 50, 2);

        System.out.println(mySmartPhone.toString());

        mySmartPhone.activateBuetooth(true);
        mySmartPhone.batteryCharge(100);
        System.out.println(mySmartPhone.toString());


        //SmartWatch
        SmartWatch mySmartWatch = new SmartWatch(true, false, 75, 4);

        System.out.println(mySmartWatch.toString());

        mySmartWatch.useCamera(true);

        System.out.println(mySmartWatch.toString());


    }
}
