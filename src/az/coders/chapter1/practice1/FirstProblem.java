package az.coders.chapter1.practice1;

public class FirstProblem {
    public static void main(String[] args) {
        int n = 1234;
        String[] str = Integer.toString(n).split("");
        StringBuilder res = new StringBuilder("");
        res.append(str[str.length-1]);
        for (int i = 1; i < str.length -1; i++) {
            res.append(str[i]);
        }
        res.append(str[0]);

        Integer res2 = Integer.parseInt(String.valueOf(res));
        System.out.println(res2);
    }
}
