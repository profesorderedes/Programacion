package actividades4;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class Ejer04 extends JFrame {

	public Ejer04() {
		super("Escribir título");
		setSize(220, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		JLabel lblRojo = new JLabel("Rojo");
		JSlider sldRojo = new JSlider(JSlider.HORIZONTAL, 0, 255, 250);
		sldRojo.setMajorTickSpacing(50);
		sldRojo.setMinorTickSpacing(25);
		sldRojo.setPaintTicks(true);
		sldRojo.setPaintLabels(true);

		JLabel lblVerde = new JLabel("Verde");
		JSlider sldVerde = new JSlider(JSlider.HORIZONTAL, 0, 255, 250);
		sldVerde.setMajorTickSpacing(50);
		sldVerde.setMinorTickSpacing(25);
		sldVerde.setPaintTicks(true);
		sldVerde.setPaintLabels(true);

		JLabel lblAzul = new JLabel("Azul");
		JSlider sldAzul = new JSlider(JSlider.HORIZONTAL, 0, 255, 250);
		sldAzul.setMajorTickSpacing(50);
		sldAzul.setMinorTickSpacing(25);
		sldAzul.setPaintTicks(true);
		sldAzul.setPaintLabels(true);

		JButton btnColores = new JButton();
		btnColores.setPreferredSize(new Dimension(100, 25));
		JTextField txtColores = new JTextField(7);

		add(lblRojo);
		add(sldRojo);
		add(lblVerde);
		add(sldVerde);
		add(lblAzul);
		add(sldAzul);
		add(btnColores);
		add(txtColores);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejer04();
	}
}