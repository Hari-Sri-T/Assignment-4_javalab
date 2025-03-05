// Main.java
// Name: Tanniru Hari Sri Shanmukha Sai
// PRN: 23070126135
// Batch: AIML B3
import java.util.*;

class Main{
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		
		Deck mydeck = new Deck();
		System.out.println("__________________Create Deck_________________________");
		mydeck.createDeck();
		System.out.println("__________________Print Deck_________________________");
		mydeck.displayDeck();
		System.out.println("__________________Shuffled Deck_________________________");
		mydeck.shuffleDeck();
		System.out.println("\nRandomly Drawn 2 Cards are: ");
		mydeck.randomCards();
		mydeck.dealCards();
		
		Card card1 = new Card("A","Spades");
		mydeck.displayCard(card1);
		
		Card card2 = new Card("A","Hearts");
		
		mydeck.sameCard(card1,card2);
		
		mydeck.compareCard(card1,card2);
		
		System.out.println("Please enter the rank of the card you want to find: ");
		String rankkk = scan.nextLine();
		
		System.out.println("Please enter the suit of the card you want to find: ");
		String suitt = scan.nextLine();
		
		System.out.println("__________________Print Deck_________________________");
		mydeck.displayDeck();
		mydeck.findCard(rankkk,suitt);

	}
}