package day_27;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("标枪选手", "马超");
        map.put("人物挂件", "明世隐");
        map.put("御龙骑士", "伊志平");

//        Set<Map.Entry<String, String>> entries = map.entrySet();
//        for (Map.Entry<String, String> entry : entries) {
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key + " = " + value);
//        }

//        Set<Map.Entry<String, String>> entries = map.entrySet();
//        for (Map.Entry<String, String> entry : entries) {
//            System.out.println(entry.getKey() + " = " + entry.getValue());
//        }

//        Set<Map.Entry<String, String>> entries = map.entrySet();
//        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<String, String> entry = iterator.next();
//            System.out.println(entry.getKey() + " = " + entry.getValue());
//        }

        Set<Map.Entry<String, String>> entries = map.entrySet();
        entries.forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue()));
    }
}
