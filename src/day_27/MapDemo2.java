package day_27;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("伊志平", "小龙女");
        map.put("郭靖", "穆念慈");
        map.put("欧阳克", "黄蓉");
//        Set<String> keySet = map.keySet();
//        for (String key : keySet) {
//            String value = map.get(key);
//            System.out.println(key + " = " + value);
//        }

//        Set<String> keys = map.keySet();
//        for (String key : keys) {
//            System.out.println(key + " = " + map.get(key));
//        }

//        Set<String> keys = map.keySet();
//        Iterator<String> iterator = keys.iterator();
//        while (iterator.hasNext()) {
//            String key = iterator.next();
//            System.out.println(key + " = " + map.get(key));
//        }

        Set<String> keys = map.keySet();
        keys.forEach(key -> System.out.println(key + " = " + map.get(key)));
    }
}
