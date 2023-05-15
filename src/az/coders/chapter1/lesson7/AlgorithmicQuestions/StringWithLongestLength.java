package az.coders.chapter1.lesson7.AlgorithmicQuestions;

import java.util.Arrays;

public class StringWithLongestLength {
    static String findBiggestString(String input){
        String[] strArr = input.split(" ");
        int lengths[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            lengths[i] = strArr[i].length();
        }
        int largestLength = lengths[0];
        for (int i = 0; i < strArr.length; i++) {
            if(lengths[i]>largestLength){
                largestLength = lengths[i];
            }
        }
        return strArr[Arrays.asList(lengths).indexOf(largestLength)];


    }

    public static void main(String[] args) {
        System.out.println(StringWithLongestLength.findBiggestString("Hello there"));
    }
}
