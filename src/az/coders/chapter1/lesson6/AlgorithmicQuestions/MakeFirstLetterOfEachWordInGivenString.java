package az.coders.chapter1.lesson6.AlgorithmicQuestions;

public class MakeFirstLetterOfEachWordInGivenString {

    public static void main(String[] args) {
        String str = "hello there how are you ";
        String[] strArr = str.split(" ");
        String[] res = new String[strArr.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = strArr[i].substring(0, 1).toUpperCase() + strArr[i].substring(1);
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+ " ");
        }
    }
}
