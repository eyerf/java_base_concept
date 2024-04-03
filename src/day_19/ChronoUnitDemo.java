package day_19;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitDemo {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        LocalDateTime birthdate = LocalDateTime.of(2001, 7, 8, 0, 0, 0);
        System.out.println(birthdate);

        long between = ChronoUnit.YEARS.between(birthdate, today);
        System.out.println("between = " + between);
        long between1 = ChronoUnit.MONTHS.between(birthdate, today);
        System.out.println("between1 = " + between1);
        long between2 = ChronoUnit.DAYS.between(birthdate, today);
        System.out.println("between2 = " + between2);
        long between3 = ChronoUnit.SECONDS.between(birthdate, today);
        System.out.println("between3 = " + between3);
    }
}
