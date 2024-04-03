package day_16.innerClassDemo6;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        new Swim() {
            @Override
            public void swim() {
                System.out.println("重写了游泳的方法");
            }
        };

        new Animal() {
            @Override
            public void eat() {
                System.out.println("重写了eat方法");
            }
        };

//        Dog dog = new Dog();
//        method(dog);

        method(new Animal() {
            @Override
            public void eat() {
                System.out.println("狗吃骨头");
            }
        });
        List<Integer> list = new ArrayList<>();

    }

    public static void method(Animal a) {
        a.eat();
    }
}
