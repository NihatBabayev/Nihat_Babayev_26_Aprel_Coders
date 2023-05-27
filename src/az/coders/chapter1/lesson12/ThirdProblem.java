package az.coders.chapter1.lesson12;

public class ThirdProblem {
    void justRandomMethod(){
        System.out.println("Hello");
        class InnerClass{
            void helloFunc(){
                System.out.println("Hello again :)");
            }


        }
        InnerClass a = new InnerClass();
        a.helloFunc();

    }

}
class Test2{
    public static void main(String[] args) {
        new ThirdProblem().justRandomMethod();
    }
}

