package day_27;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDemo4 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("鲁迅", "这句话一定是我说的");
        map.put("曹操", "不可能绝对不可能");
        map.put("刘备", "接着奏乐接着舞");
        map.put("柯镇恶", "看我眼色形式");

//        map.forEach(new BiConsumer<String, String>() {
//            @Override
//            public void accept(String key, String value) {
//                System.out.println(key + " = " + value);
//            }
//        });

        map.forEach((key, value) -> System.out.println(key + " = " + value));
    }
}
