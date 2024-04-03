package day_26;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(4);
        set.add(5);
        set.add(1);
        set.add(3);
        set.add(2);

//        Iterator<Integer> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            Integer next = iterator.next();
//            System.out.println(next);
//        }

//        for (Integer integer : set) {
//            System.out.println(integer);
//        }

        set.forEach(x -> System.out.println(x));
    }
}
