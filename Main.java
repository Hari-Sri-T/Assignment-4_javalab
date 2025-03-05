// Main.java
// Name: Tanniru Hari Sri Shanmukha Sai
// PRN: 23070126135
// Batch: AIML B3

class Main{
	public static void main(String args[]){
		
		Deck mydeck = new Deck();
		System.out.println("__________________Create Deck_________________________");
		mydeck.createDeck();
		System.out.println("__________________Print Deck_________________________");
		mydeck.displayDeck();
		System.out.println("__________________Shuffled Deck_________________________");
		mydeck.shuffleDeck();
		System.out.println("\nRandomly Drawn 2 Cards are: ");
		mydeck.randomCards();
		mydeck.distributeCards();
		
		Card card1 = new Card("3","Spades");
		mydeck.displayCard(card1);
	}
}