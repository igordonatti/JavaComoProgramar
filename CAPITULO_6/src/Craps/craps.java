package Craps;

import java.security.SecureRandom;

public class craps {
	// criar um gerador seguro de numeros aleatorios para uso do metodo rollDice
	private static final SecureRandom randomNumbers = new SecureRandom();

	// tipo enum com constantes que representam o estado do jogo
	private enum Status {
		CONTINUE, WON, LOST
	};

	// constantes que representam lancamentos comuns dos dados
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;

	// joga uma partida de craps
	public static void main(String[] args) {
		int myPoint = 0; // pontos se nao ganhar ou perder na 1 rolagem
		Status gameStatus; // pode conter CONTINUE, WON ou LOST

		int sumOfDice = rollDice(); // primeira rolagem dos dados

		// determina o estado do jogo e a pontuacao com base no primeiro lancamento
		switch (sumOfDice) {
		case SEVEN: // ganha com 7 no primeiro lancamento
		case YO_LEVEN: // ganha com 11 no primeiro lancamento
			gameStatus = Status.WON;
			break;
		case SNAKE_EYES: // perde com 2 no primeiro lancamento
		case TREY: // perde com 3 no primeiro lancamento
		case BOX_CARS: // perde com 12 no primeiro lancamento
			gameStatus = Status.LOST;
			break;
		default: // nao ganhou nem perdeu, portatno registra a pontuacao
			gameStatus = Status.CONTINUE; // jogo nao terminou
			myPoint = sumOfDice; // informa a pontuacao
			System.out.printf("Point is %d%n", myPoint);
			break;
		}

		// enquanto o jogo nao estiver completo
		while (gameStatus == Status.CONTINUE) { // nem WON nem LOST
			sumOfDice = rollDice(); // lanca os dados novamente

			// determina o estado do jogo
			if (sumOfDice == myPoint) // vitoria por pontuacao
				gameStatus = Status.WON;
			else if (sumOfDice == SEVEN) // perde obtendo 7 antes de atingir a pontuacao
				gameStatus = Status.LOST;
		}

		// exibe uma mensagem ganhou ou perdeu
		if (gameStatus == Status.WON)
			System.out.println("Player wins");
		else
			System.out.println("Player loses");
	}

	public static int rollDice() {
		// seleciona valores aleatorios do dado
		int die1 = 1 + randomNumbers.nextInt(6); // primeiro lancamento do dado
		int die2 = 1 + randomNumbers.nextInt(6);

		int sum = die1 + die2; // soma dos valores dos dados

		// exibe os resultados desse lancamento
		System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

		return sum;
	}
}
