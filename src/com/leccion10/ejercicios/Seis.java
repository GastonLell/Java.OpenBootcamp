package com.leccion10.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Seis {
    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++) {
            listInt.add(i);
        }
        System.out.println(listInt);
        for(int i = 0; i < listInt.size(); i++) {
            if(listInt.get(i) % 2 == 0) {
                listInt.remove(i);
                continue;
            }
        }
        for(int i = 0; i < listInt.size(); i++) {
            System.out.println(listInt.get(i));
        }
    }
}
