package day_15.interfaceDemo5.mine;

public class BasketballPlayer extends SportsMan implements Learn{
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void lear() {
        System.out.println("学打篮球");
    }
}
