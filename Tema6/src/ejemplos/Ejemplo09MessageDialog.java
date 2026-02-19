package ejemplos;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ejemplo09MessageDialog extends JFrame {

	public Ejemplo09MessageDialog() {
		
		super("Paneles de diálogo");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		setLayout(layout);

		setLocationRelativeTo(null);

		setVisible(true);

		JOptionPane.showMessageDialog(this, "El equipo va a estallar.");

		JOptionPane.showMessageDialog(this, "El equipo va a estallar.", "Alerta!", JOptionPane.WARNING_MESSAGE);

	}

	public static void main(String[] args) {
		Ejemplo09MessageDialog plantilla = new Ejemplo09MessageDialog();
	}

}
