package az.coders.chapter1.lesson12;

public class FifthProblem {
    interface InnerClass {
        void metot();
    }

    public void metot() {
        InnerClass inner = new InnerClass() { //assume that new class is being created
            @Override
            public void metot() {
                System.out.println("Anonim iç sınıfın metodu");
            }
        };
        inner.metot();
    }

    public static void main(String[] args) {
        FifthProblem outer = new FifthProblem();
        outer.metot();
    }
}