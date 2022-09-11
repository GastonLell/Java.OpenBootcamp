package com.POO.sinInterfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD {

      private List<Empleado> empleados = new ArrayList<>();


      //crear empleado
      public void store(Empleado empleado){
            empleados.add(empleado);
      }
      public List<Empleado> getAll(){
            return empleados;
      }
}
