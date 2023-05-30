package az.coders.chapter1.lesson13;

import java.util.ArrayList;
import java.util.List;

public class ThirdProblem {
    static <T extends Comparable<T>> T findMax(List<T> list){
        T max = list.get(0);
        for (int i = 0; i < list.size(); i++){
            if(list.get(i).compareTo(max) == 1){
                max = list.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(-1);
        list.add(100);
        System.out.println(ThirdProblem.findMax(list));
    }


}
