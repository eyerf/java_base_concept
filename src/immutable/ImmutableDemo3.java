package immutable;

import java.util.Map;
import java.util.Set;

public class ImmutableDemo3 {
    public static void main(String[] args) {
        Map<String, String> stringMap = Map.of("zhangsan", "nanjing");
//        Set<String> keys = stringMap.keySet();
//        for (String key : keys) {
//            String string = stringMap.get(key);
//            System.out.println(key + " = " + string);
//        }

        Set<Map.Entry<String, String>> entries = stringMap.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
}
