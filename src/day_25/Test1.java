package day_25;

import java.util.ArrayList; 

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new PersianCat("PersianCat1", 3));
        cats.add(new Tabby("Tabby1", 4));
        keepCat(cats);
        keepPet(cats);

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Husky("Husky1", 5));
        dogs.add(new Teddy("Teddy1", 5));
        keepDog(dogs);
        keepPet(dogs);

    }

    public static void keepCat(ArrayList<? extends Cat> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).eat();
        }
    }

    public static void keepDog(ArrayList<? extends Dog> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).eat();
        }
    }

    public static void keepPet(ArrayList<? extends Animal> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).eat();
        }
    }
}

abstract class Animal {
    private String name;
    private int age;

    public abstract void eat();

    public Animal() {
    }

    public Animal(String name, int age) {
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
        return "Animal{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}

abstract class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }
}

class PersianCat extends Cat{
    public PersianCat() {
    }

    public PersianCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() + "的," + getAge() + "岁的波斯猫,在吃小饼干");
    }
}

class Tabby extends Cat {
    public Tabby() {
    }

    public Tabby(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() + "的," + getAge() + "岁的狸花猫,正在吃鱼");
    }
}

abstract class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
}

class Teddy extends Dog {
    public Teddy() {
    }

    public Teddy(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() + "的," + getAge() + "岁的泰迪,正在吃骨头,边吃边蹭");
    }
}

class Husky extends Dog {
    public Husky() {
    }

    public Husky(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() + "的," + getAge() + "岁的哈士奇,正在吃骨头,边吃边拆家");
    }
}