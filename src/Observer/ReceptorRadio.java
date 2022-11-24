package Observer;

public class ReceptorRadio implements Receptor {
    @Override
    public void receives(){
        System.out.println("Recibiendo emision desde radio");
    }
}

