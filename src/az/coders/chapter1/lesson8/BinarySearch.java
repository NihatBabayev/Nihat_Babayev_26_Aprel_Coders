package az.coders.chapter1.lesson8;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length -1;
        int middle;
        while(low <= high){
            middle = (low + high)/2;

            if(target == arr[middle]){
                return middle;
            } else if (target < arr[middle]) {
                high = middle - 1;

            } else if (target > arr[middle]) {
                low = middle +1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] testArray = new int[]{1,2,3,4,5,6,7};
        System.out.println(BinarySearch.binarySearch(testArray,1));
    }
}
