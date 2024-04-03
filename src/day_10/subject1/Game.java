package day_10.subject1;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        MyCharacter character1 = new MyCharacter();
        MyCharacter character2 = new MyCharacter();
        initializeCharacter(character1, 1);
        initializeCharacter(character2, 2);
        while (character1.getHP() > 0 && character2.getHP() > 0) {
            attack(character1, character2);
            attack(character2, character1);
        }
        if(character1.getHP() < 0) {
            System.out.println("游戏结束， 角色" + character2.getName() + "获胜");
        } else {
            System.out.println("游戏结束， 角色" + character1.getName() + "获胜");
        }
    }

    private static void attack(MyCharacter character1, MyCharacter character2) {
        Scanner sc = new Scanner(System.in);
        System.out.println(character1.getName() + "开始攻击了， 请输入此次攻击照成的伤害");
        int damage = sc.nextInt();
        character2.setHP(Math.max(character2.getHP() - damage, 0));
        System.out.println(character1.getName() + "攻击成功， 本次攻击共造成" + damage + "点伤害," + character2.getName() + "还剩余血量" + character2.getHP());
    }

    private static void initializeCharacter(MyCharacter character, int num) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第" + num + "个角色的姓名");
        character.setName(sc.next());
        System.out.println("请输入第" + num + "个角色的血量");
        character.setHP(sc.nextInt());
    }
}
