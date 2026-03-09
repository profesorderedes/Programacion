package hoja4;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ejer03 extends JFrame implements ItemListener {

	private JCheckBox chkBilletesAvion;
	private JCheckBox chkTransporteAeropuerto;
	private JCheckBox chkEstanciaHotel;
	private JCheckBox chkPensionCompleta;

	private JLabel lblTotal = new JLabel("Precio total: 0 €");

	public Ejer03() {
		super("Viajes Gorrión");
		setSize(250, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setLocationRelativeTo(null);

		//

		chkBilletesAvion = new JCheckBox("Billetes de avión");
		chkTransporteAeropuerto = new JCheckBox("Transporte aeropuerto");
		chkEstanciaHotel = new JCheckBox("Estancia en el hotel");
		chkPensionCompleta = new JCheckBox("Pensión completa");

		chkBilletesAvion.addItemListener(this);
		chkTransporteAeropuerto.addItemListener(this);
		chkEstanciaHotel.addItemListener(this);
		chkPensionCompleta.addItemListener(this);

		JPanel checkBoxPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		checkBoxPanel.setPreferredSize(new Dimension(250, 120));

		checkBoxPanel.add(chkBilletesAvion);
		checkBoxPanel.add(chkTransporteAeropuerto);
		checkBoxPanel.add(chkEstanciaHotel);
		checkBoxPanel.add(chkPensionCompleta);

		add(new JLabel("Opciones:"));
		add(checkBoxPanel);
		add(lblTotal);

		//
		setVisible(true);

	}

	public static void main(String[] args) {
		Ejer03 ventana = new Ejer03();

	}

	@Override
	public void itemStateChanged(ItemEvent e) {

		int total = 0;

		if (chkBilletesAvion.isSelected()) {
			total += 120;
		}

		if (chkTransporteAeropuerto.isSelected()) {
			total += 40;
		}

		if (chkEstanciaHotel.isSelected()) {
			total += 180;
		}

		if (chkPensionCompleta.isSelected()) {
			total += 70;
		}

		lblTotal.setText("Precio total: " + total + " €");

	}
}
