package day_11;

public class StringDemo7 {
    public static void main(String[] args) {
        String idNumber = "421002200107081030";
        String birthday = getBirthday(idNumber);
        String gender = getGender(idNumber);
        System.out.println(birthday);
        System.out.println(gender);
    }

    private static String getGender(String idNumber) {
        if((idNumber.charAt(16) - '0') % 2 == 0) {
            return "女";
        }else {
            return "男";
        }
    }

    private static String getBirthday(String idNumber) {
        String birthday = idNumber.substring(6, 14);
        return birthday.substring(0, 4) + "年" + birthday.substring(4, 6) + "月" + birthday.substring(6) + "日";
    }
}
