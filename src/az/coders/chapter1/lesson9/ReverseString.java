package az.coders.chapter1.lesson9;

public class ReverseString {
    static String reverse(String input,int i){
        if(i == 0){
            return String.valueOf(input.charAt(0));
        }
        return input.charAt(i)+reverse(input, i - 1);
    }

    public static void main(String[] args) {
        String input  = "Nihat";

        System.out.println(reverse(input, input.length() - 1));
    }

}
