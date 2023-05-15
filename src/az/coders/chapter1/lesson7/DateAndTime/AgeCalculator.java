package az.coders.chapter1.lesson7.DateAndTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class AgeCalculator {

    static int calculate(LocalDate date){

        return Period.between(date,LocalDate.now()).getYears();
    }


    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2004, Month.SEPTEMBER, 17);
        System.out.println(AgeCalculator.calculate(date));
    }
}
