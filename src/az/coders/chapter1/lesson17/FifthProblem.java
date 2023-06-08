package az.coders.chapter1.lesson17;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FifthProblem {
    public static void main(String[] args) {
        Map<Integer, Long> map = Stream.generate(() -> new Random().nextInt(101)).limit(100).collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }
}
