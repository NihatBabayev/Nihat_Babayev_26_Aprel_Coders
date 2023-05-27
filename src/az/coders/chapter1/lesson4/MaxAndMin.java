package az.coders.chapter1.lesson4;

public class MaxAndMin {
    public static int max(int[] arr ){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] >= max){
                max = arr[i];
            }
        }
        return max;

    }
    public static int min(int[] arr ){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] <= min){
                min = arr[i];
            }
        }
        return min;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,7,3,8,1};
        System.out.println(MaxAndMin.max(arr)+" " + MaxAndMin.min(arr));
    }
}
