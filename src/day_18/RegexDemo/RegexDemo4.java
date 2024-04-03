package day_18.RegexDemo;

public class RegexDemo4 {
    public static void main(String[] args) {
//        String regex1 = "\\w{4,16}";
//        System.out.println("zhangsan".matches(regex1));
//        System.out.println("lisi".matches(regex1));
//        System.out.println("wangwu".matches(regex1));
//        System.out.println("$123".matches(regex1));


//        String regex2 = "[1-9]\\d{16}[xX0-9]";
//        System.out.println("421002200107081030".matches(regex2));

//        String regex4 = "a((?i)b)c";
//        System.out.println("abc".matches(regex4));
//        System.out.println("ABC".matches(regex4));
//        System.out.println("aBc".matches(regex4));

        String regex6 = "[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])\\d{3}[\\dXx]";
        System.out.println("421002202807081030".matches(regex6));
    }
}
