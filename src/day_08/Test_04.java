package day_08;

import java.util.Arrays;

public class Test_04 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] newNums = new int[11];
        System.arraycopy(nums, 0, newNums, 0, nums.length);
        System.out.println(Arrays.toString(newNums));
    }
}
