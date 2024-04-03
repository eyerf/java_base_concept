package day_27;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("郭靖", "黄蓉");

//        System.out.println(value2);
        map.put("韦小宝", "沐剑屏");
        map.put("伊志平", "小龙女");

//        String value = map.put("韦小宝", "双儿");
//
//        System.out.println(value);

//        String remove = map.remove("郭靖");
//        System.out.println(remove);

//        map.clear();

//        boolean result = map.containsKey("郭靖");
//        System.out.println(result);

//        boolean result = map.containsValue("小龙女");
//        System.out.println(result);

//        boolean empty = map.isEmpty();
//        System.out.println(empty);

        int size = map.size();
        System.out.println(size);

        System.out.println(map);
    }
}
