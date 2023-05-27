package az.coders.chapter1.lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class User {
    private String email;
    private String password;

    public User(String email, String password) throws InvalidEmailException, InvalidPasswordException {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws InvalidEmailException {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        if (!matcher.matches()) {
            throw new InvalidEmailException("Invalid email format");
        }

        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws InvalidPasswordException {
        if (password.length() < 6) {
            throw new InvalidPasswordException("Password should have at least 6 characters");
        }

        this.password = password;
    }

    public static void main(String[] args) {
        User[] users = new User[2];

        try {
            users[0] = new User("user1@example.com", "password123");
            users[1] = new User("user2example.com", "pass");
        } catch (InvalidEmailException e) {
            System.out.println("Invalid email: " + e.getMessage());
        } catch (InvalidPasswordException e) {
            System.out.println("Invalid password: " + e.getMessage());
        }

        // Perform login
        String loginEmail = "user1@example.com";
        String loginPassword = "password123";
        boolean loggedIn = false;

        for (User user : users) {
            if (user != null && user.getEmail().equals(loginEmail) && user.getPassword().equals(loginPassword)) {
                loggedIn = true;
                break;
            }
        }

        if (loggedIn) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
    }
}
