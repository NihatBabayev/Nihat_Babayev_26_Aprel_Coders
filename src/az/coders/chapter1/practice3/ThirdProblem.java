package az.coders.chapter1.practice3;


import java.util.HashMap;
        import java.util.Map;
        import java.util.Scanner;

public class ThirdProblem {
    public static void main(String[] args) {
        Map<String, String> dictionary = createDictionary();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an English word: ");
        String word = scanner.nextLine();

        String translation = dictionary.get(word);

        if (translation != null) {
            System.out.println("Azerbaijani Translation: " + translation);
        } else {
            System.out.println("Translation not found.");
        }

        scanner.close();
    }

    private static Map<String, String> createDictionary() {
        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("hello", "salam");
        dictionary.put("goodbye", "güle güle");
        dictionary.put("thank you", "təşəkkür edirəm");
        dictionary.put("apple", "alma");
        dictionary.put("car", "avtomobil");
        // Add more word translations as needed

        return dictionary;
    }
}
