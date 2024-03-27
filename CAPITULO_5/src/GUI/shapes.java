package GUI;

import java.awt.Graphics;

import javax.swing.JPanel;

public class shapes extends JPanel {
	private int choice; // escolha do usuario de qual forma desenhar

	// construtor configura a escolha do usuario
	public shapes(int userChoice) {
		choice = userChoice;
	}

	// desenha uma cascata de forma que iniciam do canto superior esquerdo
	public void paintComonent(Graphics g) {
		super.paintComponent(g);

		for (int i = 0; i < 10; i++) {
			// seleciona a forma com base na esoclha do usuario
			switch (choice) {
			case 1: // desenha retangulos
				g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
				break;
			case 2: // desenha ovais
				g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
				break;
			}
		}
	}
}
