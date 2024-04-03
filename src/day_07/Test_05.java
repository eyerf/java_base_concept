package day_07;

import java.util.Arrays;

public class Test_05 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] newNums = copyOfRange(nums, 5, 10);
        System.out.println(Arrays.toString(newNums));
    }

    private static int[] copyOfRange(int[] nums, int from, int to) {
        int[] newNums = new int[to - from];
        for(int i = from; i < to; i++) {
            newNums[i - from] = nums[i];
        }
        return newNums;
    }
}
