package day_14.staticDemo.studentDemo;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student student1 = new Student("zhangsan", 23, "男");
        Student student2 = new Student("lisi", 24, "女");
        Student student3 = new Student("wangwu", 25, "男");
        list.add(student1);
        list.add(student2);
        list.add(student3);
        int maxAgeStudent = StudentUtil.getMaxAgeStudent(list);
        System.out.println(maxAgeStudent);
    }
}
