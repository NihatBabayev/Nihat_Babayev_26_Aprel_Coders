package az.coders.chapter1.lesson16;

import java.util.Arrays;

public class SecondProblem {
    public static void main(String[] args) {
        String str = "nikus 123 -123 23.34  24354";
        printPositiveIntegers(str);
    }

    public static void printPositiveIntegers(String str) {
        Arrays.stream(str.split("\\s+"))
                .map(s -> {
                    try {
                        return Integer.parseInt(s);
                    } catch (NumberFormatException e) {
                        return null;
                    }
                })
                .filter(num -> num != null && num > 0)
                .forEach(num -> System.out.println(num));
    }
}
