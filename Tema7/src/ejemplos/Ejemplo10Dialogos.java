package ejemplos;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ejemplo10Dialogos extends JFrame {

	public Ejemplo10Dialogos() {

		super("Paneles de diálogo");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		// Hacemos que la ventana se muestre centrada en la pantalla.
		setLocationRelativeTo(null);

		JLabel lblRespuesta = new JLabel("Respuesta: ");

		add(lblRespuesta);

		setVisible(true);

		// Vamos probando los paneles de diálogo.
		// JOptionPane.showMessageDialog(this, "Copia de seguridad terminada.");
		// JOptionPane.showMessageDialog(this, "No se ha encontrado el archivo.", "Error
		// de E/S", JOptionPane.ERROR_MESSAGE);

//		int respuesta = JOptionPane.showConfirmDialog(this, "¿Quieres guardar antes de cerrar?");
//
//		if (respuesta == JOptionPane.YES_OPTION) {
//			lblRespuesta.setText("Respuesta: Sí");
//		} else if (respuesta == JOptionPane.NO_OPTION) {
//			lblRespuesta.setText("Respuesta: No");
//		} else if (respuesta == JOptionPane.CANCEL_OPTION) {
//			lblRespuesta.setText("Respuesta: Cancelar");
//		}
		
		int respuesta = JOptionPane.showConfirmDialog(this, "¿Resetear el equipo?", "Resetear", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);

	}

	public static void main(String[] args) {
		new Ejemplo10Dialogos();
	}

}
