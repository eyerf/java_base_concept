package day_07;

public class Test_04 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9};
        int target = 4;
        boolean exist = isExist(nums, target);
        System.out.println(exist);
    }

    private static boolean isExist(int[] nums, int target) {
        for (int num : nums) {
            if(num == target) {
                return true;
            }
        }
        return false;
    }
}
