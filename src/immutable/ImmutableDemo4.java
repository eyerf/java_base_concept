package immutable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ImmutableDemo4 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("zhangsan", "nanjing");
//        Set<Map.Entry<String, String>> entries = map.entrySet();
//        Map.Entry[] array = entries.toArray(new Map.Entry[map.size()]);
//        Map entries1 = Map.ofEntries(array);
        Map<String, String> copied = Map.copyOf(map);
    }
}
