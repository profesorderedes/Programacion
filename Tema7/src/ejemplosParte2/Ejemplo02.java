package ejemplosParte2;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo02 extends JFrame {

	public Ejemplo02() {

		super("GridLayout");
		setSize(450, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new GridLayout(3, 3, 5, 5));

		setLocationRelativeTo(null);

		JLabel lblImagen1 = new JLabel(new ImageIcon("hamsters/hamster01.png"));
		JLabel lblImagen2 = new JLabel(new ImageIcon("hamsters/hamster02.png"));
		JLabel lblImagen3 = new JLabel(new ImageIcon("hamsters/hamster03.png"));
		JLabel lblImagen4 = new JLabel(new ImageIcon("hamsters/hamster04.png"));
		JLabel lblImagen5 = new JLabel(new ImageIcon("hamsters/hamster05.png"));
		JLabel lblImagen6 = new JLabel(new ImageIcon("hamsters/hamster06.png"));
		JLabel lblImagen7 = new JLabel(new ImageIcon("hamsters/hamster07.png"));
		JLabel lblImagen8 = new JLabel(new ImageIcon("hamsters/hamster08.png"));
		JLabel lblImagen9 = new JLabel(new ImageIcon("hamsters/hamster09.png"));

		add(lblImagen1);
		add(lblImagen2);
		add(lblImagen3);
		add(lblImagen4);
		add(lblImagen5);
		add(lblImagen6);
		add(lblImagen7);
		add(lblImagen8);
		add(lblImagen9);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo02();
	}

}
