package actividades1;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Act4 extends JFrame {

	public Act4() {

		super("Series");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		String[] series = { "Futurama", "Los Simpson", "Héroes" };

		setVisible(true);

		int serie = JOptionPane.showOptionDialog(this, "Haz clic en tu serie favorita", "Elección de serie", 0,
				JOptionPane.INFORMATION_MESSAGE, null, series, series[2]);

		System.out.println("Serie: " + serie);

	}

	public static void main(String[] args) {

		new Act4();

	}

}