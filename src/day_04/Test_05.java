package day_04;

import java.util.Scanner;

public class Test_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int dummyNum = num;
        int reversedNum = 0;
        while(dummyNum > 0) {
            reversedNum = reversedNum * 10 +  dummyNum % 10;
            dummyNum /= 10;
        }
        System.out.println("num = " + num);
        System.out.println("reversedNum = " + reversedNum);
        boolean isReverseNum = (reversedNum == num);
        System.out.println("isReverseNum = " + isReverseNum);
    }
}
