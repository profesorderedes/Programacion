package hoja3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Ejercicio03 extends JFrame {

	public Ejercicio03() {

		super("Parámetros críticos");
		setSize(290, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setLocationRelativeTo(null);

		JProgressBar prgCombustible = new JProgressBar(0, 100);
		prgCombustible.setPreferredSize(new Dimension(150, 22));
		prgCombustible.setForeground(new Color(255, 0, 0));
		prgCombustible.setStringPainted(true);
		prgCombustible.setValue(20);

		JProgressBar prgPresionM1 = new JProgressBar(0, 100);
		prgPresionM1.setPreferredSize(new Dimension(150, 22));
		prgPresionM1.setForeground(new Color(1, 192, 0));
		prgPresionM1.setStringPainted(true);
		prgPresionM1.setValue(75);

		JProgressBar prgPresionM2 = new JProgressBar(0, 100);
		prgPresionM2.setPreferredSize(new Dimension(150, 22));
		prgPresionM2.setForeground(new Color(1, 192, 0));
		prgPresionM2.setStringPainted(true);
		prgPresionM2.setValue(75);

		add(prgCombustible);
		add(new JLabel("Combustible"));
		add(prgPresionM1);
		add(new JLabel("Presión motor 1"));
		add(prgPresionM2);
		add(new JLabel("Presión motor 2"));

		setVisible(true);

	}

	public static void main(String[] args) {

		Ejercicio03 ventana = new Ejercicio03();

		boolean timer = true;

		if (timer) {
			
			for (int i = 10; i >= 0; i--) {
				if (i == 1) {
					System.out.println("Closing window...");
				}

				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println("Error al ejecutar sleep()");
				}
			}

			ventana.dispose();
			System.out.println("Window closed.");

		}

	}

}