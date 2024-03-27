package GUI;

import javax.swing.JFrame;

public class drawPanelTest {
	public static void main(String[] args) {
		// cria um painel que contem nosso desenho
		DrawPanel panel = new drawPanel();

		// cria um novo quadro para armazenar o painel
		JFrame application = new JFrame();

		// configura o frame para ser encerrrado quando ele é fechado
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		application.add(panel); // adiciona o painel ao frame
		application.setSize(250, 250); // configura o tamanho do frame
		application.setVisible(true); // torna o frame visível
	}
} // fim da classe drawPanelTest
