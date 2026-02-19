package hoja2;

import java.awt.Dimension;

import java.awt.FlowLayout;

import javax.swing.JFrame;

import javax.swing.JSlider;

public class Ejer01 extends JFrame {

	public Ejer01() {

		super("Velocidad de crucero");
		setSize(370, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		setLayout(layout);

		setLocationRelativeTo(null);

		JSlider sldVelocidad = new JSlider(JSlider.HORIZONTAL, 10, 120, 90);
		sldVelocidad.setMajorTickSpacing(20);
		sldVelocidad.setMinorTickSpacing(5);
		sldVelocidad.setPaintLabels(true);
		sldVelocidad.setPaintTicks(true);
		sldVelocidad.setPreferredSize(new Dimension(350, 40));

		add(sldVelocidad);

		setVisible(true);

	}

	public static void main(String[] args) {

		Ejer01 plantilla = new Ejer01();

	}

}