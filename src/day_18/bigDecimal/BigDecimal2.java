package day_18.bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimal2 {
    public static void main(String[] args) {
        BigDecimal bigDecimal1 = BigDecimal.valueOf(10.0);
        BigDecimal bigDecimal2 = BigDecimal.valueOf(3.0);
//        BigDecimal bigDecimal3 = bigDecimal1.add(bigDecimal2);
////        System.out.println(bigDecimal3);
////
////        BigDecimal bigDecimal4 = bigDecimal1.subtract(bigDecimal2);
////        System.out.println(bigDecimal4);
////
////        BigDecimal bigDecimal5 = bigDecimal1.multiply(bigDecimal2);
////        System.out.println(bigDecimal5);

        BigDecimal bigDecimal6= bigDecimal1.divide(bigDecimal2, 2, RoundingMode.HALF_UP);
        System.out.println(bigDecimal6);

    }
}
