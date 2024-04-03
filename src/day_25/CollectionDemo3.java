package day_25;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("ddd");

        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            if ("bbb".equals(string)) {
                iterator.remove();
            }
        }
        System.out.println(collection);
    }
}
