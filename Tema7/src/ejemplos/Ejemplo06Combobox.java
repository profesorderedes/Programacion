package ejemplos;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo06Combobox extends JFrame {

	public Ejemplo06Combobox() {

		super("Provincias");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JLabel lblProvincias = new JLabel("Elija una provincia:");
		JComboBox<String> cmbProvincias = new JComboBox<>();

		cmbProvincias.addItem("Alicante");
		cmbProvincias.addItem("Albacete");
		cmbProvincias.addItem("Valencia");
		cmbProvincias.addItem("Baleares");

		cmbProvincias.setPreferredSize(new Dimension(300, 30));

		add(lblProvincias);
		add(cmbProvincias);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo06Combobox();
	}
}
