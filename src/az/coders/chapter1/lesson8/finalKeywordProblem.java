package az.coders.chapter1.lesson8;

public class finalKeywordProblem {
    public static void main(String[] args) {
        final int a = 10;

//        try  {
//            a = 20;
//        } catch (FinalFieldException e) {
//            System.out.println(e.getMessage());
//        }
    }
}

class FinalFieldException extends Exception {
    public FinalFieldException(String message) {
        System.out.println("Final keyword can't be changed");
    }
}
