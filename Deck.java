// Deck.java

import java.util.*;
class Deck{
	ArrayList<Card> deck; // ArrayList has datatype Card
	
	public Deck(){
		deck = new ArrayList<>();
	}
	
	public void createDeck(){ //Method to create the deck
		String[] ranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		String[] suits = {"Spades","Hearts","Diamonds","Clubs"};
		
		for (String rank : ranks){ 
			for (String suit : suits){
				deck.add(new Card(rank,suit)); // adding the string into ArrayList
			}
		}				
	}
	
	public void displayDeck(){ // method to display the deck
		for (Card card : deck){ // for loop to iterate over ArrayList
			System.out.println(card);
		}		
	}
	
	public void displayCard( Card card1 ){ // method to display the card
		System.out.println("\n");
		System.out.println(card1);	
	}
	
	public void sameCard( Card card1, Card card2) //Card which is from same suit
	{
		if (card1.suit.equalsIgnoreCase(card2.suit)) 
		{
			System.out.println("Cards are of same suits");
			return;
		}
		System.out.println("Cards doesn't belong to same suits");
	}
	
	public void compareCard( Card card1, Card card2) //Card which is from same suit
	{
		if ( card1.rank.equalsIgnoreCase(card2.rank) ){
			System.out.println("Cards are of same rank");
			return;
		}
		System.out.println("Cards doesn't have same rank");
	}
	
	public void shuffleDeck(){ // method to suffle card
		Collections.shuffle(deck);
	}
	
	//
	public void randomCards(){ // method to select 5 random cards from deck
		shuffleDeck();
		Card card1 = deck.get(0);         
        Card card2 = deck.get(1); 
		Card card3 = deck.get(2);         
        Card card4 = deck.get(3); 
		Card card5 = deck.get(4);         
        
		System.out.println(card1);
		System.out.println(card2);
		System.out.println(card3);
		System.out.println(card4);
		System.out.println(card5);
	}
	
	public void findCard(String rank, String suit) // method to find the card position
	{
		int position = 0;
		for (Card card : deck){ // iterates over deck to find the card
			if (card.rank.equalsIgnoreCase(rank) && card.suit.equalsIgnoreCase(suit))
{
				System.out.println("Found Card in Deck!!!\n\n"+ "Its the"+position+"th card");
				return;
			}
			position++;	
		}
    }		
	
	
	//Method to distribute 5 cards at random to 3 players
	public void dealCards(){
		ArrayList<Card> player1 = new ArrayList<>();
		ArrayList<Card> player2 = new ArrayList<>();
		ArrayList<Card> player3 = new ArrayList<>();
		

		for (int i = 0; i < 5 ; i++){ // giving first 5 cards to player 1
			Card card1 = deck.get(i); 
			player1.add(card1);
		}
		
		for (int i = 5; i < 10 ; i++){ // giving  5 to 10 cards to player 2
			Card card1 = deck.get(i); 
			player2.add(card1);
		}
		
		for (int i = 10; i < 15 ; i++){ // giving cards 10 to 15 to player 3
			Card card1 = deck.get(i); 
			player3.add(card1);
		}
	    // Displaying the deck recieved by each player
		System.out.println("\n First Player's Deck is!: ");
		for (Card card : player1){
			System.out.println(card);
		}
		System.out.println("\n Second Player's Deck is!: ");
		for (Card card : player2){
			System.out.println(card);
		}
		System.out.println("\n Third Player's Deck is!: ");
		for (Card card : player3){
			System.out.println(card);
		}	
	}	
}
