package az.coders.chapter1.lesson14;

import java.util.ArrayList;
import java.util.List;

public class FirstProblem {
    public static void main(String[] args) {
        //1
        Sum<Integer> lambda1 = (a, b) -> a + b;
        System.out.println("Sum is " + lambda1.sum(1, 2));

        //2
        Factorial<Integer> lambda2 = a -> {
            int i, fact = 1;

            for (i = 1; i <= a; i++) {
                fact = fact * i;
            }
            return fact;
        };


        System.out.println("factorial is " + lambda2.factorial(6));


        //3
        StringLength lambda3 = a -> a.length();
        System.out.println("Length is " + lambda3.findLength("Nihat"));


        //4
        CustomString lambda4 = a -> {
            for (int i = 0; i < a.size(); i++) {
                a.set(i, a.get(i).toUpperCase());
            }
            return a;
        };
        List<String> list = new ArrayList<>();
        list.add("nihat");
        list.add("java");
        list.add("data StUrectures");
        System.out.println(lambda4.toUpperCaseWholeList(list));


        //5
        EvenNumbers<Integer> lambda5 = a -> {
            ArrayList<Integer> evenList = new ArrayList<Integer>();
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) % 2 == 0) {
                    evenList.add(a.get(i));
                }

            }
            ;
            return evenList;
        };
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(lambda5.findEvenNumbers(arr));

    }
    }

    @FunctionalInterface
    interface Sum<T> {
        T sum(T e1, T e2);
    }

    @FunctionalInterface
    interface Factorial<T> {
        T factorial(T e);
    }

    @FunctionalInterface
    interface StringLength {
        int findLength(String e);
    }

    @FunctionalInterface
    interface CustomString {
        List<String> toUpperCaseWholeList(List<String> stringList);
    }

    @FunctionalInterface
    interface EvenNumbers<T> {
        List<T> findEvenNumbers(List<T> list);

    }
