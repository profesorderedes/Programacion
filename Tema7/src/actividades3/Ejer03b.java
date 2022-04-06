package actividades3;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import java.awt.*;

public class Ejer03b extends JFrame {

	public Ejer03b() {

		super("BorderLayout");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		JProgressBar prgCombustible = new JProgressBar(0, 100);
		prgCombustible.setStringPainted(true);

		JProgressBar prgMotor1 = new JProgressBar(0, 100);
		prgMotor1.setStringPainted(true);

		JProgressBar prgMotor2 = new JProgressBar(0, 100);
		prgMotor2.setStringPainted(true);

		add(prgCombustible);
		add(prgMotor1);
		add(prgMotor2);
		setVisible(true);

		for (int i = 0; i < 21; i++) {

			prgCombustible.setValue(i);

			prgCombustible.setForeground(Color.RED);

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		pintarBarraMotor(prgMotor1);
		pintarBarraMotor(prgMotor2);

	}
	
	private void pintarBarraMotor(JProgressBar prgMotor) {
		
		for (int i = 0; i <= 75; i++) {

			prgMotor.setValue(i);

			if (i <= 20) {

				prgMotor.setForeground(Color.RED);

			} else if (i < 50) {

				prgMotor.setForeground(Color.YELLOW);

			} else {

				prgMotor.setForeground(Color.GREEN);

			}

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		
	}

	public static void main(String[] args) {

		new Ejer03b();

	}

}