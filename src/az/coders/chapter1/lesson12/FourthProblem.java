package az.coders.chapter1.lesson12;

public class FourthProblem {
    static class InnerClass{
        static void testMethod(){
            System.out.println("test 1,2 ...");
        }
    }


}
class Test3{
    public static void main(String[] args) {
        FourthProblem.InnerClass obj = new FourthProblem.InnerClass();
        obj.testMethod();
    }

}
