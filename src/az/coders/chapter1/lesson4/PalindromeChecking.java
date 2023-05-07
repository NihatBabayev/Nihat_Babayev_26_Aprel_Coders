package az.coders.chapter1.lesson4;

public class PalindromeChecking {
    static boolean checkPalindrome(String str){

        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i)!= str.charAt(str.length() - 1- i)){
                return false;
            }
        }
        return  true;
    }

    public static void main(String[] args) {
        String str = "babab";
        System.out.println(checkPalindrome(str));
    }
}
