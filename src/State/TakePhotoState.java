package State;

public class TakePhotoState extends State{
    public TakePhotoState(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String unLock() {
        return "Desbloquear(): Ya estaba desbloqueado el movil";
    }

    @Override
    public String openCamera() {
        return "AbrirCamara(): La camara ya la habias abierto";
    }

    @Override
    public String takePhoto() {
        return "Foto tomada";
    }
}
