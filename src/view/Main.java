
package view;
import javax.swing.JOptionPane;
import controller.ThreadSapo;

public class Main {

	public static void main(String[] args) {

		int limite = Integer.parseInt(JOptionPane.showInputDialog("Estabeleça um Limite em KM/H: "));

		Thread Player1 = new ThreadSapo(1, limite);
		Thread Player2 = new ThreadSapo(2, limite);
		Thread Player3 = new ThreadSapo(3, limite);
		Thread Player4 = new ThreadSapo(4, limite);
		Thread Player5 = new ThreadSapo(5, limite);

		Player1.start();
		Player2.start();
		Player3.start();
		Player4.start();
		Player5.start();

	}
}
