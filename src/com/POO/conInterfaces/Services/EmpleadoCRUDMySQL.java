package com.POO.conInterfaces.Services;

import com.POO.conInterfaces.Interfaces.EmpleadoCRUD;
import com.POO.conInterfaces.Models.Empleado;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUDMySQL implements EmpleadoCRUD {

    List<Empleado> empleados = new ArrayList<>();

    @Override
    public void save(Empleado empleado) {
        empleados.add(empleado);
    }

    @Override
    public List<Empleado> findAll() {
        return empleados;
    }

    @Override
    public void delete(Empleado empleado) {
        System.out.println("metodo delete");
    }
}
