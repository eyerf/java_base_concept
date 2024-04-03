package day_25;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        boolean result = collection.remove("aaa");
        System.out.println(result);
        System.out.println(collection);
        boolean result2 = collection.contains("bbb");
        System.out.println(result2);
    }
}
