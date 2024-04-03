package day_08;

import java.util.Random;

public class Test_03 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            createCAPTCHA();
        }
    }

    private static void createCAPTCHA() {
        Random rd = new Random();
        StringBuilder CAPTCHA = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int num = rd.nextInt(52);
            if(num < 26) {
                CAPTCHA.append((char) (num + 'a'));
            }
            else {
                CAPTCHA.append((char) (num - 26 + 'A'));
            }
        }
        CAPTCHA.insert(rd.nextInt(5), rd.nextInt(10));
        System.out.println(CAPTCHA.toString());
    }
}
