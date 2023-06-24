package az.coders.chapter1.practice4;


import az.coders.chapter1.lesson12.FifthProblem;

import java.util.List;

public class FirstProblem  {
    public static <T extends Comparable<T>> T findMaxValue(T[] array) {

        T max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }

        return max;
    }
    public static void main(String[] args) {
        Integer[] arr = {1,2,3};
        Double[] arr1 = {1.2, 2.3,99.0 };
        System.out.println( FirstProblem.findMaxValue(arr));
        System.out.println( FirstProblem.findMaxValue(arr1));

    }
}
