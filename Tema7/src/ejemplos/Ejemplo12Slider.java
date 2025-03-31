package ejemplos;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class Ejemplo12Slider extends JFrame {

	public Ejemplo12Slider() {

		super("Espacio de disco");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		JLabel lblEspacio = new JLabel("Elija el espacio del disco duro (en GB):");

		JSlider sldEspacio = new JSlider(JSlider.HORIZONTAL, 5, 50, 25);
		sldEspacio.setPreferredSize(new Dimension(390, 40));

		sldEspacio.setPaintTicks(true);
		sldEspacio.setPaintLabels(true);
		sldEspacio.setMinorTickSpacing(1);
		sldEspacio.setMajorTickSpacing(5);

		add(lblEspacio);
		add(sldEspacio);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo12Slider();
	}

}
