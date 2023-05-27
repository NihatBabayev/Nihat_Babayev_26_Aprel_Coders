package az.coders.chapter1.lesson3;

public class Fibonacci {
    static  boolean Checking(int[] arr) {

        for (int i = 2; i < arr.length; i++) {
            if(arr[i-1]+arr[i-2]!= arr[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,1,1,2};
        System.out.println(Checking(arr));
    }
}
