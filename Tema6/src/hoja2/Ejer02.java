package hoja2;

import java.awt.Dimension;

import java.awt.FlowLayout;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JSlider;

public class Ejer02 extends JFrame {

	public Ejer02() {

		super("Termostato");
		setSize(250, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		setLayout(layout);

		setLocationRelativeTo(null);

		JLabel lblTermostato = new JLabel("Temperatura (ºC)");

		JSlider sldTermostato = new JSlider(JSlider.VERTICAL, 0, 25, 17);
		sldTermostato.setMajorTickSpacing(5);
		sldTermostato.setMinorTickSpacing(1);
		sldTermostato.setPaintLabels(true);
		sldTermostato.setPaintTicks(true);
		sldTermostato.setPreferredSize(new Dimension(50, 200));

		add(sldTermostato);
		add(lblTermostato);

		setVisible(true);

	}

	public static void main(String[] args) {

		Ejer02 plantilla = new Ejer02();

	}

}