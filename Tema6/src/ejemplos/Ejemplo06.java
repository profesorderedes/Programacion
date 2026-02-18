package ejemplos;

import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo06 extends JFrame {

	public Ejemplo06() {
		super("Países");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		setLayout(layout);

		JLabel lblPaises = new JLabel("Elige tu país:");

		JComboBox<String> cmbPaises = new JComboBox<>();

		cmbPaises.addItem("España");
		cmbPaises.addItem("Francia");
		cmbPaises.addItem("Portugal");
		cmbPaises.addItem("Italia");
		cmbPaises.addItem("Reino Unido");
		cmbPaises.addItem("Bélgica");
		cmbPaises.addItem("Holanda");

		JLabel lblProvincias = new JLabel("Elige tu provincia:");

		JComboBox<String> cmbProvincias = new JComboBox<>();

		cmbProvincias.addItem("Islas Baleares");
		cmbProvincias.addItem("Alicante");
		cmbProvincias.addItem("Valencia");
		cmbProvincias.addItem("Castellón");
		cmbProvincias.addItem("Tarragona");
		cmbProvincias.addItem("Barcelona");

		add(lblPaises);
		add(cmbPaises);
		
		add(lblProvincias);
		add(cmbProvincias);

		setVisible(true);
	}

	public static void main(String[] args) {
		Ejemplo06 plantilla = new Ejemplo06();
	}

}
