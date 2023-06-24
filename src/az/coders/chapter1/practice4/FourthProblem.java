package az.coders.chapter1.practice4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FourthProblem {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(new String("olo"));
        list.add("atata");
        list.add("ana");
        list.add("bababab");
        list.add("coders");
        list.add("Azerbaijan");

        List<String> palindromes = new ArrayList<>();
        palindromes = list.stream().filter(
                s -> s.equals(new StringBuilder(s).reverse().toString())).collect(Collectors.toList());
        System.out.println(palindromes);
    }
}
