package State;

public class OpenCameraState extends State {
    public OpenCameraState(Telefono telefono) {
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
        telefono.setState(new TakePhotoState(telefono));
        return "La foto se va a disparar ya...";
    }
}
