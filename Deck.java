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
	
	public void displayDeck(){
		for (Card card : deck){
			System.out.println(card);
		}
			
	}
	
	public void shuffleDeck(){ // method to suffle card
		Collections.shuffle(deck);
	}
	
	//
	public void randomCards(){ // method to select 2 random cards from deck
		Card card1 = deck.get(0);         
        Card card2 = deck.get(1); 
		System.out.println(card1);
		System.out.println(card2);
	}
	
	
	//Method to distribute 5 cards at random to 3 players
	public void distributeCards(){
		ArrayList<Card> player1;
		ArrayList<Card> player2;
		ArrayList<Card> player3;
		player1 = new ArrayList<>();
		player2 = new ArrayList<>();
		player3 = new ArrayList<>();
		

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
