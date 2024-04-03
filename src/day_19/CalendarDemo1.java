package day_19;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        Date date = new Date(0L);
        calendar.setTime(date);

//        System.out.println(calendar);

        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, 8);
        calendar.set(Calendar.DAY_OF_MONTH, 10);

        calendar.add(Calendar.MONTH, -1);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int date1 = calendar.get(Calendar.DAY_OF_MONTH);
        int week = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(year + ", " + month + ", " + date1 + ", " + getWeek(week));


    }

    public static String getWeek(int index) {
        String[] arr = {"", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        return arr[index];
    }
}
