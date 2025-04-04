package ejemplosParte1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.plaf.basic.BasicProgressBarUI;

public class Ejemplo16ProgressBar extends JFrame {

	public Ejemplo16ProgressBar() {

		super("Indicador de batería");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		JProgressBar prgBateria = new JProgressBar(0, 100);
		prgBateria.setValue(70);
		prgBateria.setStringPainted(true);
		prgBateria.setPreferredSize(new Dimension(380, 30));
		prgBateria.setBackground(Color.ORANGE);
		prgBateria.setForeground(Color.CYAN);
		
		add(prgBateria);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo16ProgressBar();
	}

}
