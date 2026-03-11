package hoja4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ejer04 extends JFrame implements ChangeListener {

	private JSlider sldRojo;
	private JSlider sldVerde;
	private JSlider sldAzul;
	private JButton btnColor;
	private JTextField txtValorHexa;

	public Ejer04() {
		super("Paleta");
		setSize(225, 350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.CENTER));

		setLocationRelativeTo(null);

		//

		sldRojo = new JSlider(0, 255, 0);
		sldRojo.setMajorTickSpacing(50);
		sldRojo.setMinorTickSpacing(25);
		sldRojo.setPaintTicks(true);
		sldRojo.setPaintLabels(true);
		sldRojo.addChangeListener(this);

		sldVerde = new JSlider(0, 255, 0);
		sldVerde.setMajorTickSpacing(50);
		sldVerde.setMinorTickSpacing(25);
		sldVerde.setPaintTicks(true);
		sldVerde.setPaintLabels(true);
		sldVerde.addChangeListener(this);

		sldAzul = new JSlider(0, 255, 0);
		sldAzul.setMajorTickSpacing(50);
		sldAzul.setMinorTickSpacing(25);
		sldAzul.setPaintTicks(true);
		sldAzul.setPaintLabels(true);
		sldAzul.addChangeListener(this);

		btnColor = new JButton();
		btnColor.setPreferredSize(new Dimension(75, 25));
		btnColor.setBackground(new Color(0, 0, 0));

		txtValorHexa = new JTextField("#000000", 5);

		add(new JLabel("Rojo"));
		add(sldRojo);
		add(new JLabel("Verde"));
		add(sldVerde);
		add(new JLabel("Azul"));
		add(sldAzul);
		add(btnColor);
		add(txtValorHexa);

		//
		setVisible(true);

	}

	public static void main(String[] args) {
		Ejer04 ventana = new Ejer04();

	}

	@Override
	public void stateChanged(ChangeEvent e) {

		int rojo = sldRojo.getValue();
		int verde = sldVerde.getValue();
		int azul = sldAzul.getValue();

		btnColor.setBackground(new Color(rojo, verde, azul));
		txtValorHexa.setText(hexadecimal(rojo, verde, azul));

	}

	private String hexadecimal(int rojo, int verde, int azul) {

		String hexRojo = Integer.toHexString(rojo).toUpperCase();
		String hexVerde = Integer.toHexString(verde).toUpperCase();
		String hexAzul = Integer.toHexString(azul).toUpperCase();

		// Añadimos un 0 a cada componente de color cuando haga falta.
		if (rojo < 16) {
			hexRojo = "0" + hexRojo;
		}

		if (verde < 16) {
			hexVerde = "0" + hexVerde;
		}

		if (azul < 16) {
			hexAzul = "0" + hexAzul;
		}

		return "#" + hexRojo + hexVerde + hexAzul;
	}

}