package Observer;

import java.util.ArrayList;

public class Emisora {
    private ArrayList<Receptor> receivers = new ArrayList();

    public void addReceiver(Receptor receiver){
        receivers.add(receiver);
    }

    public void emitter(){
        for(Receptor receiver : receivers){
            receiver.receives();
        }
    }
}
