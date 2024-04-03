package day_12;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("aaa").append("bbb").append("ccc").append("ddd");
        System.out.println(sb.toString());
    }
}
