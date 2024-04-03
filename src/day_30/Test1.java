package day_30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "范闲", "范建", "范统", "杜子腾", "宋合泛", "候笼藤", "朱益群", "珠穆朗玛峰", "袁明媛");
//        Random random = new Random();
//        int index = random.nextInt(list.size());
//        String name = list.get(index);
//        System.out.println(name);
        Collections.shuffle(list);
        String name = list.get(0);
        System.out.println(name);
    }
}
