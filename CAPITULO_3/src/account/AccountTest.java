package account;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Account account1 = new Account("Igor Donatti", 50.00);
		Account account2 = new Account("Tatiane Donatti", -7.53);
		
		// exibe saldo inicial de cada objeto
		System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());
		
		Scanner input = new Scanner (System.in);
		
		System.out.printf("Enter depositt amount for %s: ", account1.getName()); // prompt
		double depositAmount = input.nextDouble(); // obtem a entrada do usuario
		System.out.printf("%nadding %.2f to %s balance%n%n", depositAmount, account1.getName());
		account1.deposit(depositAmount); // adiciona o saldo de account1
		
		// exibe os saldos
		System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());
	}
}
