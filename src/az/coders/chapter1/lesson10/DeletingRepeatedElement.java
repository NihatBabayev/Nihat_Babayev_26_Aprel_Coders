package az.coders.chapter1.lesson10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DeletingRepeatedElement {

    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        HashSet<Integer> hashSet = new HashSet<>(list);
        for (Integer value:
             hashSet) {
            System.out.println(value);
        }

    }
}
