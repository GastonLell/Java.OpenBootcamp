package com.POO.sinInterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();
        //crear empleado
        Empleado juanito = new Empleado("Juanito", 25, 40000, true);
        Empleado patricia = new Empleado("patricia", 25, 40000, true);
        Empleado roberto = new Empleado("roberto", 25, 40000, true);

        //guardar empleado
        empleadoCRUD.store(juanito);
        empleadoCRUD.store(patricia);
        empleadoCRUD.store(roberto);

        List<Empleado> empleados = empleadoCRUD.getAll();

        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }

    }
}
