package az.coders.chapter1.lesson4;

import java.util.Arrays;

public class ArrayProblem {
    static int[] CheckAndAdd(int value, int[] givenArray){
        int[] finalArray = new int[givenArray.length+1];
        int i = 0;
        while( i < givenArray.length){
            if(value <= givenArray[i])
                break;
            i++;
        }

        for (int j = 0; j < i; j++) {
            finalArray[j] = givenArray[j];
        }
        finalArray[i] = value;
        for (int j = i+1; j < finalArray.length ; j++) {
            finalArray[j] = givenArray[j-1];
        }
        return finalArray;
    }

    public static void main(String[] args) {
        int[] arr =  new int[]{3, 4, 5, 6, 8, 9};
        int value = 2;
        System.out.println(Arrays.toString(CheckAndAdd(value, arr)));
    }
}
