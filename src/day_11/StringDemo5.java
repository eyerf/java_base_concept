package day_11;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个金额");
        int money = sc.nextInt();
        int[] moneyDigit = new int[7];
        for(int i = 6; i >= 0; i--) {
            moneyDigit[i] = money % 10;
            money = money / 10;
        }
        String characterMoney = construct(moneyDigit);
        System.out.println(characterMoney);
    }

    private static String construct(int[] moneyDigit) {
        char[] characters = {'零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖'};
        return characters[moneyDigit[0]] +
                "佰" +
                characters[moneyDigit[1]] +
                "拾" +
                characters[moneyDigit[2]] +
                "万" +
                characters[moneyDigit[3]] +
                "仟" +
                characters[moneyDigit[4]] +
                "佰" +
                characters[moneyDigit[5]] +
                "拾" +
                characters[moneyDigit[6]] +
                "元";
    }
}
