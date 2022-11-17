package Singleton.Basic;

public class Singleton {

    //el patron singleton espera que la clase se instancie una sola vez,
    //luego de eso no crea nuevas clases, sino que busca utilizar la primer instancia creada
    //para utilizar la misma direccion de memoria.

    int counter = 0;
    private static Singleton singleton;

    //uso el constructor privado para que no se pueda instanciar desde fuera de la clase
    private Singleton() {}


    //get instance es la forma común de llamar esta funcion en este patron
    //si singleton no esta instanciado (seria null) la func instancia a singleton con 'new Singleton()'
    //si singleton no es null (ya estaria instanciado) devuelve el mismo singleton.
    public static Singleton getInstance() {
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

}
