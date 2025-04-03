package ejemplos;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Ejemplo17Menu extends JFrame {

	public Ejemplo17Menu() {

		super("Escribir título");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo17Menu();
	}

}
