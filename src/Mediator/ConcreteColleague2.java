package Mediator;

public class ConcreteColleague2 extends Colega{
    @Override
    void receives(){
        System.out.println("Recibi un mensaje, soy colega 2");
    }

    @Override
    void send(){
        System.out.println("Soy colega concreto 2, envio un mensaje");
        mediator.resend(this);
    }
}
