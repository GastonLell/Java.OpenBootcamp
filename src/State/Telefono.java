package State;

public class Telefono {
    public State state;

    public Telefono(){
        state = new LockedStatus(this);
    }

    public void setState(State state){
        System.out.println("Estado inicial: " + this.state.getClass().getName());
        this.state = state;
        System.out.println("Estado final: " + state.getClass().getName());
    }

    public State getState(){
        return state;
    }
}
