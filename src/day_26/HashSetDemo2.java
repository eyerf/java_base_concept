package day_26;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo2 {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        set.add(new Student("zhangsan", 23));
        set.add(new Student("lisi", 24));
        set.add(new Student("zhangsan", 23));

        System.out.println(set);
    }
}

