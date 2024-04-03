package day_04;

import java.util.Scanner;

public class Test_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        int count = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            count++;
        }
        System.out.println(count);
        System.out.println(dividend);
    }
}
