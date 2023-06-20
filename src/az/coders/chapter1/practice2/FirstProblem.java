package az.coders.chapter1.practice2;

import java.util.ArrayList;
import java.util.List;

public class FirstProblem {
    static Boolean isPalindrome(String a){
        String[] stringSequence = a.split("");

        boolean resBool = true;
        for (int i = 0; i < stringSequence.length; i++) {
            if(stringSequence[i].equalsIgnoreCase( stringSequence[stringSequence.length - i -1 ])){

                resBool =  true;
            }
            else {
                resBool = false;
            }
        }
        return resBool;
    }
    public static void main(String[] args) {
        String text = "Coders Azerbaijan ana atata";
        String[] textArray = text.toLowerCase().split(" ");
        List<String> res =  new ArrayList<>();
        for (int i = 0; i < textArray.length; i++) {

            if(isPalindrome(textArray[i])){
                res.add(textArray[i]);
            }

        }
        System.out.println(res);
    }
}
