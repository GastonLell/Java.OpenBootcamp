package Strategy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        UsersMemory users = new UsersMemory();

        store(users,"Fulano");
        store(users,"Mengano");
        store(users, "Pepito");

        for(String user: getAll(users)){
            System.out.println(user);
        }
    }

    public static void store(Users users, String name){
        users.store(name);
    }

    public static ArrayList<String> getAll(Users users){
        return users.getAll();
    }
}
