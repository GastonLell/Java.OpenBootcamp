package State;

public class Main {
    public static void main(String[] args){
        Telefono tel1 = new Telefono();
        tel1.state.unLock();
        tel1.state.openCamera();
        System.out.println(tel1.state.takePhoto());
        System.out.println(tel1.state.takePhoto());

    }
}
