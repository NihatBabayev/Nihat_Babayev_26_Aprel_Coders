package az.coders.chapter1.lesson7.DateAndTime;

import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Subscription {
    static LocalDate getSubscription(LocalDate date ,int amountOfPaidMoney) {

        int expiringDay = 0;
        int expiringMonth = 0;
        int expiringYear = 0;

        if(amountOfPaidMoney == 5){
            expiringDay = LocalDate.now().plusWeeks(1).getDayOfMonth();
            expiringMonth = LocalDate.now().plusWeeks(1).getMonthValue();
            expiringYear = LocalDate.now().plusWeeks(1).getYear();
        }

        else if (amountOfPaidMoney == 15) {
            expiringDay = LocalDate.now().plusMonths(1).getDayOfMonth();
            expiringMonth = LocalDate.now().plusMonths(1).getMonthValue();
            expiringYear = LocalDate.now().plusMonths(1).getYear();
        }

        else if (amountOfPaidMoney == 25) {
            expiringDay = LocalDate.now().plusMonths(2).getDayOfMonth();
            expiringMonth = LocalDate.now().plusMonths(2).getMonthValue();
            expiringYear = LocalDate.now().plusMonths(2).getYear();
        }

        else if (amountOfPaidMoney == 60) {
            expiringDay = LocalDate.now().plusYears(1).getDayOfMonth();
            expiringMonth = LocalDate.now().plusYears(1).getMonthValue();
            expiringYear = LocalDate.now().plusYears(1).getYear();
        }


        LocalDate res = LocalDate.of(expiringYear, expiringMonth, expiringDay);

        return res;

    }

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        System.out.println(Subscription.getSubscription(date, 5));
        System.out.println(Subscription.getSubscription(date, 15));
        System.out.println(Subscription.getSubscription(date, 25));
        System.out.println(Subscription.getSubscription(date, 60));
        date.format(DateTimeFormatter.ofPattern("MMM/dd/yyyy hh:mm "));
        LocalDate n = LocalDate.of(12,12,12);
        


    }
}
