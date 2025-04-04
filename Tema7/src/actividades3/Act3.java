package actividades3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Act3 extends JFrame {

	public Act3() {

		super("Parámetros críticos");
		setSize(360, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setLocationRelativeTo(null);

		JLabel lblCombustible = new JLabel("Combustible");

		JProgressBar pbCombustible = new JProgressBar(0, 100);

		pbCombustible.setValue(20);
		pbCombustible.setStringPainted(true);
		pbCombustible.setPreferredSize(new Dimension(250, 30));
		pbCombustible.setForeground(Color.red);

		JLabel lblPresion = new JLabel("Presión motor 1");
		JProgressBar pbPresion = new JProgressBar(0, 100);
		pbPresion.setValue(75);
		pbPresion.setStringPainted(true);
		pbPresion.setPreferredSize(new Dimension(250, 30));
		pbPresion.setForeground(Color.green);

		JLabel lblPresion2 = new JLabel("Presión motor 2");
		JProgressBar pbPresion2 = new JProgressBar(0, 100);
		pbPresion2.setValue(75);
		pbPresion2.setStringPainted(true);
		pbPresion2.setPreferredSize(new Dimension(250, 30));
		pbPresion2.setForeground(Color.green);

		add(pbCombustible);
		add(lblCombustible);

		add(pbPresion);
		add(lblPresion);

		add(pbPresion2);
		add(lblPresion2);
		setVisible(true);

	}

	public static void main(String[] args) {

		new Act3();

	}

}
