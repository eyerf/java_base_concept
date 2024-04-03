package day_15.polymorphism.demo2;

public class Person {
    private String name;
    private int age;

    public void keepPet(Animal animal, String food) {
        if (animal instanceof Dog dog) {
            System.out.println("年龄为" + getAge() + "岁的" + getName() + "养了一只" + dog.getColor() + "的" + dog.getAge() + "岁的狗");
            dog.eat(food);
        } else if (animal instanceof Cat cat) {
            System.out.println("年龄为" + getAge() + "岁的" + getName() + "养了一只" + cat.getColor() + "的" + cat.getAge() + "岁的猫");
            cat.eat(food);
        }
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
