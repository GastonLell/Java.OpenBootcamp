package Refactor;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int []numbers = {12, 23, -45, 1, 9};

        printMinAndMax(numbers);
    }

    //    public static void printMinAndMax(int[] numbers){
    //        int mayor = 0;
    //        int menor = numbers[0];
    //
    //        for(int i = 1; i < numbers.length; i++){
    //            if(mayor < numbers[i]){
    //                mayor = numbers[i];
    //            }
    //
    //            if(menor > numbers[i]){
    //                menor = numbers[i];
    //            }
    //        }
    //        System.out.println("Mayor: " + mayor + " menor: " + menor);
    //    }

//   ------------------- OTRO REFACTOR  -----------------
    //    public static void printMinAndMax(int[] numbers){
    //        int mayor = 0;
    //        int menor = numbers[0];
    //
    //        for(int i = 1; i < numbers.length; i++) {
    //            mayor = mayor < numbers[i] ? numbers[i] : mayor;
    //            menor = menor > numbers[i] ? numbers[i] : menor;
    //        }
    //        System.out.println("Mayor: " + mayor + " menor: " + menor);
    //    }

//   ------------------- OTRO REFACTOR  -----------------

    //    public static void printMinAndMax(int[] numbers){
    //        int mayor = 0;
    //        int menor = numbers[0];
    //
    //        for(int i: numbers) {
    //            mayor = mayor < i ? i : mayor;
    //            menor = menor > i ? i: menor;
    //        }
    //        System.out.println("Mayor: " + mayor + " menor: " + menor);
    //    }

    //   ------------------- OTRO REFACTOR  -----------------

    public static void printMinAndMax(int[] numbers){
        int mayor = Arrays.stream(numbers).reduce(0, (a ,b ) -> a > b ? a : b);
        int menor = Arrays.stream(numbers).reduce(numbers[0], (a ,b ) -> a < b ? a : b);

        System.out.println("Mayor: " + mayor + " menor: " + menor);
    }

}
