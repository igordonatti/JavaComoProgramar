package CARDS;

public class DeckOfCardsTest {
	// executa o aplicativo
	public static void main(String[] args) {
		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle(); // coloca cards em ordem aleatoria

		// imprime todas as 53 cartas na ordem em que elas sao distribuidas
		for (int i = 1; i <= 52; i++) {
			// distribui e exibe uma card
			System.out.printf("%-19s", myDeckOfCards.dealCard());

			if (i % 4 == 0) // gera uma nova linha após cada quarta carta
				System.out.println();
		}
	}
}
