package day_12;

import java.util.Scanner;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
//        boolean check = isSymmetric(str);
//        System.out.println(check);
        String result = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(result));
    }

    private static boolean isSymmetric(String str) {
        String firstHalf = str.substring(0, str.length() / 2);
        int index = str.length() % 2 == 0 ? str.length() / 2 : str.length() / 2 + 1;
        StringBuilder sb = new StringBuilder(str.substring(index));
        String secondHalf = sb.reverse().toString();
        return firstHalf.equals(secondHalf);
    }
}
