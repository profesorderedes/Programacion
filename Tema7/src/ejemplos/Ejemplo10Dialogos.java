package ejemplos;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ejemplo10Dialogos extends JFrame {

	public Ejemplo10Dialogos() {

		super("Paneles de diálogo");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		// Hacemos que la ventana se muestre centrada en la pantalla.
		setLocationRelativeTo(null);

		setVisible(true);

		// Vamos probando los paneles de diálogo.
		// JOptionPane.showMessageDialog(this, "Copia de seguridad terminada.");
//		JOptionPane.showMessageDialog(this, "No se ha encontrado el archivo.", "Error de E/S", JOptionPane.ERROR_MESSAGE);

	}

	public static void main(String[] args) {
		new Ejemplo10Dialogos();
	}

}
