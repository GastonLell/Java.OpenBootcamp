package Decorator;

public class Main {
    public static void main(String[] args){

        System.out.println("---------------------TELEFONO BASICO----------------------");

        TelefonoBasico telefonoBasico = new TelefonoBasico();
        telefonoBasico.crear();

        System.out.println("-----------TELEFONO INTELIGENTE EXTENDIDO DEL BASICO-------");


        TelefonoInteligente telefonoInteligente = new TelefonoInteligente(new TelefonoBasico());
        telefonoInteligente.crear();


        System.out.println("------------TELEFONO NEXTGEN EXTENDIDO DEL BASICO-----------");


        TelefonoNextGen tBasicAndGen = new TelefonoNextGen(new TelefonoBasico());
        tBasicAndGen.crear();


        System.out.println("----TELEFONO NEXT GEN EXTENDIDO DEL INTELIGENTE EXTENDIDO DEL BASICO----");


        TelefonoNextGen tFull = new TelefonoNextGen(
                new TelefonoInteligente(
                        new TelefonoBasico()
                )
        );
        tFull.crear();
    }
}
