package stream;

import java.util.ArrayList;

public class StreamDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        ArrayList<String> list1 = new ArrayList<>();
        for (String name : list) {
            if (name.startsWith("张")) {
                list1.add(name);
            }
        }

//        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();

        for (String name : list1) {
            if (name.length() == 3) {
                list2.add(name);
            }
        }

        list2.forEach(a -> System.out.println(a));
    }
}
