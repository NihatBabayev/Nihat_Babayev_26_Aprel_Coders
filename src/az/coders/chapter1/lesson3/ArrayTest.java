package az.coders.chapter1.lesson3;

public class ArrayTest {
    public static void main(String[] args) {
        int arr[] = new int[10];
//        int []arr, test;
//        int arr[], test2;
//        int []arr[], arrtest;
        int a = 5;
        int b = 7;
        a = a +b;
        b = a - b;
        a = a - b;


        System.out.println(a+" "+ b);
        int c = 14;
        StringBuilder res = new StringBuilder("  ");

        while(c > 0){
           res.append(c % 3);
           c =  Math.floorDiv(c,3);
        }
        System.out.println(res);

    }
}
