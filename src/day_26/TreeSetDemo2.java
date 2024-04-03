package day_26;

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 23);
        Student student2 = new Student("lis", 24);
        Student student3 = new Student("wangwu", 25);

        TreeSet<Student> set = new TreeSet<>();
        set.add(student1);
        set.add(student2);
        set.add(student3);

        System.out.println(set);
    }
}
