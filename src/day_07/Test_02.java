package day_07;

import java.util.Random;

public class Test_02 {
    public static void main(String[] args) {
        Random rd = new Random();
        int total = 10;
        int[] nums =  new int[total];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rd.nextInt(30);
        }
        printArray(nums);
    }

    private static void printArray(int[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if(i != nums.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
