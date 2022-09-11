package com.exercise_5.services;

import com.exercise_5.interfaces.CocheCRUD;
import com.exercise_5.models.Coche;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {


    @Override
    public void save() {
        System.out.println("Save");
    }

    @Override
    public List<Coche> findAll() {
        System.out.println("findAll");
        return null;
    }

    @Override
    public void delete() {
        System.out.println("Delete");
    }
}
