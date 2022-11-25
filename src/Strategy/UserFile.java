package Strategy;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UserFile implements Users{
    private String userFile = "user.txt";
    private PrintStream file;

    public UserFile(){
        try {
            file = new PrintStream(userFile);
        } catch (Exception e) {
            System.out.println("No puedo abrir el fichero: " + e.getMessage());
        }
    }
    @Override
    public void store(String name){
        file.println(name);
    }

    @Override
    public ArrayList<String> getAll(){
        ArrayList<String> users = new ArrayList();

        try {
            Scanner scanner = new Scanner(new File(userFile));

            while(scanner.hasNext()){
                users.add(scanner.next());
            }
        } catch (Exception e){
            System.out.println("No puedo guardar el nombre: " + e.getMessage());
        }
        return users;
    }

}
