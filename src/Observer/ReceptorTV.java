package Observer;

public class ReceptorTV implements Receptor{
    @Override
    public void receives(){
        System.out.println("Recibiendo emision desde TV");
    }
}

