package az.coders.chapter1.lesson11;

import java.util.*;

public class IntegerToRomanNumber {
    public static void main(String[] args) {
        int num = 194;
        SortedMap<Integer, String> romeNumberKit = new TreeMap<>(Collections.reverseOrder());
        romeNumberKit.put(1000, "M");
        romeNumberKit.put(900, "CM");
        romeNumberKit.put(500, "D");
        romeNumberKit.put(400, "CD");
        romeNumberKit.put(100, "C");
        romeNumberKit.put(90, "XC");
        romeNumberKit.put(50, "L");
        romeNumberKit.put(40, "XL");
        romeNumberKit.put(10, "X");
        romeNumberKit.put(9, "IX");
        romeNumberKit.put(5, "V");
        romeNumberKit.put(4, "IV");
        romeNumberKit.put(1, "I");

        System.out.println(romeNumberKit);
        int remaining = num;

        for (Map.Entry<Integer, String> entry : romeNumberKit.entrySet()) {
            int value = entry.getKey();
            String symbol = entry.getValue();

            while (remaining >= value) {
                System.out.print(symbol);
                remaining -= value;
            }
        }
    }
}
