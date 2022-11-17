package Factory.Transport;

public class Automovil implements Transport{
    @Override
    public void start() {
        System.out.println("Estoy arrancando el automovil");
    }

    @Override
    public void stop() {
        System.out.println("Estoy deteniendo el automovil");
    }

    @Override
    public String type() {
        return "Automovil";
    }
}
