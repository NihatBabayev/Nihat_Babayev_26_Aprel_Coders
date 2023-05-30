package az.coders.chapter1.lesson13;

import java.util.ArrayList;
import java.util.List;

public class Stack<T>   {
    List<T> list;

    public Stack() {

        list = new ArrayList<>();
    }
    void push(T element){
        list.add(element);

    }
    void pop(){
        list.remove(list.size()-1);
    }
    void isEmpty(){
        if(list.isEmpty()){
            System.out.println("Empty");
        }
        else
            System.out.println("Not empty");
    }

    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();
        myStack.push("2");
        myStack.push("qwertyuiop");
        myStack.pop();

        myStack.isEmpty();


    }


}
