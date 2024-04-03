package day_08;

import java.util.Scanner;

public class Test_01 {
    static final int BUSINESS_CLASS = 0;
    static final int ECONOMY_CLASS = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入当前月份");
        int month = sc.nextInt();
        System.out.println("请输入机票的原价");
        int originalPrice = sc.nextInt();
        System.out.println("请输入是几等仓");
        int currClass = sc.nextInt();
        int finalPrice = getTicketPrice(originalPrice, month, currClass);
        System.out.println(finalPrice);
    }

    private static int getTicketPrice(int originalPrice, int month, int currClass) {
        if(month >= 5 && month <= 10) {
            if(currClass == BUSINESS_CLASS) {
                return (int) (originalPrice * 0.9);
            } else if (currClass == ECONOMY_CLASS) {
                return (int) (originalPrice * 0.85);
            }
        } else {
            if(currClass == BUSINESS_CLASS) {
                return (int) (originalPrice * 0.7);
            } else if (currClass == ECONOMY_CLASS) {
                return (int) (originalPrice * 0.65);
            }
        }
        return originalPrice;
    }
}
