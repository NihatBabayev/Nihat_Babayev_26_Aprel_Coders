package az.coders.chapter1.lesson10;

import java.util.HashSet;
import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList <String> linkedList1 = new LinkedList<>();
        linkedList1.add("First");
        linkedList1.add("Second");
        linkedList1.add("Third");

        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.add("First");
        linkedList2.add("Fourth");
        linkedList2.add("Fifth");

        // to find union of two linkedlists
        HashSet<String> temp1 = new HashSet<>(linkedList1);
        HashSet<String> temp2 = new HashSet<>(linkedList2);
        temp1.addAll(temp2);
        LinkedList<String> resultOfUnionOperation = new LinkedList<>(temp1);
        for (String value:
             resultOfUnionOperation) {
            System.out.println(value);
        }

        // to find intersection of two linkedLists


    }
}
