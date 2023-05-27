package az.coders.chapter1.lesson11;

import java.util.HashMap;
import java.util.Map;

public class MostUsedLetterInString {
    public static void main(String[] args) {
        String givenString = "NNiOOOiOOpppp";
        String[] arr = givenString.split("");
        Map<String, Integer> res = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (res.containsKey(arr[i])){
                res.put(arr[i], res.get(arr[i]) + 1);

            }
            else {
                res.put(arr[i], 1);
            }
        }

        for (Map.Entry entry: res.entrySet()) {
            System.out.println(entry);
        }
    }
}

