package az.coders.chapter1.lesson9;

public class SumOfElementsOfArray {
    static int sumOfElements(int[] arr,int i){
        if(i == 0){
            return arr[0];
        }
        return arr[i]+sumOfElements(arr, i-1);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4, 5};
        System.out.println(sumOfElements(arr, arr.length - 1));
    }
}
