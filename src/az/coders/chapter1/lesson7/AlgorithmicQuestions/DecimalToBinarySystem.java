package az.coders.chapter1.lesson7.AlgorithmicQuestions;

public class DecimalToBinarySystem {
    public static void main(String[] args) {
        int decimalNumber = 10;
        StringBuilder res = new StringBuilder("");
        while(decimalNumber > 0){
            res.append(decimalNumber % 2);
            decimalNumber =  Math.floorDiv(decimalNumber,2);
        }
        res.reverse();
        System.out.println(res);
    }
}
