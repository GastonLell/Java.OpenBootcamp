package com.exercise_5.interfaces;

import com.exercise_5.models.Coche;

import java.util.List;

public interface CocheCRUD {
    public void save();
    public List<Coche> findAll();
    public void delete();
}
