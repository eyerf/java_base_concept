package day_05;

import java.util.Arrays;
import java.util.Random;

public class Test_05 {
    public static void main(String[] args) {
        int totalNum = 10;
        Random rd = new Random();
        int[] numbers = new int[totalNum];
        for(int i = 0; i < totalNum; i++) {
            numbers[i] = 1 + rd.nextInt(100);
        }
        System.out.println(Arrays.toString(numbers));
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("sum = " + sum);
        int average = sum / 10;
        System.out.println("average = " + average);
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < average) {
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
