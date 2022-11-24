package State;

public class UnlockedState extends State{


    public UnlockedState(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String unLock() {
        return "El movil ya esta desbloqueado";
    }

    @Override
    public String openCamera() {
        telefono.setState(new OpenCameraState(telefono));
        return "Camara abierta, puedes tomar la foto";
    }

    @Override
    public String takePhoto() {
        return "No se puede tomar la foto sin abrir la camara";
    }
}
