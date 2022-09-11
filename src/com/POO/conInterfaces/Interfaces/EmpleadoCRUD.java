package com.POO.conInterfaces.Interfaces;

import com.POO.conInterfaces.Models.Empleado;

import java.util.List;

/*
* SE DECLARAN LOS METOS, NO SE IMPLEMENTAN
*
* actua como contrato, dice lo que hay que hacer pero no lo hace
*
* */

public interface EmpleadoCRUD {

    void save(Empleado empleado);

    List<Empleado> findAll();

    void delete(Empleado empleado);

}
