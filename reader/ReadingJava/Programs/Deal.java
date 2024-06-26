/******************************************************************************
 *  Compilation:  javac Deal.java
 *  Execution:    java Deal PLAYERS
 *
 *  Deal 5-card hands at random to the given number of players.
 *
 *  % java Deal 3
 *  4 of Spades
 *  9 of Spades
 *  Ace of Hearts
 *  9 of Clubs
 *  9 of Diamonds
 *
 *  6 of Spades
 *  10 of Hearts
 *  Queen of Hearts
 *  8 of Hearts
 *  King of Spades
 *
 *  7 of Hearts
 *  8 of Diamonds
 *  Queen of Spades
 *  3 of Spades
 *  4 of Diamonds
 *
 ******************************************************************************/



 // This needs to be Re-Factor'd
 // This is a simple program that deals 5-card hands at random to the given number of players.
 // It needs to be generalized, so that it can be used for any number of players and any number of cards per player.
 // Also the blocks of code in `main` should be broken down into methods.
// the code is not well-organized, and it is not clear what the code does.
// the SUITS and RANKS arrays should be declared as constants. And outside of the main method.


public class Deal {
    public static void main(String[] args) {
        int CARDS_PER_PLAYER = 5;

        // number of players
        int PLAYERS = Integer.parseInt(args[0]);
        // what does this ^^^^ mean?

        String[] SUITS = {
            "Clubs", "Diamonds", "Hearts", "Spades"
        };

        String[] RANKS = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
        };

  	int n = SUITS.length * RANKS.length;

        if (CARDS_PER_PLAYER * PLAYERS > n)
            throw new RuntimeException("Too many players");


        // initialize deck
        String[] deck = new String[n];
        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {
                deck[SUITS.length*i + j] = RANKS[i] + " of " + SUITS[j];
            }
        }

        // shuffle
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n-i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        // print shuffled deck
        for (int i = 0; i < PLAYERS * CARDS_PER_PLAYER; i++) {
            System.out.println(deck[i]);
            if (i % CARDS_PER_PLAYER == CARDS_PER_PLAYER - 1)
                System.out.println();
        }
    }

}
