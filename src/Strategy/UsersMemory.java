package Strategy;

import java.util.ArrayList;

public class UsersMemory implements Users {
    private ArrayList<String> users = new ArrayList();

    @Override
    public void store(String name){
        users.add(name);
    }

    @Override
    public ArrayList<String> getAll() {
        return users;
    };
}
