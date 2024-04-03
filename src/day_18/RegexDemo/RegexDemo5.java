package day_18.RegexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo5 {
    public static void main(String[] args) {
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";
//        Pattern pattern = Pattern.compile("Java\\d{0,2}");
//        Matcher matcher = pattern.matcher(str);
//        boolean b = matcher.find();
//        String s1 = matcher.group();
//        System.out.println(s1);
//        b = matcher.find();
//        String s2 = matcher.group();
//        System.out.println(s2);

        Pattern pattern = Pattern.compile("Java\\d{0,2}");
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()) {
            String s = matcher.group();
            System.out.println(s);
        }
    }
}
