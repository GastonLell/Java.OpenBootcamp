package ProgramacionFuncional;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        System.out.println("suma iterativa: " + suma(5));

        System.out.println("Suma recursiva: " + sumaRecursive(5));
        System.out.println("Suma funcional: " + sumaFuncional(5));

        //recursion, iteracion
        tailRecursion(5);
        headRecursion(5);
    }

    public static int suma(int max) {
        int result = 0;

        for(int i = 0; i <= max; i++){
            result += i;
        }
        return result;
    }

    public static int sumaRecursive(int max ){
        if(max == 1) return 1;

        return max + sumaRecursive(max - 1);
    }

    //recursion de cola: primero se ejecuta el system.out y luego la recursion
    //por lo que el resultado sera 5-4-3-2-1
    public static void tailRecursion(int value){
        if (value == 0) return;

        System.out.println(value);
        tailRecursion(value - 1);
    }


    //recursion de cabeza: primero se ejecuta la recursion y hasta no finalizar no realiza el system.out
    //por lo que el resultado sera 1-2-3-4-5
    //porque la recursion esta en bucle, y no se ejecuta el systemOut hasta no finalizar dicho bucle
    public static void headRecursion(int value){
        if (value == 0) return;

        headRecursion(value - 1);
        System.out.println(value);
    }

    //suma con lambda de Java
    public static int sumaFuncional(int value){
        return IntStream.rangeClosed(1, value).reduce(0, (a,b) -> a + b);
    }
}
