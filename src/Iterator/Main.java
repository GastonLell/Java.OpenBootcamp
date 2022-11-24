package Iterator;

public class Main {
    public static void main(String[] args){
        Users users = new Users();


        users.create(new User("John", 25));
        users.create(new User("Mark", 28));
        users.create(new User("Pipi", 23));

        while(users.hasMore()){
            User user = users.next();
            System.out.println("Usuario: " + user.getName());
        }

        users.create(new User("Alba", 15));

        System.out.println("----REINICIAR ITERACION----");

        users.reset();

        while(users.hasMore()){
            User user = users.next();
            System.out.println("Usuario segunda vuelta: " + user.getName());
        }

    }
}
