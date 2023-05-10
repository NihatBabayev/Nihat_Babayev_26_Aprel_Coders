package az.coders.chapter1.lesson5;

import java.util.Random;

public class Login {
    private String username;
    private int password;



    Login(String name, String surname){
        Random random = new Random();

        this.username = name+surname;
        this.password = random.nextInt(1000_0000, 9999_9999);

    }

    public Login LoginGenerator(User user){
        Login newLogin = new Login(user.getName(), user.getSurname());
        return newLogin;
    }
    public static void main(String[] args) {

    }
}
