package day_07;

import java.util.ArrayList;
import java.util.List;

public class Test_01 {
    public static void main(String[] args) {
        if(compare(10, 20)) {
            System.out.println("a >= b");
        }else {
            System.out.println("a < b");
        }
        List<Integer> list = new ArrayList<>();
    }

    public static boolean compare(byte a, byte b) {
        return a >= b;
    }

    public static boolean compare(short a, short b) {
        return a >= b;
    }

    public static boolean compare(int a, int b) {
        return a >= b;
    }

    public static boolean compare(long a, long b) {
        return a >= b;
    }
}
