package GUI;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class shapesTest {
	public static void main(String[] args) {
		// obtem a escolha do usuario
		String input = JOptionPane.showInputDialog("Enter 1 to draw rectangles\n" + "Enter 2 to draw ovals");

		int choice = Integer.parseInt(input); // converte a entrada em int

		// cria o painel com a entrada do usuario
		shapes panel = new shapes(choice);

		JFrame application = new JFrame(); // cria um novo Jframe;

		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300, 300);
		application.setVisible(true);
	}
} // fim da classe shapeTest
