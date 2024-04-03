package day_21;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = "";
        while (true) {
            string = scanner.next();
            if(!allCharacter(string)) {
                System.out.println("字符串中不能有其他字符");
                continue;
            }
            if(!lengthCorrect(string)) {
                System.out.println("字符串最少1位，最大10位");
                continue;
            }
            if(startWithZero(string)) {
                System.out.println("字符串不能以0打头");
                continue;
            }
            break;
        }
        int number = parseInt(string);
        System.out.println(number);
    }

    private static int parseInt(String string) {
        int number = 0;
        for (int i = 0; i < string.length(); i++) {
            number = number * 10;
            number += string.charAt(i) - '0';
        }
        return number;
    }

    private static boolean startWithZero(String string) {
        if (string.charAt(0) == '0') {
            return true;
        }
        return false;
    }

    private static boolean lengthCorrect(String string) {
        if(string.length() <= 0 || string.length() > 10) {
            return false;
        }
        return true;
    }

    private static boolean allCharacter(String string) {
        for (int i = 0; i < string.length(); i++) {
            if(!Character.isDigit(string.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
