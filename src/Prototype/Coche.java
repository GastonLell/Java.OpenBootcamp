package Prototype;

public class Coche {
    public String marca;
    public String modelo;
    public int puertas;

    public Coche(){

    }

    public Coche clonar(){
        Coche clone = new Coche();

        clone.marca = this.marca;
        clone.modelo = this.modelo;
        clone.puertas = this.puertas;

        return clone;
    }

}
