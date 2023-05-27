package az.coders.chapter1.lesson11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SameKeys {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        map1.put("hi", "hello");
        map1.put("sa", "Salam");
        map1.put("sa", "Salam");
        map2.put("bn", "bonjour");
        map2.put("sa", "as");
        List<String> intersectionOfKeys= new ArrayList<>();

        for (Map.Entry<String, String> entry1 : map1.entrySet()) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                if(entry1.getKey().equals(entry2.getKey())){
                    intersectionOfKeys.add(entry1.getKey());
                }

            }
        }

        System.out.println(intersectionOfKeys);

    }
}
