package day_15.polymorphism.demo2;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    public void lookHome() {

    }

    @Override
    public void eat(String food) {
        System.out.println(getAge() + "岁的" + getColor() + "的狗两只前腿死死的抱住" + food + "猛吃");
    }
}
