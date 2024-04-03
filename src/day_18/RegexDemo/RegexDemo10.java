package day_18.RegexDemo;

public class RegexDemo10 {
    public static void main(String[] args) {
        String str = "我要学学编编编编程程程程程程";
        String string = str.replaceAll("(.)\\1+", "$1");
        System.out.println(string);
    }
}
