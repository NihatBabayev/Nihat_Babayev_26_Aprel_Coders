package az.coders.chapter1.lesson9;

import java.util.Arrays;

public class SelectionSort {
    static int[] sort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min]){
                    min = j;

                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{9,3,8,6,4,5};
        System.out.println(Arrays.toString(sort(arr)));

    }
}
