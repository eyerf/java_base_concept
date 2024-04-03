package day_18.objectDemo;

import com.google.gson.Gson;

public class ObjectDemo3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0};
        User user1 = new User(1, "zhangsan", "1234qwer", "girl11", data);
        User user2 = (User) user1.clone();



//        System.out.println(user1);
//        System.out.println(user2);

        Gson gson = new Gson();
        String string = gson.toJson(user1);
//        System.out.println(string);

        User user = gson.fromJson(string, User.class);
        user1.getData()[0] = 100;
        System.out.println(user);
    }
}
