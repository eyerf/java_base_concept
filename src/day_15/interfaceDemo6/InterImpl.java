package day_15.interfaceDemo6;

public class InterImpl implements Inter, Inter1{
    @Override
    public void method() {
        System.out.println("实现类重写的抽象方法");
    }

    @Override
    public void show() {
        System.out.println("重写接口中的默认方法");
    }
}
