package doudizhu.doudizhu1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PokerGame {
    static List<String> cardBox = new ArrayList<>();

    static {
        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        for (String color : colors) {
            for (String number : numbers) {
                cardBox.add(color + number);
            }
        }
        cardBox.add("小王");
        cardBox.add("大王");
    }

    public PokerGame() {
        shuffleCards();

        ArrayList<String> lordCards = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        sendCards(lordCards, player1, player2, player3);

        showPoker("底牌", lordCards);
        showPoker("玩家1", player1);
        showPoker("玩家2", player2);
        showPoker("玩家3", player3);
    }

    private void showPoker(String playerName, ArrayList<String> player) {
        System.out.print(playerName + ":");
        for (int i = 0; i < player.size(); i++) {
            System.out.print(player.get(i));
            if (i != player.size() - 1) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
    }

    private void sendCards(ArrayList<String> lordCards, ArrayList<String> player1, ArrayList<String> player2, ArrayList<String> player3) {
        for (int i = 0; i < cardBox.size(); i++) {
            String poker = cardBox.get(i);
            if (i <= 2) {
                lordCards.add(poker);
            } else if (i % 3 == 0) {
                player1.add(poker);
            } else if (i % 3 == 1) {
                player2.add(poker);
            } else {
                player3.add(poker);
            }
        }
    }

    private void shuffleCards() {
        Collections.shuffle(cardBox);
    }
}
