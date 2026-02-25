package ejemplos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Ejemplo17 extends JFrame {

	public Ejemplo17() {

		super("Descargas");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		setLayout(layout);

		setLocationRelativeTo(null);

		// Descargaremos un archivo de 3MB.
		JProgressBar prgDescargado = new JProgressBar(0, 3072);
		prgDescargado.setPreferredSize(new Dimension(300, 40));
		prgDescargado.setForeground(new Color(255, 220, 40));
		prgDescargado.setStringPainted(true);

		add(new JLabel("Progreso de la descarga"));
		add(prgDescargado);

		setVisible(true);

		for (int i = 0; i <= 3072; i++) {
			prgDescargado.setValue(i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		Ejemplo17 plantilla = new Ejemplo17();
	}

}
