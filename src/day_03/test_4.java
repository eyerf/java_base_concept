package day_03;

import java.util.Scanner;

public class test_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight1 = sc.nextInt();
        int weight2 = sc.nextInt();
        System.out.println(weight1 == weight2 ? "体重相同" : "体重不同");
    }
}
