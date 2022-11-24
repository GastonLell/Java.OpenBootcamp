package Mediator;

public class ConcreteColleague1 extends Colega{
    @Override
    void receives(){
        System.out.println("Recibi un mensaje, soy colega 1");
    }

    @Override
    void send(){
        System.out.println("Soy colega concreto 1, envio un mensaje");
        mediator.resend(this);
    }
}
