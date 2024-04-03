package day_25;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

//        list.add(1, "QQQ");
//
//        String remove = list.remove(0);
//        System.out.println(remove);
//        System.out.println(list);

//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//
//        list.remove(Integer.valueOf(1));
//
//        System.out.println(list);

//        String qqq = list.set(0, "QQQ");
//        System.out.println(qqq);
//        System.out.println(list);

        String string = list.get(0);
        System.out.println(string);
        System.out.println(list);
    }
}
