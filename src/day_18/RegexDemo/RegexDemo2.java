package day_18.RegexDemo;

import java.util.regex.Pattern;

public class RegexDemo2 {
    public static void main(String[] args) {
//        System.out.println("你".matches(".."));
//        System.out.println("你".matches("."));
//        System.out.println("你a".matches(".."));
//
//        System.out.println("a".matches("\\d"));
//        System.out.println("3".matches("\\d"));
//        System.out.println("333".matches("\\d\\d\\d"));

//        System.out.println("2442fsfsf".matches("\\w{6,}"));
//        System.out.println("2442f".matches("\\w{6,}"));

        System.out.println("23df".matches("[a-zA-Z0-9]{4}"));
        System.out.println("23_f".matches("[a-zA-Z0-9]{4}"));
        System.out.println("23df".matches("[\\w&&[^_]]{4}"));
        System.out.println("23_f".matches("[\\w&&[^_]]{4}"));

    }
}
