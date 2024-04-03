package day_24;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        GirlFriend[] girlFriends = new GirlFriend[4];
        girlFriends[0] = new GirlFriend("zhangsan", 21, 167);
        girlFriends[1] = new GirlFriend("lisi", 22, 168);
        girlFriends[2] = new GirlFriend("wangwu", 25, 157);
        girlFriends[3] = new GirlFriend("zhaoliu", 20, 160);

        Arrays.sort(girlFriends, (o1, o2) -> {
            if (o1.getAge() != o2.getAge()) {
                return o1.getAge() - o2.getAge();
            } else if (o1.getHeight() != o2.getHeight()) {
                return o1.getHeight() - o2.getHeight();
            } else {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(Arrays.toString(girlFriends));
    }
}
