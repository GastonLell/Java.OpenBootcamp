package Mediator;

abstract public class Colega {

    public Mediator mediator;
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    void receives(){}
    void send(){}
}
