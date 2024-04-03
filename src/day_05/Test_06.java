package day_05;

import java.util.Arrays;
import java.util.Random;

public class Test_06 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        Random rd = new Random();
        for (int i = 0; i < nums.length; i++) {
            int index = rd.nextInt(nums.length);
            swap(nums, i, index);
        }
        System.out.println(Arrays.toString(nums));
    }

    private static void swap(int[] nums, int i, int index) {
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }
}
