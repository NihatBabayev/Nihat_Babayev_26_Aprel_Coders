package az.coders.chapter1.practice1;

import java.util.Scanner;

public class ThirdProblem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("First number(float): ");
        float a = scanner.nextFloat();
        System.out.print("Second number(float): ");
        float b = scanner.nextFloat();

        System.out.println("Which operation:\n1. Addition(+)\n2. Substraction(-)\n3. Division(/)\n4. Multiplication(*) ");
        int operation = scanner.nextInt();
        switch (operation){
            case 1:
                System.out.println("Result is "+ (a+b));
                break;
            case 2:
                System.out.println("Result is "+ (a-b));
                break;
            case 3:
                System.out.println("Result is "+ (a/b));
                break;
            case 4:
                System.out.println("Result is "+ (a*b));
                break;
            default:
                System.out.println("The End");
        }
    }
}
