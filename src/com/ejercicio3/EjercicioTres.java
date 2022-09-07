package com.ejercicio3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EjercicioTres {
    public static void main(String[] args){
        String[] testArray = new String[]{"Pedro", "Juan", "John"};

        System.out.println(concatStrings(testArray));
        
    }

    public static String concatStrings(String[] strings){
        String myConcatString = "";
        for(int i = 0; i < strings.length; i++){
            myConcatString = myConcatString + "  " + strings[i];
        }
        return myConcatString;
    }
}
