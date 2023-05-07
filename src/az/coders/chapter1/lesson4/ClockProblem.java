package az.coders.chapter1.lesson4;

public class ClockProblem {
    static float checking(float hour, float minute){
        float first = 0;
        float res;
        if( hour > 12)
            hour-=12;
        first = (hour / 12)* 60 + (minute / 60) * 5;
        res = ((minute - first) / 60) * 360;
        if(res < 0)
            res = 360+ res;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(checking(13, 24));
    }
}
