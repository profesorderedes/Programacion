package actividades4;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class Ejer03 extends JFrame {

	private JLabel lblOpciones, lblTotal;
	private JCheckBox chkAviones, chkAeropuerto, chkHotel, chkPension;
	private float total = 0;
	
	public static void main(String[] args) {

		new Ejer03();
	}

	public Ejer03() {

		super("Viajes Gorrión");
		setSize(200, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		lblOpciones = new JLabel("Opciones:");

		chkAviones = new JCheckBox("Billetes de avión");
		chkAeropuerto = new JCheckBox("Transporte aeropuerto");
		chkHotel = new JCheckBox("Estancia en el hotel");
		chkPension = new JCheckBox("Pensión completa");

		lblTotal = new JLabel("Precio total: 0 €");
		
		

		chkAviones.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				
				if(chkAviones.isSelected()) {
					total = total + 120;
				}else {
					total = total - 120;
				}
				lblTotal.setText("Precio total: " + total + " €");
			}
		});

		chkAeropuerto.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {

				if(chkAeropuerto.isSelected()) {
					total = total + 40;
				}else {
					total = total - 40;
				}
				lblTotal.setText("Precio total: " + total + " €");
			}
		});

		chkHotel.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {

				if(chkHotel.isSelected()) {
					total = total + 180;
				}else {
					total = total - 180;
				}
				lblTotal.setText("Precio total: " + total + " €");
			}
		});

		chkPension.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {

				if(chkPension.isSelected()) {
					total = total + 70;
				}else {
					total = total - 70;
				}
				lblTotal.setText("Precio total: " + total + " €");
			}
		});

		add(lblOpciones);
		add(chkAviones);
		add(chkAeropuerto);
		add(chkHotel);
		add(chkPension);
		add(lblTotal);

		setVisible(true);

	}

}