package day_15.interfaceDemo8;

public interface InterA {
    public static void show1() {
        System.out.println("show1方法开始执行了");
        show3();
    }

    public static void show2() {
        System.out.println("show2方法开始执行了");
        show3();
    }

    private static void show3() {
        System.out.println("记录程序在运行过程中的各种细节");
    }
}
