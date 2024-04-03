package day_21;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Practice4 {
    public static void main(String[] args) throws ParseException {
//        String birthday = "2001年7月8日";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
//        Date date = simpleDateFormat.parse(birthday);
//        long birthdayTime = date.getTime();
//        long todayTime = System.currentTimeMillis();
//        System.out.println((todayTime - birthdayTime) / 1000 / 60 / 60 / 24);

        LocalDate localDate = LocalDate.of(2001, 7, 8);
        LocalDate now = LocalDate.now();
        long days = ChronoUnit.DAYS.between(localDate, now);
        System.out.println(days);
    }
}
