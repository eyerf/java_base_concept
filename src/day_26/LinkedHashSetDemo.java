package day_26;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 23);
        Student student4 = new Student("zhangsan", 23);
        Student student2 = new Student("lisi", 24);
        Student student3 = new Student("wangwu", 25);

        LinkedHashSet<Student> linkedHashSet = new LinkedHashSet<>();
        System.out.println(linkedHashSet.add(student3));
        System.out.println(linkedHashSet.add(student2));
        System.out.println(linkedHashSet.add(student1));
        System.out.println(linkedHashSet.add(student4));

        System.out.println(linkedHashSet);
    }
}
