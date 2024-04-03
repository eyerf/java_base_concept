package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");
        /*list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if (s.startsWith("张")) {
                    return true;
                }
                return false;
            }
        });*/

//        list.stream().filter(name -> name.startsWith("张")).forEach(name -> System.out.println(name));
//        list.stream().limit(3).forEach(s -> System.out.println(s));

//        list.stream().skip(4).forEach(s -> System.out.println(s));

        list.stream().skip(3).limit(3).forEach(s -> System.out.println(s));
//        int i = 1;
//        System.out.println((++i) + (++i));
    }
}
