package az.coders.chapter1.lesson15;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ThirdProblem {
    public static void main(String[] args) {
        final String input = "tnt";
        final String finalInput = input.toLowerCase();

        List<Character> repeatedLetters = IntStream.range(0, finalInput.length() - 1)
                .filter(i -> finalInput.length() > 1 && finalInput.charAt(i) == finalInput.charAt(i + 1))
                .mapToObj(finalInput::charAt)
                .distinct()
                .collect(Collectors.toList());

        repeatedLetters.forEach(System.out::println);
    }
}