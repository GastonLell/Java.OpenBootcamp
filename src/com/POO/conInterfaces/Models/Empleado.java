package com.POO.conInterfaces.Models;

public class Empleado {
    //1. Atributos
    String nombre;
    int edad;
    double salario;
    boolean alta;

    //2. Constructor

    public Empleado(String nombre, int edad, double salario, boolean alta) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.alta = alta;
    }
    //3. Metodos


    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", alta=" + alta +
                '}';
    }
}
