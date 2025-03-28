package ejemplos;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ejemplo11Dialogos extends JFrame {

	public Ejemplo11Dialogos() {

		super("Paneles de diálogo");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		// Hacemos que la ventana se muestre centrada en la pantalla.
		setLocationRelativeTo(null);

		JLabel lblRespuesta = new JLabel("Respuesta: ");

		add(lblRespuesta);

		setVisible(true);

//		String respuesta = JOptionPane.showInputDialog(null, "¿Cómo te llamas?");
//
//		if (respuesta != null) {
//			lblRespuesta.setText("Te llamas " + respuesta);
//		} else {
//			lblRespuesta.setText("Has pulsado cancelar.");
//		}
		
		String respuesta = JOptionPane.showInputDialog(this, "¿Altura?", "Introducción de altura", JOptionPane.INFORMATION_MESSAGE);
		

	}

	public static void main(String[] args) {
		new Ejemplo11Dialogos();
	}

}
