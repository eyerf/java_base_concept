package day_13;

public class Test2 {
    public static void main(String[] args) {
        String strA = "cdeab";
        String strB = "cdeab";
        boolean flag = false;
        for(int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if(strA.equals(strB)) {
                flag = true;
            }
        }
        System.out.println(flag);
    }

    private static String rotate(String strA) {
//        StringBuilder sb = new StringBuilder(strA);
        char ch = strA.charAt(0);
//        sb.delete(0, 1);
//        sb.append(ch);
//        return sb.toString();
        return strA.substring(1) + ch;
    }
}
