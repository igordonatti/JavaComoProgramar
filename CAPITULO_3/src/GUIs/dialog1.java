package GUIs;

import javax.swing.JOptionPane;

public class dialog1 {
	public static void main(String[] args) {
		// pede para o usuario inserir seu nome
		String name = JOptionPane.showInputDialog("What is your name");

		// cria a mensagem
		String message = String.format("Welcome, %s, to Java Progamming!", name);

		// exibe a mensagem para cumprimentar o usuario pelo nome
		JOptionPane.showMessageDialog(null, message);
	} // fim de main

	// nao sei pq mas no Eclipse ele nao funciona
	// mas funcionou ao executar na cl
}
