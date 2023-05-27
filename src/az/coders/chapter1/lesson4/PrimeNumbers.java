package az.coders.chapter1.lesson4;

public class PrimeNumbers {

    public static void main(String[] args) {
        int beginIndex = 1;
        int endingIndex = 100;

        OUTER:
        for (int i = beginIndex; i < endingIndex; i++) {
            for (int j = i-1; j >= 2 ; j--) {
                if( i % j == 0){
                    continue OUTER;
                }
            }
            System.out.println(i);
        }
    }
}
