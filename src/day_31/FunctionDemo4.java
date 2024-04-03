package day_31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionDemo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌,15", "周芷若,14", "赵敏,13", "张强,20", "张三丰,100", "张翠山,40", "张良,35", "王二麻子,37");
//        List<Student> studentList = list.stream().map(new Function<String, Student>() {
//            @Override
//            public Student apply(String s) {
//                String[] arr = s.split(",");
//                String name = arr[0];
//                int age = Integer.parseInt(arr[1]);
//                return new Student(name, age);
//            }
//        }).collect(Collectors.toList());
//
//        System.out.println(studentList);

        List<Student> studentList = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(studentList);
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

    public Student(String s) {
        String[] arr = s.split(",");
        String name = arr[0];
        int age = Integer.parseInt(arr[1]);
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
}
