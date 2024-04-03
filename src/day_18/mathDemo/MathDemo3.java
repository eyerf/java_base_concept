package day_18.mathDemo;

public class MathDemo3 {
    public static void main(String[] args) {
        for (int i = 100; i < 999; i++) {
            int unit = i % 10;
            int tens = i / 10 % 10;
            int hundreds = i / 100 % 10;
            if (Math.pow(unit, 3) + Math.pow(tens, 3) + Math.pow(hundreds, 3) == i) {
                System.out.println(i);
            }
        }
    }
}
