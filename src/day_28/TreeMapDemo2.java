package day_28;

import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        String string = "aababcabcdabcde";
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (treeMap.containsKey(c)) {
                Integer count = treeMap.get(c);
                count++;
                treeMap.put(c, count);
            } else {
                treeMap.put(c, 1);
            }
        }
//        StringBuilder stringBuilder = new StringBuilder();
//        treeMap.forEach((character, integer) -> stringBuilder.append(character).append("(").append(integer).append(")"));
        StringJoiner stringJoiner = new StringJoiner("", "", "");
        treeMap.forEach((key, value) -> stringJoiner.add(key + "").add("(").add(value + "").add(")"));


        System.out.println(stringJoiner.toString());
    }
}
