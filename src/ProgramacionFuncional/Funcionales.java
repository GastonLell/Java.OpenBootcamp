package ProgramacionFuncional;

import java.util.function.Function;

public class Funcionales {
    private Function<String, String> toMayus = (x) -> x.toUpperCase();
    private Function<Integer, Integer> sum = (x) -> x.sum(x, x);

    public void pruebas() {
        System.out.println(toMayus.apply("Gaston"));
        System.out.println(sum.apply(15));
    }

    public String Saluda(Function<String, String> func, String nombre) {
        return func.apply("Hola" + " " + nombre);
    }
}
