package az.coders.chapter1.practice1;


import java.util.ArrayList;

import java.util.List;

public class FourthProblem {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 2, 5, 7,8,9, 2, 4, 6, 8};
        List<List<Integer>> resultSet = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(arr[i] );
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]> arr[j - 1]){
                    temp.add( arr[j] );
                }
                else {
                    break;
                }

            }

            resultSet.add(temp);
        }
        int longest = 0;
        for (int i = 0; i < resultSet.size(); i++) {
            if(resultSet.get(i).size()> resultSet.get(longest).size()){
                longest = i;
            }
        }

        System.out.println("The longest is "+ resultSet.get(longest));
    }
}
