package actividades4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ejer04 extends JFrame implements ChangeListener{

	private JSlider sldRojo;
	private JSlider sldVerde;
	private JSlider sldAzul;
	private JButton btnColores;

	public Ejer04() {
		super("Paleta");
		setSize(220, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		JLabel lblRojo = new JLabel("Rojo");
		sldRojo = new JSlider(JSlider.HORIZONTAL, 0, 255, 250);
		sldRojo.setMajorTickSpacing(50);
		sldRojo.setMinorTickSpacing(25);
		sldRojo.setPaintTicks(true);
		sldRojo.setPaintLabels(true);
		sldRojo.addChangeListener(this);

		JLabel lblVerde = new JLabel("Verde");
		sldVerde = new JSlider(JSlider.HORIZONTAL, 0, 255, 200);
		sldVerde.setMajorTickSpacing(50);
		sldVerde.setMinorTickSpacing(25);
		sldVerde.setPaintTicks(true);
		sldVerde.setPaintLabels(true);
		sldVerde.addChangeListener(this);

		JLabel lblAzul = new JLabel("Azul");
		sldAzul = new JSlider(JSlider.HORIZONTAL, 0, 255, 51);
		sldAzul.setMajorTickSpacing(50);
		sldAzul.setMinorTickSpacing(25);
		sldAzul.setPaintTicks(true);
		sldAzul.setPaintLabels(true);
		sldAzul.addChangeListener(this);

		btnColores = new JButton();
		btnColores.setPreferredSize(new Dimension(100, 25));
		btnColores.setBackground(new Color(sldRojo.getValue(), sldVerde.getValue(), sldAzul.getValue()));

		JTextField txtColores = new JTextField("#FFC833", 7);

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

	@Override
	public void stateChanged(ChangeEvent e) {
		
		int rojo = sldRojo.getValue();
		int verde = sldVerde.getValue();
		int azul = sldAzul.getValue();
		
		btnColores.setBackground(new Color(rojo, verde, azul));
		
	}
}



