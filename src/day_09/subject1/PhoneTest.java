package day_09.subject1;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.brand = "小米";
        phone1.price = 1999.98;
        System.out.println("phone1.brand = " + phone1.brand);
        System.out.println("phone1.price = " + phone1.price);
        phone1.call();
        phone1.playGame();

        Phone phone2 = new Phone();
        phone2.brand = "苹果";
        phone2.price = 8999;
        phone2.call();
        phone2.playGame();
    }
}
