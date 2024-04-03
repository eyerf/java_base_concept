package day_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PhoneTest {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Phone phone1 = new Phone("小米", 1000);
        Phone phone2 = new Phone("苹果", 8000);
        Phone phone3 = new Phone("锤子", 2999);
        list.add(phone1);
        list.add(phone2);
        list.add(phone3);
        List<Phone> result = getPhoneInfo(list);
        System.out.println(result);
    }

    public static List<Phone> getPhoneInfo(ArrayList<Phone> list) {
        List<Phone> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone phone = list.get(i);
            int price = phone.getPrice();
            if(price < 3000) {
                result.add(phone);
            }
        }
        return result;
    }
}
