package actividades1;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Act3 extends JFrame {
	public Act3() {
		super("Dialogo");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		setVisible(true);

		JOptionPane.showMessageDialog(this, "Se ha detectado un escaneo de red desde la IP 192.168.1.51",
				"Alerta de seguridad", JOptionPane.WARNING_MESSAGE);

	}

	public static void main(String[] args) {

		new Act3();

	}
}