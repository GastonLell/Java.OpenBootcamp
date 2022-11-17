package Singleton;

public class Main {
    public static void main(String[] args){


        Singleton singleton = Singleton.getInstance();
        singleton.setCounter(15);

        Singleton singleton2 = Singleton.getInstance();
        singleton2.setCounter(10);


        System.out.println("Valor 1: " + singleton.getCounter()  + " Direccion de memoria " + singleton);
        System.out.println("Valor 2: " + singleton2.getCounter()  + " Direccion de memoria " + singleton2);

    }
}
