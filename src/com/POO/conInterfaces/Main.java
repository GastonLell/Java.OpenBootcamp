package com.POO.conInterfaces;

import com.POO.conInterfaces.Interfaces.EmpleadoCRUD;
import com.POO.conInterfaces.Models.Empleado;
import com.POO.conInterfaces.Services.EmpleadoCRUDMySQL;

import java.util.List;

public class Main {
    static EmpleadoCRUDMySQL empleadoCRUDMySQL;
    public static void main(String[] args){

        empleadoCRUDMySQL.save(new Empleado("Gaston", 27, 120000, true));

        List<Empleado> empleados = empleadoCRUDMySQL.findAll();

        for(Empleado empleado: empleados){
            System.out.println(empleado.toString());
        }
    }
}
