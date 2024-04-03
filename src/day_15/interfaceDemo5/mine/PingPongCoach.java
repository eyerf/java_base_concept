package day_15.interfaceDemo5.mine;

public class PingPongCoach extends SportsMan implements Teach, Speak{
    public PingPongCoach() {
    }

    public PingPongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("说英语");
    }

    @Override
    public void teach() {
        System.out.println("教打乒乓球");
    }
}
