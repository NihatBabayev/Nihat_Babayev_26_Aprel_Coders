package az.coders.chapter1.practice3;

import java.util.Scanner;

public class FirstProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month number: ");
        int monthNumber = scanner.nextInt();

        System.out.print("Choose a language (AZ, EN, RU, TR): ");
        String languageCode = scanner.next().toUpperCase();

        LanguageEnum language = LanguageEnum.valueOf(languageCode);

        MonthEnum month = getMonthByNumber(monthNumber);

        if (month != null) {
            String monthName = month.getName(language);
            System.out.println(monthName);
        } else {
            System.out.println("Invalid month number.");
        }

        scanner.close();
    }

    private static MonthEnum getMonthByNumber(int monthNumber) {
        for (MonthEnum month : MonthEnum.values()) {
            if (month.getMonthNumber() == monthNumber) {
                return month;
            }
        }
        return null;
    }
}

enum MonthEnum {
    JANUARY(1, "January", "Январь", "Ocak"),
    FEBRUARY(2, "February", "Февраль", "Şubat"),
    MARCH(3, "March", "Март", "Mart"),
    APRIL(4, "April", "Апрель", "Nisan"),
    MAY(5, "May", "Май", "Mayıs"),
    JUNE(6, "June", "Июнь", "Haziran"),
    JULY(7, "July", "Июль", "Temmuz"),
    AUGUST(8, "August", "Август", "Ağustos"),
    SEPTEMBER(9, "September", "Сентябрь", "Eylül"),
    OCTOBER(10, "October", "Октябрь", "Ekim"),
    NOVEMBER(11, "November", "Ноябрь", "Kasım"),
    DECEMBER(12, "December", "Декабрь", "Aralık");

    private int monthNumber;
    private String enName;
    private String ruName;
    private String trName;

    MonthEnum(int monthNumber, String enName, String ruName, String trName) {
        this.monthNumber = monthNumber;
        this.enName = enName;
        this.ruName = ruName;
        this.trName = trName;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public String getName(LanguageEnum language) {
        switch (language) {
            case AZ:
                return trName;
            case EN:
                return enName;
            case RU:
                return ruName;
            case TR:
                return trName;
            default:
                return "";
        }
    }
}

enum LanguageEnum {
    AZ,
    EN,
    RU,
    TR
}
