package day_11;

public class StringDemo8 {
    public static void main(String[] args) {
        String talk = "你TMD真是SB个人MLGB才";
        String[] sensitiveWord = {"TMD", "CNM", "SB", "MLGB"};
        for (String s : sensitiveWord) {
            talk = talk.replace(s, "*".repeat(s.length()));
        }
        System.out.println(talk);
    }
}
