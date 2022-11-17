package Factory.Transport;

public class Motocycle implements Transport {
    @Override
    public void start(){
        System.out.println("Estoy arrancando la motocicleta");
    }

    @Override
    public void stop(){
        System.out.println("Estoy deteniendo la motocicleta");
    }

    @Override
    public String type(){
        return "Motocicleta";
    }
}
