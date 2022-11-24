package Observer;

public class ReceptorSatelite implements Receptor{
    @Override
    public void receives(){
        System.out.println("Recibiendo emision desde satelite");
    }
}
