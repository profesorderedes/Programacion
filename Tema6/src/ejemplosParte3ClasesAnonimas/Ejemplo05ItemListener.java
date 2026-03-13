package ejemplosParte3ClasesAnonimas;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo05ItemListener extends JFrame implements ItemListener {

	private JComboBox<String> cmbProvincias;
	private JLabel lblProvincia;

	public Ejemplo05ItemListener() {

		super("Provincias");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setLocationRelativeTo(null);

		String[] provincias = { "Baleares", "Alicante", "Murcia", "Jaén", "Albacete" };

		cmbProvincias = new JComboBox<String>(provincias);
		cmbProvincias.addItemListener(this);

		lblProvincia = new JLabel("Seleccionada: Baleares");

		add(cmbProvincias);
		add(lblProvincia);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo05ItemListener();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {

		String provincia = (String) cmbProvincias.getSelectedItem();

		// Forma alternativa:
		// String provincia = provincias[cmbProvincias.getSelectedIndex()];

		lblProvincia.setText("Seleccionada: " + provincia);
		System.out.println("ItemListener");

	}

}
