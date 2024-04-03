package doudizhu.doudizhu2;

import java.util.*;

public class PokerGame {

    static HashMap<Integer, String> numberToCards = new HashMap<>();
    static ArrayList<Integer> cards = new ArrayList<>();

    static {
        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int serialNumber = 1;
        for (String number : numbers) {
            for (String color : colors) {
                numberToCards.put(serialNumber, color + number);
                cards.add(serialNumber);
                serialNumber++;
            }
        }
        numberToCards.put(serialNumber, "小王");
        cards.add(serialNumber);
        serialNumber++;
        numberToCards.put(serialNumber, "大王");
        cards.add(serialNumber);

        System.out.println(numberToCards);
        System.out.println(cards);
    }

    public PokerGame() {
        Collections.shuffle(cards);

        TreeSet<Integer> lordCards = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        for (int i = 0; i < cards.size(); i++) {
            int card = cards.get(i);
            if (i <= 2) {
                lordCards.add(card);
            } else if (i % 3 == 0) {
                player1.add(card);
            } else if (i % 3 == 1) {
                player2.add(card);
            } else {
                player3.add(card);
            }
        }

        showPoker("底牌", lordCards);
        showPoker("玩家1", player1);
        showPoker("玩家2", player2);
        showPoker("玩家3", player3);
    }

    public void showPoker(String name, TreeSet<Integer> player) {
        System.out.print(name + ": ");
        for (Integer card : player) {
            System.out.print(numberToCards.get(card) + " ");
        }
        System.out.println();
    }
}
