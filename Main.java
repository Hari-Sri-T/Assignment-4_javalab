// Main.java
// Name: Tanniru Hari Sri Shanmukha Sai
// PRN: 23070126135
// Batch: AIML B3
import java.util.*;

class Main{
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in); //Scanner object to scan user input
		
		Deck mydeck = new Deck(); // to access deck methods
				
        while (true) {// menu
		    System.out.println("-----------------------------------------------------");
            System.out.println("\nMenu:");
            System.out.println("1. Create Deck");
            System.out.println("2. Display Deck");
            System.out.println("3. Display Card");
			System.out.println("4. Comparisions between 2 Cards");
            System.out.println("5. Find Card position");
			System.out.println("6. Deal Cards to players");
			System.out.println("7. Shuffle Deck");
			System.out.println("8. Display 5 random cards");
			System.out.println("9. exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scan.nextLine());
            System.out.println("-----------------------------------------------------\n");
			
            switch (choice) { //switch case to run code based on user choice
                case 1:  // to create deck
					System.out.println("__________________Create Deck_________________________");
					mydeck.createDeck(); // method to create a new deck
					break;

                case 2:  // to print deck
					System.out.println("__________________Print Deck_________________________");
					mydeck.displayDeck(); // calling method to print a deck
					break;

                case 3: // to print card
					System.out.println("__________________Print Card_________________________");
					System.out.println("Please enter the rank of the card you want to find: ");
					String rank1 = scan.nextLine();
		
					System.out.println("Please enter the suit of the card you want to find: ");
					String suit1 = scan.nextLine();
					
					Card card1 = new Card(rank1,suit1);
					System.out.println(" The card is: ");
					mydeck.displayCard(card1); // calling method to print a card
                    break;

                case 4: // comparisions
					System.out.println("__________________Comparing Cards_________________________");
					System.out.println("Please enter the rank of the 1st card: ");
					String rank11 = scan.nextLine();
		
					System.out.println("Please enter the suit of the 1st card: ");
					String suit11 = scan.nextLine();
					
					Card card11 = new Card(rank11,suit11); //creats a card on entered inputs
					
					System.out.println("Please enter the rank of the 2nd Card: ");
					String rank2 = scan.nextLine();
		
					System.out.println("Please enter the suit of the 2nd Card: ");
					String suit2 = scan.nextLine();
					
					Card card2 = new Card(rank2,suit2);  //creats a card on entered inputs
					
					System.out.println("What do you want to compare: ");
					System.out.println("1. sameCard ( same suit)");
					System.out.println("2. compareCard (same rank)");
					int option = Integer.parseInt(scan.nextLine()); 
					
					switch (option) { // to check either suits or ranks
						case 1: 
							mydeck.sameCard(card11,card2); // calling method to compare suits
							break;
						case 2:
							mydeck.compareCard(card11,card2); //calling method to compare the ranks
							break;
						default:
							System.out.println("Invalid choice! Please enter 1 or 2.");
							break;
					}	
                    break;
					
				case 5: //find card position
				
					System.out.println("__________________find Card_________________________");
					// enter card rank and suits
				
					System.out.println("Please enter the rank of the card you want to find: ");
					String rankkk = scan.nextLine();
		
					System.out.println("Please enter the suit of the card you want to find: ");
					String suitt = scan.nextLine();
		
					mydeck.findCard(rankkk,suitt); //calling method to find position in deck
                    break;
				
				case 6: // to give 5 cards to 3 players
				
					System.out.println("__________________Deal Cards_________________________");
				    System.out.println("Dealing Cards to 5 players: ");
					mydeck.dealCards(); // method to deal cards to players
					break;
				
				case 7: // to shuffle the whole deck
					System.out.println("__________________Shuffled Deck_________________________");
					mydeck.shuffleDeck(); //calling method to shuffle a deck
					System.out.println("Deck is Shuffled");
					
					break;
			

                case 8: // to print random 5 cards
					System.out.println("__________________Random Cards_________________________");
					mydeck.randomCards(); // calling the method from Deck class for it
                    break;
					
				case 9: // to exit program
					System.out.println("\nExiting program...");
                    scan.close();
                    return;
				
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 9.");
            }
        }
    }
}
