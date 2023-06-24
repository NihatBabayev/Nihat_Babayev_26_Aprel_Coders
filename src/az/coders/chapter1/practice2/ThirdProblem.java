package az.coders.chapter1.practice2;

import java.util.Arrays;

public class ThirdProblem {
    static int[] arrConverter(int[] arr, int c){

        if(c>0){
            c--;
            arrConverter(arr, c - 1);
        }
        if(c == 0 ) {
            int temp = arr[c];
            arr[c] = arr[arr.length - c - 1];
            arr[arr.length - c - 1] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(arrConverter(arr, arr.length - 1)));
    }


}
