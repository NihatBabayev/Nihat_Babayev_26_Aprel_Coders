package az.coders.chapter1.lesson8;

public class CreateRomb {
    public static void main(String[] args) {
        int length = 4;

        //for first half of romb
        for (int i = 1; i <= length; i++) {

            for (int j = 0; j < length-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //for next half
        for (int i = 1; i <= length ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < length-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
