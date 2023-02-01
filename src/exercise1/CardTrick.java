package exercise1;
import java.util.Scanner;
import java.util.Random;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Shaher Jan 31, 2023 
 */
public class CardTrick {

     public static void main(String[] args) {

        Card[] hand = new Card[7];
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13) + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            hand[i] = card;
        }

        System.out.print("Enter the value of the card: ");
        int value = input.nextInt();
        System.out.print("Enter the suit of the card: ");
        int suit = input.nextInt();

        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(Card.SUITS[suit - 1]);

        boolean compare = false;
        for (int i = 0; i < hand.length; i++) {
            if (hand[i].equals(userCard)) {
                compare = true;
                break;
            }
        }
        if (compare) {
            printInfo();
        } else {
            System.out.println("Sorry your card was not found in the hand.");
        }



    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    //i am done!
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Shaher, but you can call me Shaher, Shaher or Shaher");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Workout and gym");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Reading");
        System.out.println("-- Tech");
        System.out.println("-- Making coffee");
        System.out.println("-- Gaming");

        System.out.println();
        
    
    }

}

