package ejemplos;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ejemplo09 extends JFrame {

	public Ejemplo09() {
		super("Paneles de diálogo");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		setLayout(layout);

		setLocationRelativeTo(null);

		setVisible(true);

		JOptionPane.showMessageDialog(this, "El equipo va a estallar.");
	}

	public static void main(String[] args) {
		Ejemplo09 plantilla = new Ejemplo09();
	}

}
