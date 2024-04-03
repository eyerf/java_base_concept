package day_30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0);
        Collections.shuffle(list);
//        System.out.println(list);
//        System.out.println(list);
        Integer number = list.get(0);
//        System.out.println(number);

        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();

        Collections.addAll(boyList, "范闲","范建","范统","杜子腾","宋合泛","侯笼藤","朱益群","朱穆朗玛峰");
        Collections.addAll(girlList, "杜琦燕","袁明媛","李猜","田蜜蜜");

        Random random = new Random();
        if (number == 1) {
            int boyIndex = random.nextInt(boyList.size());
            System.out.println(boyList.get(boyIndex));
        } else {
            int girlIndex = random.nextInt(girlList.size());
            System.out.println(girlList.get(girlIndex));
        }
    }
}
