package day_15.polymorphism.demo2;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    public void catchMouse() {

    }

    @Override
    public void eat(String food) {
        System.out.println(getAge() + "岁的" + getColor() + "的猫眯着眼睛侧着头吃" + food);
    }
}
