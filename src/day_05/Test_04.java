package day_05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test_04 {
    public static void main(String[] args) {
        Random rd = new Random();
        int number = 1 + rd.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要猜的数字");
        while (sc.hasNextInt()) {
            int guessNumber = sc.nextInt();
            if (guessNumber == number) {
                System.out.println("恭喜你，猜对了！");
                break;
            } else if (guessNumber < number) {
                System.out.println("猜小了");
                System.out.println("请输入你要猜的数字");
            } else {
                System.out.println("猜大了");
                System.out.println("请输入你要猜的数字");
            }
        }
    }
}
