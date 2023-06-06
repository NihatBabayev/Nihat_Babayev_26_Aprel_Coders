package az.coders.chapter1.lesson15;

import java.util.stream.IntStream;

public class FifthProblem {
    public static void main(String[] args) {
        IntStream.range(1, 10)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }

}
