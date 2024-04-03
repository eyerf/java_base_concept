package day_13;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionsTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        int total = 3;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            list.add(new Student(sc.next(), sc.nextInt()));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
