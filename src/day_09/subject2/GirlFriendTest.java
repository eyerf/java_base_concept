package day_09.subject2;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend girlFriend1 = new GirlFriend();
        girlFriend1.setAge(18);
        girlFriend1.setGender("女");
        girlFriend1.setName("小诗诗");
        System.out.println("girlFriend1.getName() = " + girlFriend1.getName());
        System.out.println("girlFriend1.getAge() = " + girlFriend1.getAge());
        System.out.println("girlFriend1.getGender() = " + girlFriend1.getGender());
        girlFriend1.eat();
        girlFriend1.sleep();
    }
}
