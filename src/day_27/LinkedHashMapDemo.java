package day_27;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("c", 789);
        linkedHashMap.put("b", 456);
        linkedHashMap.put("a", 123);
        linkedHashMap.put("a", 111);

        System.out.println(linkedHashMap);

    }
}
