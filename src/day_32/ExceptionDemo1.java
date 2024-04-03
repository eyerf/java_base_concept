package day_32;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo1 {
    public static void main(String[] args) throws ParseException {
//        String time = "2030年1月1日";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
//        Date date = simpleDateFormat.parse(time);
//        System.out.println(date);

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[5]);
    }
}
