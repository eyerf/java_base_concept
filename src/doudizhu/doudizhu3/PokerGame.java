package doudizhu.doudizhu3;

import java.util.*;

public class PokerGame {
    static List<String> cardBox = new ArrayList<>();
    static Map<String, Integer> map = new HashMap<>();

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

        map.put("J", 11);
        map.put("Q", 12);
        map.put("K", 13);
        map.put("A", 14);
        map.put("2", 15);
        map.put("小王", 50);
        map.put("大王", 100);
    }

    public PokerGame() {
        shuffleCards();

        ArrayList<String> lordCards = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        sendCards(lordCards, player1, player2, player3);

        order(lordCards);
        order(player1);
        order(player2);
        order(player3);

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

    private void order(ArrayList<String> cards) {
        Collections.sort(cards, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String color1 = o1.substring(0, 1);
                int value1 = getValue(o1);
                String color2 = o2.substring(0, 1);
                int value2 = getValue(o2);
                if (value1 != value2) {
                    return value1 - value2;
                } else {
                    return color1.compareTo(color2);
                }
            }
        });
    }

    private int getValue(String poker) {
        if (poker.equals("小王")) {
            return map.get(poker);
        } else if (poker.equals("大王")) {
            return map.get(poker);
        }
        String number = poker.substring(1);
        if (map.containsKey(number)) {
            return map.get(number);
        } else {
            return Integer.parseInt(number);
        }
    }
}
