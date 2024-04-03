package day_15.polymorphism.demo2;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("老王", 30);
        Dog dog = new Dog(2, "黑颜色");
        person.keepPet(dog, "米饭");
        Person person1 = new Person("老李", 25);
        Cat cat = new Cat(3, "灰颜色");
        person1.keepPet(cat, "小鱼干");
    }
}
