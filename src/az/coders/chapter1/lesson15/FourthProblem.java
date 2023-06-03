package az.coders.chapter1.lesson15;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FourthProblem {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int sum = list.stream().mapToInt(Integer::intValue).sum();

        System.out.println(sum);

    }
}