package School;

import java.util.Scanner;

public class classAverage {
	public static void main(String[] args) {
		// cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);

		// fase de inicializacao
		int total = 0; // inicializa a soma das notas
		int gradeCounter = 0; // inicializa o nº de notas inseridas ate agora

		// fase de processamento
		// solicita entrada e lê a nota do usuario
		System.out.print("Enter grade o -1 to quit: ");
		int grade = input.nextInt();

		// faz um loop ate ler o valor de sentinela inserido pelo usuario
		while (grade != -1) {
			total += grade; // adiciona grade a total
			gradeCounter++;

			// Solicita entrada e lê a proxima nota fornecida pelo usuario
			System.out.print("Enter grade or -1 to quit: ");
			grade = input.nextInt();
		}

		// fase de termino
		// se o usuario inseriu pelo menos uma nota...
		if (gradeCounter != 0) {
			double average = (double) total / gradeCounter;

			// exibe o total e a media (com dois digitos de precisao)
			System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCounter, total);
			System.out.printf("Class average is %.2f%n", average);
		} else
			System.out.println("No average were entered");

		input.close();
	}
}
