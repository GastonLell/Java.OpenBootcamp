package State;

public class LockedStatus extends State{


    public LockedStatus(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String unLock() {
        telefono.setState(new UnlockedState(telefono));
        return "Desbloquear(): movil desbloqueado";
    }

    @Override
    public String openCamera() {
        return "AbrirCamara(): La camara esta bloqueada, Desbloquea el movil antes";
    }

    @Override
    public String takePhoto() {
        return "TomarFoto(): La camara esta bloqueada, Desbloquea el movil antes";
    }
}
