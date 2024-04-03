package day_24;

public class Test2 {
    public static void main(String[] args) {
        int small = 2;
        int large = 0;
        int month = 12;
        month--;
        while (month > 0) {
            int nextSmall = large;
            int nextLarge = large + small;
            small = nextSmall;
            large = nextLarge;
            month--;
        }
        System.out.println("small = " + small);
        System.out.println("large = " + large);
    }
}
