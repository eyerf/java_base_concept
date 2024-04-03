package day_16.innerClassDemo5;

public class Outer {
    int b = 20;

    public void show() {
        int a = 10;
        class Inner {
            String name;
            int age;
            public void method1() {
                System.out.println(a);
                System.out.println(b);
                System.out.println("局部内部类的method1方法");
            }

            public static void method2() {
                System.out.println("局部内部类的静态method2方法");
            }
        }

        Inner inner = new Inner();
        System.out.println(inner.name);
        System.out.println(inner.age);
        inner.method1();
        Inner.method2();
    }
}
