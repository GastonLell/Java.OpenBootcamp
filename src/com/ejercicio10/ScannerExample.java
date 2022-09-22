package com.ejercicio10;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa dos numeros");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Los numeros son: " + a + " " + b);

            PrintStream info = new PrintStream("copia.txt");
            info.println("Agregando datos a mi nuevo fichero");
            info.close();
        }catch(InputMismatchException | FileNotFoundException e) {
            System.out.println("Numeros invalidos:" + e.getMessage());
        }
    }
}
