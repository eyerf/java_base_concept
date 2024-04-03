package day_21;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String binaryString = toBinaryString(scanner.nextInt());
        System.out.println(binaryString);
    }

    private static String toBinaryString(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        while (number > 0) {
            stringBuilder.insert(0, number % 2);
            number = number >> 1;
        }
        return stringBuilder.toString();
    }
}
