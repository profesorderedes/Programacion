package actividades2;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class Act2 extends JFrame {

	public Act2() {

		super("Termostato");
		setSize(300, 270);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		JLabel lblTemperatura = new JLabel("Temperatura (ºC)");

		JSlider sldBarra = new JSlider(JSlider.VERTICAL, 0, 25, 17);
		sldBarra.setPaintLabels(true);
		sldBarra.setPaintTicks(true);
		sldBarra.setPaintTrack(true);
		sldBarra.setMinorTickSpacing(1);
		sldBarra.setMajorTickSpacing(5);

		add(sldBarra);
		add(lblTemperatura);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Act2();
	}

}