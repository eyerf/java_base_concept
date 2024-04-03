package day_19;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        Date date1 = new Date(0L);
        date1.setTime(1000L);
        System.out.println(date1);

        long time = date1.getTime();
        System.out.println(time);
    }
}
