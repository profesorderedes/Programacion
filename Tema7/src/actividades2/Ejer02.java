package actividades2;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;

public class Ejer02 extends JFrame {

	Ejer02() {
		super("Velocidad de Crucero");
		setSize(100, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JSlider sldTermostato = new JSlider(JSlider.VERTICAL, 0, 25, 17);
		sldTermostato.setPaintTicks(true);
		sldTermostato.setPaintLabels(true);
		sldTermostato.setMinorTickSpacing(1);
		sldTermostato.setMajorTickSpacing(5);

		add(sldTermostato);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejer02();
	}

}