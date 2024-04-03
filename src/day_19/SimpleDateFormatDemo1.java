package day_19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
//        method1();

        String string = "2023-11-11 11:11:11";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = simpleDateFormat.parse(string);
        System.out.println(parse.getTime());
    }

    private static void method1() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        Date date = new Date(0L);
        String format = simpleDateFormat.format(date);
        System.out.println(format);

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String format1 = simpleDateFormat1.format(date);
        System.out.println(format1);

        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
        String format2 = simpleDateFormat2.format(date);
        System.out.println(format2);
    }
}
