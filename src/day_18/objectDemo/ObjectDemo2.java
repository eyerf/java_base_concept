package day_18.objectDemo;

public class ObjectDemo2 {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 23);
        Student student2 = new Student("zhangsan", 23);
        System.out.println(student1.equals(student2));
    }
}
