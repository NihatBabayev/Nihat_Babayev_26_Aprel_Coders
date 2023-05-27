package az.coders.chapter1.lesson9;

public class MaximumNumberInArray {
    static int findMaximum(int[] arr, int i, int max){
        if(arr[i] > max){
            max = arr[i];
        }
        if(i == 0){
            return max;
        }
        return findMaximum(arr, i-1, max);

    }

    public static void main(String[] args) {
        int[] arr = new int[]{5,4,6,3,7,2};

        System.out.println(findMaximum(arr, arr.length-1, arr[0] ));
    }
}
