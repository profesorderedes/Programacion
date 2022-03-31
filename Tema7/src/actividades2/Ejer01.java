package actividades2;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JSlider;

public class Ejer01 extends JFrame {

	public Ejer01() {

		super("Velocidad de crucero");
		setSize(310, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JSlider jslVelocidad = new JSlider(JSlider.HORIZONTAL, 
				10, 120, 90);

		jslVelocidad.setPaintLabels(true);
		jslVelocidad.setPaintTicks(true);
		jslVelocidad.setMinorTickSpacing(5);
		jslVelocidad.setMajorTickSpacing(20);
		
		jslVelocidad.setPreferredSize(new Dimension(300,50));
		
		add(jslVelocidad);

		setVisible(true);

	}

	public static void main(String[] args) {

		Ejer01 ejer1 = new Ejer01();

	}

}