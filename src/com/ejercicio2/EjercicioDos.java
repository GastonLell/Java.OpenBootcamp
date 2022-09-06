package com.ejercicio2;

public class EjercicioDos {
    public static void main(String[] args){
        System.out.println(getPricaWithIVA(100));
    }

    public static double getPricaWithIVA(double price){
        double result = (price * 20) / 100;
        return price + result;

    }
}
