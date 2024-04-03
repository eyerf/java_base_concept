package day_26;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>((String o1, String o2) -> {
            if (o1.length() != o2.length()) {
                return o1.length() - o2.length();
            }
            else {
                return o1.compareTo(o2);
            }
        });
        set.add("c");
        set.add("ab");
        set.add("df");
        set.add("qwer");

        System.out.println(set);
    }
}
