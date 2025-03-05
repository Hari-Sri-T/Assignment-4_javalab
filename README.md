#  Java Card Deck Management System

##  Description
This Java-based **Card Deck Management System** allows users to **create, display, shuffle, deal, and compare cards**. The program follows **Object-Oriented Programming (OOP)** principles and includes **menu-driven user interaction**.

The system supports:
- **Deck creation**
- **Card display & search**
- **Comparing cards by rank or suit**
- **Shuffling the deck**
- **Dealing cards to players**

---

## Files & Classes Overview

### 1️ **Deck.java**
This file defines the **Deck class**, which manages a deck of cards and provides methods to shuffle, deal, and search for cards.

### 2️ **Card.java**
This file defines the **Card class**, which represents an individual playing card with a rank and suit.

### 3️ **Main.java**
This file contains the **main method** that runs the **menu-based program**, allowing users to interact with the system.

---

##  Classes & Methods

###  Card.java
Defines a **Card** object with attributes and methods.

| Method        | Description |
|--------------|------------|
| `Card(String rank, String suit)` | Constructor to initialize a Card object. |
| `toString()` | Returns a string representation of the card in `"Rank of Suit"` format. |

---

###  Deck.java
Handles **deck operations** such as creating, shuffling, and dealing cards.

| Method        | Description |
|--------------|------------|
| `Deck()` | Constructor that initializes an empty deck. |
| `createDeck()` | Creates a deck of 52 playing cards. |
| `displayDeck()` | Prints all cards in the deck. |
| `displayCard(Card card)` | Prints a single card. |
| `sameCard(Card card1, Card card2)` | Checks if two cards have the same suit. |
| `compareCard(Card card1, Card card2)` | Checks if two cards have the same rank. |
| `shuffleDeck()` | Shuffles the deck randomly. |
| `randomCards()` | Prints 5 random cards from the deck. |
| `findCard(String rank, String suit)` | **Searches for a specific card in the deck and prints its position.** |
| `dealCards()` | Deals 5 cards each to 3 players and displays them. |

---

### Main.java
Contains the **main method**, displaying a menu-driven interface.

| Option | Description |
|--------|------------|
| **1** | Create a new deck. |
| **2** | Display all cards in the deck. |
| **3** | Display a specific card based on user input. |
| **4** | Compare two cards (by suit or rank). |
| **5** | Find a card's position in the deck. |
| **6** | Deal cards to players (3 players, 5 cards each). |
| **7** | Shuffle the deck. |
| **8** | Display 5 random cards. |
| **9** | Exit the program. |

---

##  **How to Run the Program**
1. **Compile all `.java` files**:
   ```sh
   javac Main.java
2. **Run the program:**
   ```sh
   java Main
3.**Follow the menu prompts to interact with the system.**

