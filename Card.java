//Card.java

class Card{ 
	String rank;
	String suit;
	
	public Card(String rank, String suit){  // constructor
		this.rank = rank;
		this.suit = suit;
	}
	
	public String toString(){ // we are using a default method toString 
		return rank+" of "+suit;	
	}
}