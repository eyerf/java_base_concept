package day_12;

import java.util.StringJoiner;

public class StringJoinerDemo2 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        sj.add("aaa").add("bbb").add("ccc");
        System.out.println(sj);
    }
}
