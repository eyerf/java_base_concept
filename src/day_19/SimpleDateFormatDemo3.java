package day_19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo3 {
    public static void main(String[] args) throws ParseException {
        String startTime = "2023年11月11日 00:00:00";
        String endTime = "2023年11月11日 00:10:00";
        String orderTime1 = "2023年11月11日 00:11:00";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDate = simpleDateFormat.parse(startTime);
        Date endDate = simpleDateFormat.parse(endTime);
        Date orderDate = simpleDateFormat.parse(orderTime1);

        long startDateTime = startDate.getTime();
        long endDateTime = endDate.getTime();
        long orderDateTime = orderDate.getTime();

        if (orderDateTime >= startDateTime && orderDateTime <= endDateTime) {
            System.out.println("参加成功");
        } else {
            System.out.println("参加失败");
        }
    }
}
