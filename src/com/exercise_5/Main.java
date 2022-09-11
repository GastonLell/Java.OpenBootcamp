package com.exercise_5;

import com.exercise_5.services.CocheCRUDImpl;

public class Main {
    public static void main(String[] args){
        CocheCRUDImpl cocheCrudImpl = new CocheCRUDImpl();

        cocheCrudImpl.save();
        cocheCrudImpl.findAll();
        cocheCrudImpl.delete();

    }
}
