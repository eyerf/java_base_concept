package day_25;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class ListDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String string = iterator.next();
//            System.out.println(string);
//        }

//        for (String string : list) {
//            System.out.println(string);
//        }

//        list.forEach(string -> System.out.println(string));

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        ListIterator<String> stringListIterator = list.listIterator();
        while (stringListIterator.hasNext()) {
            String string = stringListIterator.next();
            if ("bbb".equals(string)) {
                stringListIterator.add("qqq");
            }
        }
        System.out.println(list);
    }
}
