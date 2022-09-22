package com.ejercicio10;

import java.io.*;

public class EntradaSalida {
    public static void main(String[] args){
        try{
            InputStream fichero = new FileInputStream("C:\\Users\\Usuario\\IdeaProjects\\EjerciciosOpenBootcamp\\src\\fileInput.txt");

            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);
            try{

                int dato = ficheroBuffer.read();


                System.out.print((char) dato);
                while(dato != -1){
                    //-1 es EOF (End of file)
                    System.out.println((char) dato);
                    dato = ficheroBuffer.read();
                }



            } catch (IOException e){
                System.out.println("No se puede leer el fichero: " + e.getMessage());
            }
        } catch(FileNotFoundException e){
            System.out.println("Error del programa: " + e.getMessage());
        }

    }
}
