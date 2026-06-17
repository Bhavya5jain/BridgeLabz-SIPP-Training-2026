package coreJavaPractice.gcr_codebase.String.LEVEL3;

import java.util.Scanner;

public class DeckOfCards {

    public static String[] initializeDeck() {

        String[] suits = {
                "Hearts",
                "Diamonds",
                "Clubs",
                "Spades"
        };

        String[] ranks = {
                "2","3","4","5","6","7",
                "8","9","10",
                "Jack","Queen",
                "King","Ace"
        };

        String[] deck = new String[52];

        int index = 0;

        for (String suit : suits) {

            for (String rank : ranks) {

                deck[index++] =
                        rank + " of " + suit;
            }
        }

        return deck;
    }

    public static void shuffle(String[] deck) {

        int n = deck.length;

        for (int i = 0; i < n; i++) {

            int random =
                    i + (int)(Math.random()
                            * (n - i));

            String temp = deck[i];
            deck[i] = deck[random];
            deck[random] = temp;
        }
    }

    public static void distributeCards(
            String[] deck,
            int players,
            int cards) {

        if (players * cards > 52) {

            System.out.println(
                    "Not enough cards");

            return;
        }

        int index = 0;

        for (int i = 0; i < players; i++) {

            System.out.println(
                    "\nPlayer " + (i + 1));

            for (int j = 0; j < cards; j++) {

                System.out.println(
                        deck[index++]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int players = sc.nextInt();
        int cards = sc.nextInt();

        String[] deck = initializeDeck();

        shuffle(deck);

        distributeCards(
                deck,
                players,
                cards);

        sc.close();
    }
}
