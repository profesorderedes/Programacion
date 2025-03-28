package actividades1;

import java.awt.FlowLayout;

import javax.swing.JFrame;

import javax.swing.JOptionPane;

public class Act2 extends JFrame {

	public Act2() {

		super("Confirmacion de DNI");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		JOptionPane.showInputDialog(this, "Escribe tu DNI:", "Confirmación de identidad", JOptionPane.QUESTION_MESSAGE);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Act2();

	}
}