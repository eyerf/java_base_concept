package day_15.polymorphism.demo2;

public class Animal {
    private int age;
    private String color;

    public void eat(String food) {
        System.out.println("eating " + food);
    }

    public Animal() {
    }

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
