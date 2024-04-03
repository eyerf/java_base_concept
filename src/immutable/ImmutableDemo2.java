package immutable;

import java.util.Iterator;
import java.util.Set;

public class ImmutableDemo2 {
    public static void main(String[] args) {
        Set<String> strings = Set.of("zhangsan", "lisi", "wangwu", "zhaoliu");

        for (String string : strings) {
            System.out.println(string);
        }

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            System.out.println(string);
        }
    }
}
