package day_20;

public class IntegerDemo3 {
    public static void main(String[] args) {
        String string = Integer.toBinaryString(100);
        System.out.println("string = " + string);

        String string1 = Integer.toOctalString(100);
        System.out.println("string1 = " + string1);

        String hexString = Integer.toHexString(100);
        System.out.println("hexString = " + hexString);

        int anInt = Integer.parseInt("123");
        System.out.println("anInt = " + anInt);
        System.out.println(anInt + 1);

        String string2 = "true";
        boolean parseBoolean = Boolean.parseBoolean(string2);
        System.out.println("parseBoolean = " + parseBoolean);
    }
}
