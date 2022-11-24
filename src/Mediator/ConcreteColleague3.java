package Mediator;

public class ConcreteColleague3 extends Colega{
    @Override
    void receives(){
        System.out.println("Recibi un mensaje, soy colega 3");
    }

    @Override
    void send(){
        System.out.println("Soy colega concreto 3, envio un mensaje");
        mediator.resend(this);
    }
}
