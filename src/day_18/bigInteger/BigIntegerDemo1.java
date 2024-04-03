package day_18.bigInteger;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo1 {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            BigInteger bigInteger = new BigInteger(4, new Random());
//            System.out.println(bigInteger);
//        }
//
//        BigInteger bigInteger = new BigInteger("100000000000000000000000000000000");
//        System.out.println(bigInteger);

//        BigInteger bigInteger = new BigInteger("100", 8);
//        System.out.println(bigInteger);

//        BigInteger bigInteger = BigInteger.valueOf(100);
//        System.out.println(bigInteger);

//        BigInteger bigInteger1 = BigInteger.valueOf(17);
//        BigInteger bigInteger2 = BigInteger.valueOf(17);
//        System.out.println(bigInteger2 == bigInteger1);

        BigInteger bigInteger1 = BigInteger.valueOf(1);
        BigInteger bigInteger2 = BigInteger.valueOf(2);
        BigInteger result = bigInteger1.add(bigInteger2);
        System.out.println(result);
        System.out.println(bigInteger1);
        System.out.println(bigInteger2);
    }
}
