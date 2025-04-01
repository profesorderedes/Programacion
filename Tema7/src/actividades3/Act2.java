package actividades3;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Act2 extends JFrame {

	public Act2() {
		super("Selección de modelo");
		setSize(400, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		JLabel lblModelo = new JLabel("Modelo?");

		String[] modelos = { "Peugeot", "Volkswagen", "Renault", "Seat", "Ferrari", "Porsche", "Jaguar", "Dacia",
				"Hyundai" };

		JList<String> lstModelo = new JList<>(modelos);

		JScrollPane scpModelo = new JScrollPane(lstModelo);

		add(scpModelo);
		add(lblModelo);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Act2();
	}
}