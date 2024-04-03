package immutable;

import java.util.Iterator;
import java.util.List;

public class ImmutableDemo1 {
    public static void main(String[] args) {
        List<String> strings = List.of("zhangsan", "lisi", "wangwu", "zhaoliu");

        /*System.out.println(strings.get(0));
        System.out.println(strings.get(1));
        System.out.println(strings.get(2));
        System.out.println(strings.get(3));*/

        /*for (String string : strings) {
            System.out.println(string);
        }*/

        /*Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            System.out.println(string);
        }*/

        /*for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }*/

        /*strings.remove("lisi");*/

        /*strings.add("aaa");*/

        /*strings.set(0, "aaa");*/
    }
}
