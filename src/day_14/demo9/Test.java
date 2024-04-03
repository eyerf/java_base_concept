package day_14.demo9;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("heima001", "zhangsan", 15000, 8000);
        System.out.println(manager);
        manager.work();
        manager.eat();

        Cook cook = new Cook("heima002", "lisi", 8000);
        System.out.println(cook);
        cook.work();
        cook.eat();
    }
}
