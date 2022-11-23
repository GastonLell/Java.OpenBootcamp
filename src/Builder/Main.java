package Builder;

public class Main {
    public static void main(String[] args){

        Vehiculo vehiculo = new VehiculoBuilder("Ford")
                .setPuertas(5)
                .setMotor("Electrico")
                .build();

        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Motor: " + vehiculo.getMotor());

    }
}
