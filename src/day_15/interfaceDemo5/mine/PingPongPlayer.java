package day_15.interfaceDemo5.mine;

public class PingPongPlayer extends SportsMan implements Learn, Speak{
    public PingPongPlayer() {
    }

    public PingPongPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void lear() {
        System.out.println("学打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("说英语");
    }
}
