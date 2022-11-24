package Prototype;

public class Main {
    public static void main(String[] args){
        Coche coche = new Coche();
        coche.puertas = 5;
        coche.marca = "Filostro";
        coche.modelo = "Coupe";

        System.out.println("Puertas: " + coche.puertas + " Marca: " + coche.marca + " Modelo " + coche.modelo);


        Coche cocheClonado = coche.clonar();
        cocheClonado.puertas = 3;
        System.out.println("Puertas: " + cocheClonado.puertas + " Marca: " + cocheClonado.marca + " Modelo " + cocheClonado.modelo);

    }
}
