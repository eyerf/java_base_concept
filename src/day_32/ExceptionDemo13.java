package day_32;

import java.util.Scanner;

public class ExceptionDemo13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GirlFriend girlFriend = new GirlFriend();

        while (true) {
            try {
                System.out.println("请输入你心仪的女朋友的名字");
                String name = scanner.nextLine();
                girlFriend.setName(name);

                System.out.println("请输入你心仪的女朋友的年龄");
                String ageStr = scanner.nextLine();
                int age = Integer.parseInt(ageStr);
                girlFriend.setAge(age);

                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (NameFormatException e) {
                e.printStackTrace();
            } catch (AgeOutOfBoundsException e) {
                e.printStackTrace();
            }
        }
        System.out.println(girlFriend);
    }
}

class GirlFriend {
    private String name;
    private int age;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 3 || name.length() > 10) {
            throw new NameFormatException(name + "格式有误,长度应该为:3~10");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 40) {
            throw new AgeOutOfBoundsException(age + "超出了范围");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class NameFormatException extends RuntimeException{
    public NameFormatException() {
    }

    public NameFormatException(String message) {
        super(message);
    }
}

class AgeOutOfBoundsException extends RuntimeException{
    public AgeOutOfBoundsException() {
    }

    public AgeOutOfBoundsException(String message) {
        super(message);
    }
}
