package day_04;

public class Test_02 {
    public static void main(String[] args) {
        int number = 10;
        switch (number) {
            case 1 -> {
                System.out.println(1);
            }
            case 2 -> {
                System.out.println(2);
            }
            case 3 -> {
                System.out.println(3);
            }
            default -> {
                System.out.println("没有这种选项");
            }
        }
    }
}
