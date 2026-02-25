package ejemplosParte2;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class Ejemplo02 extends JFrame {

	public Ejemplo02() {

		super("GridLayout");
		setSize(450, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Layout con 2 filas y 2 columnas, con 5px entre celdas.
		setLayout(new GridLayout(2, 2, 5, 5));

		setLocationRelativeTo(null);

		// Panel arriba-izquierda.
		JPanel panel1 = new JPanel();

		panel1.add(new JLabel("Nombre: "));
		panel1.add(new JTextField(10));
		panel1.setBorder(BorderFactory.createLineBorder(Color.RED));

		// Panel arriba-derecha: JSlider (0 a 200)
		JPanel panel2 = new JPanel();

		JSlider sldVolumen = new JSlider(JSlider.HORIZONTAL, 0, 200, 120);
		sldVolumen.setMajorTickSpacing(50);
		sldVolumen.setMinorTickSpacing(25);
		sldVolumen.setPaintLabels(true);
		sldVolumen.setPaintTicks(true);

		panel2.add(sldVolumen);
		panel2.setBorder(BorderFactory.createLineBorder(Color.BLUE));

		add(panel1);
		add(panel2);
		add(new JPanel());
		add(new JPanel());

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo02();
	}

}
