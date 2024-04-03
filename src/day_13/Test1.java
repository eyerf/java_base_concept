package day_13;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] romanNumerals = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String romanNumeral = getRomanNumeral(str, romanNumerals);
        System.out.println(romanNumeral);
        char number = '5';
        String romanStr = getRomanNumeral(number);
        System.out.println(romanStr);
    }

    private static String getRomanNumeral(char number) {
        String str = switch (number) {
            case '1' -> "I";
            case '2' -> "II";
            case '3' -> "III";
            case '4' -> "IV";
            case '5' -> "V";
            case '6' -> "VI";
            case '7' -> "VII";
            case '8' -> "VIII";
            case '9' -> "IX";
            default -> "";
        };
        return str;
    }

    private static String getRomanNumeral(String str, String[] romanNumerals) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            if(num == 0) {
                return "";
            }
            sb.append(romanNumerals[num - 1]);
        }
        return sb.toString();
    }
}
