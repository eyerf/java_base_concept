package day_21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (sum <= 200) {
            int number = scanner.nextInt();
            list.add(number);
            sum += number;
        }
        System.out.println(list);
    }
}
