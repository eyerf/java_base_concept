package day_31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class FunctionDemo5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaa", "bbb", "ccc", "ddd");

//        list.stream().map(new Function<String, String>() {
//            @Override
//            public String apply(String s) {
//                return s.toUpperCase();
//            }
//        }).forEach(s -> System.out.println(s));

        list.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));
    }
}
