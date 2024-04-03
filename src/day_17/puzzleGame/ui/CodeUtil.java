package day_17.puzzleGame.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CodeUtil {
    public static String getCode() {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char)('a' + i));
        }
        for (int i = 0; i < 26; i++) {
            list.add((char)('A' + i));
        }
        shuffle(list);
        String str = "" + list.get(0) + list.get(1) + list.get(2) + list.get(3);
        return addNumber(str);
    }

    private static String addNumber(String str) {
        Random random = new Random();
        int num = random.nextInt(10);
        int index = random.nextInt(5);
        return str.substring(0, index) + num + str.substring(index);
    }

    private static void shuffle(List<Character> list) {
        Random random = new Random();
        for (int i = 0; i < list.size(); i++) {
            int index = random.nextInt(list.size());
            char ch = list.get(i);
            list.set(i, list.get(index));
            list.set(index, ch);
        }
    }


}
