package az.coders.chapter1.lesson3;

public class MatrixProblem {

    static int[][] ProblemSolver( int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length - 1; j >= arr.length -1 - i; j--) {
                arr[i][j] = 1;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int num = 5;
        int[][] arr = new int[num][num];
        ProblemSolver(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ " ");

            }
            System.out.println();
        }
    }
}
