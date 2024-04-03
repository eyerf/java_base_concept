package day_16.innerClassDemo4;

public class Test {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.show1();
        Outer.Inner.show2();
    }
}
