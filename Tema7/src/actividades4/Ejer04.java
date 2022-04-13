package actividades4;

import javax.swing.*;
import java.awt.*;

public class Ejer04 extends JFrame {

	private JLabel lblRojo, lblVerde, lblAzul;
	private JSlider sldRojo, sldVerde, sldAzul;
	private JButton btnColor;
	private JTextArea txtColor;

	public static void main(String[] args) {

		new Ejer04();
	}

	public Ejer04() {

		super("Paleta");
		setSize(225, 330);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		lblRojo = new JLabel("Rojo");
		sldRojo = new JSlider(JSlider.HORIZONTAL, 0, 255, 255);
		sldRojo.setMajorTickSpacing(50);
		sldRojo.setMinorTickSpacing(25);
		sldRojo.setPaintTicks(true);
		sldRojo.setPaintLabels(true);

		lblVerde = new JLabel("Verde");
		sldVerde = new JSlider(JSlider.HORIZONTAL, 0, 255, 200);
		sldVerde.setMajorTickSpacing(50);
		sldVerde.setMinorTickSpacing(25);
		sldVerde.setPaintTicks(true);
		sldVerde.setPaintLabels(true);

		lblAzul = new JLabel("Azul");
		sldAzul = new JSlider(JSlider.HORIZONTAL, 0, 255, 51);
		sldAzul.setMajorTickSpacing(50);
		sldAzul.setMinorTickSpacing(25);
		sldAzul.setPaintTicks(true);
		sldAzul.setPaintLabels(true);

		btnColor = new JButton();
		btnColor.setBackground(null);
		btnColor.setPreferredSize(new Dimension(100, 27));
		btnColor.setBackground(new Color(255, 200, 51));

		txtColor = new JTextArea(1, 7);
		txtColor.setPreferredSize(new Dimension(70, 20));
		txtColor.setText("#FFC833");

		add(lblRojo);
		add(sldRojo);

		add(lblVerde);
		add(sldVerde);

		add(lblAzul);
		add(sldAzul);

		add(btnColor);
		add(txtColor);

		setVisible(true);
	}
}