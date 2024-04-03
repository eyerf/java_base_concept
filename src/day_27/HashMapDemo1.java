package day_27;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapDemo1 {
    public static void main(String[] args) {
        Map<Student, String> map = new HashMap<>();
        Student student1 = new Student("zhangsan", 23);
        map.put(student1, "湖北");
        Student student2 = new Student("lisi", 24);
        map.put(student2, "山东");
        Student student3 = new Student("wangwu", 25);
        map.put(student3, "北京");

        Student student4 = new Student("zhangsan", 23);
        map.put(student4, "上海");


        for (Map.Entry<Student, String> studentStringEntry : map.entrySet()) {
            Student key = studentStringEntry.getKey();
            String value = studentStringEntry.getValue();
            System.out.println(key + " = " + value);
        }

    }
}

class Student {
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
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
}
