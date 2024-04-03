package day_08;

public class Test_09 {
    public static void main(String[] args) {
        int[][] stores = {{22, 66, 44}, {77, 33, 88}, {25, 45, 65}, {11, 66, 99}};
        int totalSum = 0;
        for (int i = 0; i < stores.length; i++) {
            int sum = 0;
            for (int j = 0; j < stores[i].length; j++) {
                sum += stores[i][j];
                totalSum += stores[i][j];
            }
            System.out.println("第" + i + "个季度的营业额为:" + sum);
        }
        System.out.println("总营业额为:" + totalSum);
    }
}
