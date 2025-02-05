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
}