package day_07;

import java.util.Arrays;
import java.util.Random;

public class Test_03 {
    public static void main(String[] args) {
        int total = 10;
        Random rd = new Random();
        int[] nums = new int[total];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rd.nextInt(100);
        }
        int maxValue = getMaxValue(nums);
        System.out.println(maxValue);
    }

    private static int getMaxValue(int[] nums) {
        return Arrays.stream(nums).max().getAsInt();
    }
}
