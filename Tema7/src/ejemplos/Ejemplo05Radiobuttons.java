package ejemplos;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Ejemplo05Radiobuttons extends JFrame {

	public Ejemplo05Radiobuttons() {

		super("Radiobuttons");
		setSize(220, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JLabel lblIdioma = new JLabel("Elige el idioma que te gusta:");

		JRadioButton rdoIngles = new JRadioButton("Inglés", true);
		JRadioButton rdoFrances = new JRadioButton("Francés");
		JRadioButton rdoEspañol = new JRadioButton("Español");

		ButtonGroup cursos = new ButtonGroup();

		cursos.add(rdoIngles);
		cursos.add(rdoFrances);
		cursos.add(rdoEspañol);

		add(lblIdioma);
		add(rdoIngles);
		add(rdoFrances);
		add(rdoEspañol);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejemplo05Radiobuttons();

	}

}