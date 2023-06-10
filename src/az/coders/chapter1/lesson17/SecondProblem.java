package az.coders.chapter1.lesson17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SecondProblem {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Nihat");
        words.add("NNNNN");
        words.add("MMMM");
        words.add("inin");
        words.add("abcdef");
        words.add("abc");
        List<String> result = words.stream()
                .filter(word -> word.chars().distinct().count() >= 3)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .limit(5)
                .map(String::toUpperCase)
                .toList();

        System.out.println(result);


    }
}
