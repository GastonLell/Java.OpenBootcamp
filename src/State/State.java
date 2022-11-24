package State;


abstract public class State {
    public Telefono telefono;

    public State(Telefono telefono){
        this.telefono = telefono;
    }

    public String unLock(){
        return "Telefono desbloqueado";
    }
    public String openCamera(){
        return "Camara abierta";
    }
    public String takePhoto(){
        return "Tomando foto";
    }
}
