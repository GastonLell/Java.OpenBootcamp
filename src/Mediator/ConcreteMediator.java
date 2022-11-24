package Mediator;

import java.util.ArrayList;

public class ConcreteMediator extends Mediator {
    ArrayList<Colega> colegas = new ArrayList();

    @Override
    void register(Colega colega) {
        if(!colegas.contains(colega)){
            colegas.add(colega);
            colega.setMediator(this);
        }
    }

    @Override
    void resend(Colega colega) {
        for(Colega currentColega : colegas){
            if(!currentColega.equals(colega)){
                currentColega.receives();
            }
        }
    }
}
