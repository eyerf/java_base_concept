package day_05;

public class Test_01 {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        while (start <= 100) {
            if(start % 10 == 7 || (start / 10) % 10 == 7 || start % 7 == 0) {
                System.out.println("过");
            }
            else {
                System.out.println(start);
            }
            start++;
        }
    }
}
