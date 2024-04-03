package day_11;

public class StringDemo6 {
    public static void main(String[] args) {
        String phoneNumber = "13112349468";
        String codedPhoneNumber = encrypt(phoneNumber);
        System.out.println(codedPhoneNumber);
    }

    private static String encrypt(String phoneNumber) {
        return phoneNumber.substring(0, 3) + "****" + phoneNumber.substring(7);
    }
}
