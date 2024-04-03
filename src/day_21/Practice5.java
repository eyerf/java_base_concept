package day_21;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;

public class Practice5 {
    public static void main(String[] args) {
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(2000, 2, 1);
//        calendar.add(Calendar.DAY_OF_MONTH, -1);
//        int day = calendar.get(Calendar.DAY_OF_MONTH);
//        if (day == 28) {
//            System.out.println("平年");
//        } else {
//            System.out.println("闰年");
//        }

        LocalDate localDate = LocalDate.of(2000, 3, 1);
        LocalDate date = localDate.minusDays(1);
        int dayOfMonth = date.getDayOfMonth();
        System.out.println(dayOfMonth);

        boolean leapYear = localDate.isLeapYear();
        System.out.println(leapYear);
    }
}
