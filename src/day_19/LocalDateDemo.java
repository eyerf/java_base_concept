package day_19;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class LocalDateDemo {
    public static void main(String[] args) {
//        LocalDate now = LocalDate.now();
//        LocalDate localDate = LocalDate.of(2023, 1, 1);
//        System.out.println(now);
//        System.out.println(localDate);
//
//        int year = localDate.getYear();
//        System.out.println(year);
//
//        Month month = localDate.getMonth();
//        System.out.println(month);
//        System.out.println(month.getValue());
//
//        int monthValue = localDate.getMonthValue();
//        System.out.println(monthValue);
//
//        int dayOfMonth = localDate.getDayOfMonth();
//        System.out.println(dayOfMonth);

        LocalDate birthdate = LocalDate.of(2001, 3, 10);
        LocalDate now = LocalDate.now();

        MonthDay birthMD = MonthDay.of(birthdate.getMonthValue(), birthdate.getDayOfMonth());
        MonthDay nowMD = MonthDay.from(now);

        System.out.println("今天是你生日吗?" + birthMD.equals(nowMD));
    }
}
