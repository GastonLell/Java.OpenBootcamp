package Mediator;

public class Main {
    public static void main(String[] args){
        Mediator mediator = new ConcreteMediator();

        Colega colega1 = new ConcreteColleague1();

        Colega colega2 = new ConcreteColleague2();

        Colega colega3 = new ConcreteColleague3();

        mediator.register(colega1);
        mediator.register(colega2);
        mediator.register(colega3);


        colega1.send();
        colega2.send();
        colega3.send();

    }
}
