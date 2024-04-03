package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-男-15", "赵敏-女-13");
//        List<String> strings = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toList());
//        System.out.println(strings);

//        Set<String> strings = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toSet());
//        System.out.println(strings);

//        Map<String, Integer> collect = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toMap(new Function<String, String>() {
//            @Override
//            public String apply(String s) {
//                return s.split("-")[0];
//            }
//        }, new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return Integer.parseInt(s.split("-")[2]);
//            }
//        }));


        Map<String, Integer> collect = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toMap(s -> s.split("-")[0], s -> Integer.parseInt(s.split("-")[2])));
        System.out.println(collect);
    }
}
