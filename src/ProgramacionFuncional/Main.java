package ProgramacionFuncional;

import java.util.ArrayList;
import java.util.Locale;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Funcionales f = new Funcionales();
        f.pruebas();

        ArrayList<String> nombres = new ArrayList();

        nombres.add("Paco");
        nombres.add("Pepe");
        nombres.add("Juan");

        //nombres.stream().forEach(System.out::println);
        //FORMAS DE RECORRER ESTOS VALORES Y APLICARLE ALGUNA FUNCION
        //LA FUNCION MAP ME RETORNA CADA VALOR DEL ARRAY Y LE APLICA LA FUNCION AL STRING
        //se puede concatenar funciones por ejemplo el map, y luego el filtro
        Stream<String> valores = nombres.stream()
                .map(x -> x.toUpperCase())
                .filter(x -> x.startsWith("P"));

        //EL FOR EACH SE CONSUME, NO QUEDA EL VALOR GUARDADO
        valores.forEach(System.out::println);

    }
}
