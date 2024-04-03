package day_14.userSystem;

import day_14.studentSystem.StudentSystem;

import java.util.*;

public class UserSystem {
    static List<User> userList = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            showMainMenu();
        }
    }

    private static void showMainMenu() {
        System.out.println("欢迎来到学生管理系统");
        System.out.println("请选择操作:\n1、登录\n2、注册\n3、忘记密码\n4、退出");
        Scanner sc = new Scanner(System.in);
        String option = sc.next();
        switch (option) {
            case "1" -> login();
            case "2" -> register();
            case "3" -> resetPassword();
            case "4" -> {
                System.out.println("谢谢使用，再见");
                System.exit(0);
            }
            default -> System.out.println("没有该选项");
        }
    }

    private static void resetPassword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想重置密码的用户名");
        String username = sc.next();
        if (!registered(username)) {
            System.out.println("用户不存在!");
            return;
        }
        System.out.println("请输入该用户的身份证号码");
        String id = sc.next();
        System.out.println("请输入该用户的手机号码");
        String phoneNumber = sc.next();
        User user = getUser(username, id, phoneNumber);
        if(user != null) {
            System.out.println("请输入性修改后的密码");
            String newPassword = sc.next();
            user.setPassword(newPassword);
        }else {
            System.out.println("账号信息不匹配，修改失败!");
        }
    }

    private static User getUser(String username, String id, String phoneNumber) {
        for (User user : userList) {
            if (user.getUsername().equals(username) && user.getId().equals(id) && user.getPhoneNumber().equals(phoneNumber)) {
                return user;
            }
        }
        return null;
    }

    private static void register() {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        while (true) {
            System.out.println("请输入用户名:");
            String username = sc.next();
            String result = checkUserName(username);
            if (result == null) {
                user.setUsername(username);
                break;
            }else {
                System.out.println("输入的用户名无效:" + result);
            }
        }
        while (true) {
            System.out.println("请输入密码:");
            String password = sc.next();
            System.out.println("请再次输入密码:");
            String repeatPassword = sc.next();
            if (repeatPassword.equals(password)) {
                user.setPassword(password);
                break;
            }else {
                System.out.println("两次输入的密码不一致，请重新输入!");
            }
        }
        while (true) {
            System.out.println("请输入身份证号码:");
            String idNumber = sc.next();
            String result = checkIdNumber(idNumber);
            if(result == null) {
                user.setId(idNumber);
                break;
            } else {
                System.out.println("身份证号码不符合要求:" + result);
            }
        }
        while (true) {
            System.out.println("请输入手机号码:");
            String phoneNumber = sc.next();
            String result = checkPhoneNumber(phoneNumber);
            if(result == null) {
                user.setPhoneNumber(phoneNumber);
                break;
            }
            else {
                System.out.println("手机号码不符合要求:" + result);
            }
        }
        System.out.println("用户添加成功!");
        userList.add(user);
    }

    private static String checkPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 11) {
            return "手机号长度不为11位";
        }
        if (phoneNumber.charAt(0) == '0') {
            return "手机号不能以0开头";
        }
        if (!phoneNumber.matches("^[0-9]{11}$")) {
            return "手机号必须都是数字";
        }
        return null;
    }

    private static String checkIdNumber(String idNumber) {
        if(idNumber.length() != 18) {
            return "身份证号码的长度不为18位";
        }
        if (idNumber.charAt(0) == '0') {
            return "身份证号码的首位不能以0开头";
        }
        if(!idNumber.matches("^[0-9]{17}[0-9Xx]$")) {
            return "身份证号码的前17位必须为数字，最后一位为数字或者X或者x";
        }
        return null;
    }

    private static String checkUserName(String username) {
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                return "用户名不唯一";
            }
        }
        if (username.length() < 3 || username.length() > 15) {
            return "用户名长度必须位于3到15之间";
        }
        if (!username.matches("^(?=.*[a-zA-Z])[a-zA-Z0-9]+$")) {
            return "用户名长度只能是字母加数字的组合，且不能是存数字";
        }
        return null;
    }

    private static void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入登录的用户名");
        String username = sc.next();
        if (!registered(username)) {
            System.out.println("用户还未注册，请先注册");
            return;
        }
        int chances = 3;
        while (chances > 0) {
            chances--;
            System.out.println("请输入密码");
            String passWord = sc.next();
            while (true) {
                if (checkCAPTCHA()) {
                    break;
                }
            }
            if(checkUserNameAndPassword(username, passWord)) {
                System.out.println("登录成功");
                StudentSystem.startSystem();
                break;
            }else {
                System.out.println("输入的密码错误。登录失败!您目前还剩下" + chances + "次机会");
            }
        }
    }

    private static boolean checkUserNameAndPassword(String username, String passWord) {
        for (User user : userList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(passWord)) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkCAPTCHA() {
        System.out.println("请输入验证码");
        String CAPTCHA = generateCAPTCHA();
        System.out.println(CAPTCHA);
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        return CAPTCHA.equalsIgnoreCase(input);
    }

    private static String generateCAPTCHA() {
        char[] CAPTCHA = new char[5];
        Random rd = new Random();
        for (int i = 0; i < 4; i++) {
            if (rd.nextInt(2) == 0) {
                CAPTCHA[i] = (char) ('a' + rd.nextInt(26));
            }
            else {
                CAPTCHA[i] = (char) ('A' + rd.nextInt(26));
            }
        }
        CAPTCHA[4] = (char) ('0' + rd.nextInt(10));
        int index = rd.nextInt(5);
        char character = CAPTCHA[index];
        CAPTCHA[index] = CAPTCHA[4];
        CAPTCHA[4] = character;
        return new String(CAPTCHA);
    }

    private static boolean registered(String username) {
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
}
