package az.coders.chapter1.lesson6.AlgorithmicQuestions;



public class StringWithLongestLength {
    static StringBuilder findBiggestString(String input){
        String[] strArr = input.split(" ");
        int lengths[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            lengths[i] = strArr[i].length();
        }
        int largestLength = lengths[0];
        for (int i = 1; i < strArr.length; i++) {
            if(lengths[i]>largestLength){
                largestLength = lengths[i];
            }
        }
        StringBuilder res = new StringBuilder(10);
        for (int i = 0; i < lengths.length; i++) {
            if (strArr[i].length() == largestLength) {
                res = new StringBuilder(strArr[i]);
            }
        }
        return res;



    }

    public static void main(String[] args) {
        System.out.println(StringWithLongestLength.findBiggestString("ab abcaaaa abcd abcdef a"));
    }
}
