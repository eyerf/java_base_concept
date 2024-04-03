package day_18.objectDemo;

import java.util.Objects;

public class ObjectDemo1 {
    public static void main(String[] args) {
//        Object object = new Object();
//        String string = object.toString();
//        System.out.println(object);
//        System.out.println(string);
//        Student student = new Student("zhangsan", 23);
//        System.out.println(student);

        Student student1 = null;
        Student student2 = new Student("zhangsan", 23);
//        System.out.println(student1.equals(student2));
        boolean result = Objects.equals(student1, student2);
        System.out.println(result);
        System.out.println(Objects.isNull(student1));
        System.out.println(Objects.nonNull(student1));
    }
}
