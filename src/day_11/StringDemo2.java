package day_11;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        String username = "root";
        String password = "123456";
        Scanner sc = new Scanner(System.in);
        int chance = 3;
        while (chance > 0) {
            chance--;
            System.out.println("请输入用户名:");
            String inputUserName = sc.next();
            System.out.println("请输入密码:");
            String inputPassword = sc.next();
            if (inputUserName.equals(username) && inputPassword.equals(password)) {
                System.out.println("登录成功！");
                break;
            } else {
                System.out.println("用户名或密码不匹配，请重新输入。");
            }
        }
    }
}
