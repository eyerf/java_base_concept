package day_27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HashMapDemo2 {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};
        ArrayList<String> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 80; i++) {
            int index = random.nextInt(arr.length);
            list.add(arr[index]);
        }

        HashMap<String, Integer> map = new HashMap<>();
        for (String name : list) {
            if (map.containsKey(name)) {
                Integer count = map.get(name);
                count++;
                map.put(name, count);
            } else {
                map.put(name, 1);
            }
        }

        int max = 0;
        for (Map.Entry<String, Integer> entries : map.entrySet()) {
            Integer count = entries.getValue();
            if (count > max) {
                max = count;
            }
        }

        for (Map.Entry<String, Integer> entries : map.entrySet()) {
            Integer count = entries.getValue();
            if (count == max) {
                System.out.println(entries.getKey());
            }
        }

    }
}
