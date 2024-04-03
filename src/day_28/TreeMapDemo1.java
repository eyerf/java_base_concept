package day_28;

import java.util.Objects;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        TreeMap<Student, String> treeMap = new TreeMap<>();
        Student student1 = new Student("zhangsan", 23);
        Student student2 = new Student("lisi", 24);
        Student student3 = new Student("wangwu", 25);

        treeMap.put(student1, "江苏");
        treeMap.put(student2, "天津");
        treeMap.put(student3, "北京");

        System.out.println(treeMap);
    }
}

class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int i = this.getAge() - o.getAge();
        if (i == 0) {
            i = this.getName().compareTo(o.getName());
        } else {
            return i;
        }
        return i;
    }
}
