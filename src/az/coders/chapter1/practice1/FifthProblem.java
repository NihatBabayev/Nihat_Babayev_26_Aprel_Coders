package az.coders.chapter1.practice1;

public class FifthProblem {
    public static void main(String[] args) {
        int n = 1;
        int m = 3;
        if(n%2 == 1 && m%2 ==1){
            System.out.println(1);
        } else if (n%2 == 0 && (m&2) == 0) {
            System.out.println(1);
        }
        else System.out.println(0);
    }
}
