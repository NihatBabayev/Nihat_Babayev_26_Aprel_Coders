package az.coders.chapter1.lesson15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SecondProblem {
    public static void main(String[] args) {
        String a = "Coders Azerbaijan Aze 2023";
        String[] arr = a.split(" ");

        String longestWord = Arrays.stream(arr)
                .max(Comparator.comparingInt(String::length))
                .get();
        System.out.println(longestWord);

    }
}
