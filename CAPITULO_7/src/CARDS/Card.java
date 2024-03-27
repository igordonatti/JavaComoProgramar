package CARDS;

public class Card {
	private final String face; // face da carte ("Ace", "Deuce", ...)
	private final String suit; // naipe da carte ("Hearts", "Diamonds", ...)

	// construtor de dois argumentos inicializa face e naipe da carta
	public Card(String cardFace, String cardSuit) {
		this.face = cardFace; // inicializa face da carta
		this.suit = cardSuit; // inicializa naipe da carta
	}

	// retorn representacao String de card
	public String toString() {
		return face + " of " + suit;
	}
} // fim da classe card
