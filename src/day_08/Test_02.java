package day_08;

import java.util.Scanner;

public class Test_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int count = 0;
        for(int i = start; i <= end; i++) {
            if(isPrimeNumber(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isPrimeNumber(int num) {
        int sqrtNum = (int) Math.sqrt(num);
        for(int i = 2; i <= sqrtNum; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
