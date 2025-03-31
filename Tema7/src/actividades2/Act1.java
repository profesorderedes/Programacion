package actividades2;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;

public class Act1 extends JFrame {

	public Act1() {

		super("Velocidad de crucero");
		setSize(400, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		JSlider sldVelocidad = new JSlider(JSlider.HORIZONTAL, 10, 120, 90);
		sldVelocidad.setPreferredSize(new Dimension(390, 50));
		sldVelocidad.setPaintTicks(true);
		sldVelocidad.setPaintLabels(true);
		sldVelocidad.setMinorTickSpacing(5);
		sldVelocidad.setMajorTickSpacing(20);

		add(sldVelocidad);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Act1();

	}
}