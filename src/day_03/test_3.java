package day_03;

import java.util.Scanner;

public class test_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a == 6 || b == 6 || (a + b) % 6 == 0);
    }
}
