package az.coders.chapter1.lesson12;

public class SecondProblem {
    class InnerClass{
        void printHello(){
            System.out.println("Hello there");
        }

    }

}
class Test{
    public static void main(String[] args) {
        new SecondProblem().new InnerClass().printHello();
    }
}

