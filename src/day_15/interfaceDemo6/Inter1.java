package day_15.interfaceDemo6;

public interface Inter1 {

    public default void show() {
        System.out.println("接口中的默认方法");
    }
}
