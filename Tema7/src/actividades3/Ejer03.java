package actividades3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class Ejer03 extends JFrame {

	JButton btnRepostar = new JButton("Repostar");
	int combustible = 20;

	JButton btnConducir = new JButton("Conducir");
	int presion1 = 75;
	int presion2 = 75;

	JButton btnReparar = new JButton("Reparar motores");

	public Ejer03() {

		super("Parámetros críticos");
		setSize(350, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.CENTER));

		JProgressBar prgCombustible = new JProgressBar(0, 100);
		prgCombustible.setPreferredSize(new Dimension(150, 20));
		prgCombustible.setValue(combustible);
		prgCombustible.setForeground(Color.red);
		prgCombustible.setStringPainted(true);
		JLabel lblCombustible = new JLabel("Combustible");

		JProgressBar prgPresion1 = new JProgressBar(0, 100);
		prgPresion1.setPreferredSize(new Dimension(150, 20));
		prgPresion1.setValue(presion1);
		prgPresion1.setForeground(Color.green);
		prgPresion1.setStringPainted(true);
		JLabel lblPresion1 = new JLabel("Presión motor 1");

		JProgressBar prgPresion2 = new JProgressBar(0, 100);
		prgPresion2.setPreferredSize(new Dimension(150, 20));
		prgPresion2.setValue(presion2);
		prgPresion2.setForeground(Color.green);
		prgPresion2.setStringPainted(true);
		JLabel lblPresion2 = new JLabel("Presión motor 2");

		btnRepostar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (combustible == 100) {

					JOptionPane.showMessageDialog(null, "¡Ya tienes el tanque lleno!", "Tanque de combustible lleno",
							JOptionPane.INFORMATION_MESSAGE);

				} else {

					combustible = 100;
					prgCombustible.setValue(combustible);

				}

			}

		});

		btnConducir.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (combustible <= 20) {

					JOptionPane.showMessageDialog(null, "¡Si sigues conduciendo te puedes quedar tirado!",
							"Poco combustible", JOptionPane.WARNING_MESSAGE);

				} else if (presion1 <= 10 || presion2 <= 10) {

					JOptionPane.showMessageDialog(null, "¡Si sigues conduciendo pueden estropearse los motores!",
							"Presión baja", JOptionPane.WARNING_MESSAGE);

				} else {

					int menosPresion = (int) ((Math.random() * 10) + 1);
					int menosPresion2 = (int) ((Math.random() * 10) + 1);

					combustible = combustible - 20;

					presion1 = presion1 - menosPresion;
					presion2 = presion1 - menosPresion2;

					prgCombustible.setValue(combustible);
					prgPresion1.setValue(presion1);
					prgPresion2.setValue(presion2);

				}

			}

		});

		btnReparar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (presion1 >= 90 || presion2 >= 90) {

					JOptionPane.showMessageDialog(null, "¡Ya tienes los motores casi nuevos!", "Motores reparados",
							JOptionPane.WARNING_MESSAGE);

				} else {

					int masPresion = (int) ((Math.random() * 20) + 1);
					int masPresion2 = (int) ((Math.random() * 20) + 1);

					presion1 = presion1 + masPresion;
					presion2 = presion2 + masPresion2;

					prgPresion1.setValue(presion1);
					prgPresion2.setValue(presion2);

				}

			}

		});

		add(prgCombustible);
		add(lblCombustible);
		add(prgPresion1);
		add(lblPresion1);
		add(prgPresion2);
		add(lblPresion2);
		add(btnRepostar);
		add(btnReparar);
		add(btnConducir);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejer03();

	}

}