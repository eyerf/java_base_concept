package day_29;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "abc", "bcd", "qwer", "df", "asdf");

        Collections.shuffle(list);

        System.out.println(list);
    }
}
