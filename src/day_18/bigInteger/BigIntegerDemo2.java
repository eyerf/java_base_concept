package day_18.bigInteger;

import java.math.BigInteger;

public class BigIntegerDemo2 {
    public static void main(String[] args) {
        BigInteger bigInteger1 = BigInteger.valueOf(10);
        BigInteger bigInteger2 = BigInteger.valueOf(2);
//        BigInteger bigInteger3 = bigInteger1.add(bigInteger2);
//        System.out.println(bigInteger3);
//
//        BigInteger[] arr = bigInteger1.divideAndRemainder(bigInteger2);
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//
//        boolean equals = bigInteger1.equals(bigInteger2);
//        System.out.println(equals);

//        BigInteger bigInteger4 = bigInteger1.pow(2);
//        System.out.println(bigInteger4);

//        BigInteger max = bigInteger1.max(bigInteger2);
//        System.out.println(max);

        BigInteger bigInteger6 = BigInteger.valueOf(1000);
        int i = bigInteger6.intValue();
        System.out.println(i);
        long l = bigInteger6.longValue();
        System.out.println(l);
    }
}
