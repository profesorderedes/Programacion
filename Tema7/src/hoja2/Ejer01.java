package hoja2;

import javax.swing.JFrame;
import javax.swing.JSlider;

public class Ejer01 extends JFrame {

	public Ejer01() {

		super("Velocidad de crucero");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);

		JSlider sldVelocidad = new JSlider(10, 120, 90);

		sldVelocidad.setPaintLabels(true);
		sldVelocidad.setPaintTicks(true);
		sldVelocidad.setMajorTickSpacing(20);
		sldVelocidad.setMinorTickSpacing(5);

		add(sldVelocidad);

		setVisible(true);

	}

	public static void main(String[] args) {

		Ejer01 ventana = new Ejer01();

	}

}