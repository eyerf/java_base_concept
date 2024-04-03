package day_15.interfaceDemo6;

public interface Inter {

    public abstract void method();

    public default void show() {
        System.out.println("接口1中的默认方法");
    }
}
