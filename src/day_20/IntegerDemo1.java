package day_20;

public class IntegerDemo1 {
    public static void main(String[] args) {
        Integer integer = Integer.valueOf(123);
        Integer integer1 = Integer.valueOf("123");
        Integer integer2 = Integer.valueOf("123", 16);
        System.out.println("integer1 = " + integer1);
        System.out.println("integer2 = " + integer2);
        System.out.println("integer = " + integer);
    }
}
