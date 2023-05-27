package az.coders.chapter1.lesson12;

import java.awt.*;

public class FirstProblem {
    public static void main(String[] args) {
        int point = 0;
        if (point <= 50)
            point = 50;
        point = point / 10 + ((point % 10 == 0) ? 0 : 1);


        switch (point){
            case (10):
                System.out.println(Points.A);
                break;
            case (9):
                System.out.println(Points.B);
                break;
            case 8:
                System.out.println(Points.C);
                break;
            case 7:
                System.out.println(Points.D);
                break;
            case 6:
                System.out.println(Points.E);
                break;
            case 5:
                System.out.println(Points.F);
                break;
            default:
                System.out.println("New Dimension");
                break;
        }
    }
}
enum Points{
    A, B, C, D, E, F
}

