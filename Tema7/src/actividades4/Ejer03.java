package actividades4;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejer03 extends JFrame implements ItemListener {

	private JCheckBox chkBilletes;
	private JCheckBox chkTransporte;
	private JCheckBox chkEstancia;
	private JCheckBox chkPension;
	private JLabel lblPrecio;

	public Ejer03() {

		super("Escribir título");
		setSize(190, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setLocationRelativeTo(null);

		JLabel lblOpciones = new JLabel("Opciones:");

		chkBilletes = new JCheckBox("Billetes de avión", true);
		chkBilletes.addItemListener(this);
		chkTransporte = new JCheckBox("Transporte aeropuerto");
		chkTransporte.addItemListener(this);
		chkEstancia = new JCheckBox("Estancia en el hotel");
		chkEstancia.addItemListener(this);
		chkPension = new JCheckBox("Pensión completa");
		chkPension.addItemListener(this);

		lblPrecio = new JLabel("Precio total: 120 €");

		add(lblOpciones);
		add(chkBilletes);
		add(chkTransporte);
		add(chkEstancia);
		add(chkPension);
		add(lblPrecio);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejer03();
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {

		int total = 0;

		if (chkBilletes.isSelected()) {
			total = total + 120;
		}

		if (chkTransporte.isSelected()) {
			total = total + 40;
		}

		if (chkEstancia.isSelected()) {
			total = total + 180;
		}

		if (chkPension.isSelected()) {
			total = total + 70;
		}

		lblPrecio.setText("Precio total: " + total + " €");

	}

}
