package day_31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class FunctionDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰");
//        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));

//        list.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.startsWith("张") && s.length() == 3;
//            }
//        }).forEach(s -> System.out.println(s));

//        list.stream().filter(new StringOperation()::StringCheck).forEach(s -> System.out.println(s));

        list.stream().filter(new FunctionDemo3()::StringCheck).forEach(s -> System.out.println(s));
    }

    public boolean StringCheck(String s) {
        return s.startsWith("张") && s.length() == 3;
    }
}

class StringOperation {
    public boolean StringCheck(String s) {
        return s.startsWith("张") && s.length() == 3;
    }
}
