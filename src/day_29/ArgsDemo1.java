package day_29;

import java.util.Arrays;

public class ArgsDemo1 {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int sum = getSum(arr);
//        System.out.println(sum);
        int sum = getSum(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(sum);
    }

//    public static int getSum(int[] arr) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        return sum;
//    }

    public static int getSum(int... args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }
}
