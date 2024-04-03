package day_34;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Test7 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\18345\\Desktop");
        Map<String, Integer> map = getAnalyze(file);
        System.out.println(map);
    }

    private static Map<String, Integer> getAnalyze(File file) {
        Map<String, Integer> map = new HashMap<>();
        File[] files = file.listFiles();
        if (files != null) {
            for (File file1 : files) {
                if (file1.isFile()) {
                    String name = file1.getName();
                    String[] split = name.split("\\.");
                    if (split.length >= 2) {
                        String type = split[split.length - 1];
                        map.put(type, map.getOrDefault(type, 0) + 1);
                    }
                } else if (file1.isDirectory()) {
                    Map<String, Integer> sonMap = getAnalyze(file1);
                    for (Map.Entry<String, Integer> entry : sonMap.entrySet()) {
                        String key = entry.getKey();
                        map.put(key, map.getOrDefault(key, 0) + entry.getValue());
                    }
                }
            }
        }
        return map;
    }
}
