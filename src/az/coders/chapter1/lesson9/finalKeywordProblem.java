package az.coders.chapter1.lesson9;

public class finalKeywordProblem {
    public static void main(String[] args) {
        final int x = 10;

        try {
            x = 20; // Compilation error: Cannot assign a value to final variable 'x'
        } catch (FinalFieldException e) {
            System.out.println(e.getMessage());
        }
    }
}

class FinalFieldException extends Exception {
    public FinalFieldException(String message) {
        System.out.println("Final keyword can't be changed");
    }
}
