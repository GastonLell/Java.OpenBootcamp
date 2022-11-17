package TransportFactory;

public class TransportFactory {
    Transport transportType;

    private TransportFactory(){}

    public TransportFactory(String transportType){
        if(transportType.equalsIgnoreCase("Automovil")){
            System.out.println("Automovil");
            this.transportType = new Automovil();
        } else if (transportType.equalsIgnoreCase("Motocycle")){
            System.out.println("Motocycle");
            this.transportType = new Motocycle();
        }
    }

}
