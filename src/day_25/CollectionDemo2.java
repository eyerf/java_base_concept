package day_25;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<Student> collection = new ArrayList<>();
        Student student1 = new Student("zhangsan", 24);
        Student student2 = new Student("lisi", 23);
        Student student3 = new Student("wangwu", 25);
        collection.add(student1);
        collection.add(student2);
        collection.add(student3);
        Student student4 = new Student("zhangsan", 24);
        boolean result = collection.contains(student4);
        System.out.println(result);

        boolean empty = collection.isEmpty();
        System.out.println(empty);


//        collection.remove(student1);
        int size = collection.size();
        System.out.println(collection);
        System.out.println(size);
    }
}
