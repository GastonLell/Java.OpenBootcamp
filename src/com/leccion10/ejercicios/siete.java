package com.leccion10.ejercicios;

public class siete {
    public static void main(String[] args) {
        dividePorCero(5);
    }
    public static void dividePorCero(int n){
        try{
            int result = n / 0;
            System.out.println(result);
        }catch(ArithmeticException  e){
            System.out.println("Esto no puede hacerse");
        }
    }
}
