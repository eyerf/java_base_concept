package day_15.interfaceDemo5.realCase;

public abstract class Coach extends Person{
    public abstract void teach();

    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }
}
