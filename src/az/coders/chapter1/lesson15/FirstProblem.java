package az.coders.chapter1.lesson15;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FirstProblem {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        List<Integer> reversedList = Stream.iterate(list.size() - 1, i -> i >= 0, i -> i - 1).map(list::get).toList();

        reversedList.forEach(System.out::println);

    }
}
