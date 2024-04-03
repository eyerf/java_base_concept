package day_18.RegexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo7 {
    public static void main(String[] args) {
        String s = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

//        String regex = "Java(?=8|11|17)";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(s);
//        while (matcher.find()) {
//            String s1 = matcher.group();
//            System.out.println(s1);
//        }

//        String regex = "((?i)Java)(8|11|17)";
//        String regex2 = "((?i)Java)(?:8|11|17)";
//        Pattern pattern = Pattern.compile(regex2);
//        Matcher matcher = pattern.matcher(s);
//        while (matcher.find()) {
//            String s1 = matcher.group();
//            System.out.println(s1);
//        }

        String regex4 = "((?i)Java)(?!8|11|17)";
        Pattern pattern = Pattern.compile(regex4);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
