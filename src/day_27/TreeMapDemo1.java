package day_27;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        map.put(5, "可口可乐");
        map.put(4, "雷碧");
        map.put(3, "九个核桃");
        map.put(2, "康师傅");
        map.put(1, "阅历月");

        System.out.println(map);
    }
}
