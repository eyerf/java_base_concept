package day_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionsTest2 {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User("1", "zhangsan", "123456"));
        list.add(new User("2", "lisi", "654321"));
        list.add(new User("3", "wangwu", "123321"));
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入该用户的id");
            User user = getUser(sc.next(), list);
            if(user == null) {
                System.out.println("不存在该用户，请重新输入");
            }
            else {
                System.out.println(user);
            }
        }
    }

    private static User getUser(String id, List<User> list) {
        for (User user : list) {
            if(user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }


}
