// Main.java

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
	}
}