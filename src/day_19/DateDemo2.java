package day_19;

import java.util.Date;
import java.util.Random;

public class DateDemo2 {
    public static void main(String[] args) {
        Date date = new Date(0L);
        long time = date.getTime();
        time = time + 1000L*60*60*24*365;
        date.setTime(time);
        System.out.println(date);

        Random random = new Random();
        Date date1 = new Date(Math.abs(random.nextInt()));
        Date date2 = new Date(Math.abs(random.nextInt()));
        long time1 = date1.getTime();
        long time2 = date2.getTime();
        if (time1 > time2) {
            System.out.println("time1 > time2");
        } else if (time1 < time2) {
            System.out.println("time1 < time2");
        } else {
            System.out.println("time1 = time2");
        }
    }
}
