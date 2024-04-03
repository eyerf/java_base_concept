package day_10.subject1;

import java.util.Scanner;

public class MyCharacter {
    private String name;
    private int HP;
    private char gender;
    private String face;


    public MyCharacter() {
    }

    public MyCharacter(String name, int HP) {
        this.name = name;
        this.HP = HP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        while (HP < 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("输入的血量不能为负数，请重新输入");
            HP = sc.nextInt();
        }
        this.HP = HP;
    }
}
