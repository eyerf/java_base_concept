package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class StreamDemo8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-15", "赵敏-13");

//        list.stream().map(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                String[] arrs = s.split("-");
//                int age = Integer.parseInt(arrs[1]);
//                return age;
//            }
//        }).forEach(s -> System.out.println(s));

        list.stream().
                map(s -> Integer.parseInt(s.split("-")[1])).
                forEach(s -> System.out.println(s));
    }
}
