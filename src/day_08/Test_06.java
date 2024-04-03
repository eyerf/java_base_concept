package day_08;

import java.util.Scanner;

public class Test_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int encryptedNum = encrypt(num);
        int decryptedNum = decrypt(encryptedNum);
        System.out.println("num = " + num);
        System.out.println("encryptedNum = " + encryptedNum);
        System.out.println("decryptedNum = " + decryptedNum);
        
    }

    private static int decrypt(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            num /= 10;
            digit = (digit - 5 + 10) % 10;
            newNum = newNum * 10 + digit;
        }
        return newNum;
    }

    private static int encrypt(int num) {
        int newNum = 0;
        while(num > 0) {
            int digit = num % 10;
            num /= 10;
            digit = (digit + 5) % 10;
            newNum = newNum * 10 + digit;
        }
        return newNum;
    }
}
