package day_30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "范闲","范建","范统","杜子腾","杜琦燕","宋合泛","侯笼藤","朱益群","朱穆朗玛峰","袁明媛");
        ArrayList<String> list2 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 2; i++) {
            System.out.println("=========第" + i + "轮点名开始了============");
            while (!list.isEmpty()) {
                int index = random.nextInt(list.size());
                String name = list.remove(index);
                list2.add(name);
                System.out.println(name);
            }
            list.addAll(list2);
            list2.clear();
        }
//        int index = random.nextInt(list.size());
//        String name = list.remove(index);
//        System.out.println(name);
    }
}
