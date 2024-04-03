package day_22;

import java.util.Arrays;
import java.util.Random;

public class BinarySearchDemo2 {
    public static void main(String[] args) {
        int total = 100000;
        int[] nums = new int[total];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(100000);
        }
        Arrays.sort(nums);
        long time1 = System.currentTimeMillis();
        int index = binarySearch(nums, 500);
        long time2 = System.currentTimeMillis();
        System.out.println(index);
        System.out.println(time1);
        System.out.println(time2);
    }

    public static int binarySearch(int[] arr, int number) {
        int min = 0;
        int max = arr.length - 1;
        while (min <= max) {
//            int mid = min + (number - arr[min]) / (arr[max] - arr[min]) * (max - min);
            int mid = (max + min) / 2;
            if (arr[mid] > number) {
                max = mid - 1;
            } else if (arr[mid] < number) {
                min = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
