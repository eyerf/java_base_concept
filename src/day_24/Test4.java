package day_24;

public class Test4 {
    public static void main(String[] args) {
        int[] dp = new int[21];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 4; i < 21; i++){
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        System.out.println(dp[20]);
    }
}
