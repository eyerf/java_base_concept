package day_16.innerClassDemo4;

public class Outer {
    static int a = 10;

    static class Inner {
        public void show1() {
            System.out.println(a);
            System.out.println("非静态的方法被调用了");
        }

        public static void show2() {
            System.out.println(a);
            System.out.println("静态的方法被调用了");
        }
    }
}
