package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public class StreamDemo9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "张无忌", "张无忌", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");

//        list.stream().forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

//        list.stream().forEach(s -> System.out.println(s));


//        long count = list.stream().count();
//        System.out.println(count);

//        Object[] array = list.stream().toArray();
//        System.out.println(Arrays.toString(array));

//        String[] array = list.stream().toArray(new IntFunction<String[]>() {
//            @Override
//            public String[] apply(int value) {
//                return new String[value];
//            }
//        });
//        System.out.println(Arrays.toString(array));

        String[] array = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(array));
    }
}
