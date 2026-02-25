package hoja1;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ejer03 extends JFrame {

	public Ejer03() {

		super("Diálogos");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		setLayout(layout);

		setLocationRelativeTo(null);

		setVisible(true);

		JOptionPane.showMessageDialog(this, "Se ha detectado un escaneo de red desde la IP 192.168.1.51.",
				"Alerta de seguridad", JOptionPane.WARNING_MESSAGE);

	}

	public static void main(String[] args) {
		Ejer03 plantilla = new Ejer03();
	}

}
