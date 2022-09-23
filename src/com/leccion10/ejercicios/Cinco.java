package com.leccion10.ejercicios;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cinco {

    public static void main(String[] args) {
        List<String> myArrayList = new ArrayList<String>();
        myArrayList.add("Pepe");
        myArrayList.add("Stefano");
        myArrayList.add("Carlos");
        myArrayList.add("Juan");



        List<String> myLinkedList = new LinkedList<String>(myArrayList);

        for(String l: myArrayList){
            System.out.println("myArrayList" + l);
        }

        for( String value : myLinkedList){
            System.out.println("myLinkedList" + value);
        }
    }
}
