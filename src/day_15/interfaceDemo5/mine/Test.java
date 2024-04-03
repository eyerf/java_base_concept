package day_15.interfaceDemo5.mine;

public class Test {
    public static void main(String[] args) {
        PingPongPlayer pingPongPlayer = new PingPongPlayer("pingPongPlayer", 20);
        System.out.println(pingPongPlayer.getName());
        System.out.println(pingPongPlayer.getAge());
        pingPongPlayer.lear();
        pingPongPlayer.speakEnglish();

        BasketballPlayer basketballPlayer = new BasketballPlayer("basketballPlayer", 21);
        System.out.println(basketballPlayer.getName());
        System.out.println(basketballPlayer.getAge());
        basketballPlayer.lear();

        PingPongCoach pingPongCoach = new PingPongCoach("pingPongCoach", 24);
        System.out.println(pingPongCoach.getName());
        System.out.println(pingPongCoach.getAge());
        pingPongCoach.speakEnglish();
        pingPongCoach.teach();

        BasketBallCoach basketBallCoach = new BasketBallCoach("basketBallCoach", 28);
        System.out.println(basketBallCoach.getName());
        System.out.println(basketBallCoach.getAge());
        basketBallCoach.teach();
    }
}
