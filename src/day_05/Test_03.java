package day_05;

import java.util.Scanner;

public class Test_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int number = sc.nextInt();
        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                System.out.println(number + "不是一个质数");
            }
        }
        System.out.println(number + "是一个质数");
    }
}
