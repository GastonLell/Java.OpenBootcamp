package com.leccion10.ejercicios;

import java.io.*;

public class Ocho {
    public static void main(String[] args) {
       String myFileIn = "C:\\Users\\Usuario\\Documents\\letras\\chamarritas.txt";
       String myFileOut = "C:\\Users\\Usuario\\Documents\\letras\\copia.txt";

        copiarFichero(myFileIn, myFileOut);
    }

    public static void copiarFichero(String fileIn, String fileOut){
        try{
            InputStream input = new FileInputStream(fileIn);
            byte[] datos = input.readAllBytes();

            PrintStream copiaStream = new PrintStream(fileOut);
            copiaStream.write(datos);
            copiaStream.close();

        }catch(IOException e){
            System.out.println("Error : " + e.getMessage());
        }
    }
}
