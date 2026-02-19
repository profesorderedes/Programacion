package ejemplos;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ejemplo10 extends JFrame {

	public Ejemplo10() {

		super("Diálogos");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		setLayout(layout);

		setLocationRelativeTo(null);

		setVisible(true);

		int respuesta = JOptionPane.showConfirmDialog(this, "¿Acepta los términos y condiciones?");

		if (respuesta == JOptionPane.YES_OPTION) {
			System.out.println("Ha pulsado Sí");
		} else if (respuesta == JOptionPane.NO_OPTION) {
			System.out.println("Ha pulsado No");
		} else {
			System.out.println("Ha pulsado Cancelar");
		}

		respuesta = JOptionPane.showConfirmDialog(this, "¿Quiere actualizar el programa?", "Actualizar",
				JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
		
	}

	public static void main(String[] args) {
		Ejemplo10 plantilla = new Ejemplo10();
	}

}
