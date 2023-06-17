package az.coders.chapter1.practice1;

public class SecondProblem {
    public static void main(String[] args) {
        long a = 248163264128L;
        String strA = a+"";

        StringBuilder test = new StringBuilder("");

        for (int i = 0; i < strA.length(); i++) {
            if(strA.length() > test.length()){
                test.append((int)Math.pow(2,i+1));
            }
            else if (strA.length() == test.length()) {
                System.out.println(i);
                break;
            }
        }

    }
}
