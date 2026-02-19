package ejemplos;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class Ejemplo12 extends JFrame {

	public Ejemplo12() {
		super("Sliders");
		setSize(400, 320);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		setLayout(layout);

		setLocationRelativeTo(null);

		JLabel lblEdad = new JLabel("Elige tu edad:");

		JSlider sldEdad = new JSlider(JSlider.HORIZONTAL, 0, 120, 25);
		sldEdad.setMajorTickSpacing(10);
		sldEdad.setMinorTickSpacing(5);
		sldEdad.setPaintLabels(true);
		sldEdad.setPaintTicks(true);

		sldEdad.setPreferredSize(new Dimension(350, 40));

		JLabel lblValoracion = new JLabel("Valora la aplicación:");

		JSlider sldValoracion = new JSlider(JSlider.VERTICAL, 0, 10, 5);
		sldValoracion.setMajorTickSpacing(5);
		sldValoracion.setMinorTickSpacing(1);
		sldValoracion.setPaintLabels(true);
		sldValoracion.setPaintTicks(true);

		add(lblEdad);
		add(sldEdad);
		add(lblValoracion);
		add(sldValoracion);

		setVisible(true);
	}

	public static void main(String[] args) {
		Ejemplo12 plantilla = new Ejemplo12();
	}

}
