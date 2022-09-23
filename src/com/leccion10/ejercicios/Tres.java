package com.leccion10.ejercicios;

import java.util.Vector;

public class Tres {
    public static void main(String[] args) {
        Vector vNumber = new Vector(5);

        vNumber.insertElementAt(3,0);
        vNumber.insertElementAt(4,1);
        vNumber.insertElementAt(5,2);
        vNumber.insertElementAt(6,3);
        vNumber.insertElementAt(7,4);


        vNumber.remove(2);
        vNumber.remove(2);



        for(int i=0; i < vNumber.size(); i++){
            System.out.println(vNumber.elementAt(i));
        }
    }
}
