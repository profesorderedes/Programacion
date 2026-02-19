package hoja1;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ejer02 extends JFrame {

	public Ejer02() {

		super("Diálogos");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		setLayout(layout);

		setLocationRelativeTo(null);

		setVisible(true);

		String dni = JOptionPane.showInputDialog(this, "Escribe tu DNI:", "Confirmación de identidad",
				JOptionPane.QUESTION_MESSAGE);

		JOptionPane.showMessageDialog(this, "Tu DNI es " + dni + ".", "Confirmación de identidad",
				JOptionPane.INFORMATION_MESSAGE);

	}

	public static void main(String[] args) {
		Ejer02 plantilla = new Ejer02();
	}

}
