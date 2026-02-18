package ejemplos;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Ejemplo05RadioButton extends JFrame {

	public Ejemplo05RadioButton() {

		super("Estudios");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		setLayout(layout);

		JRadioButton btnEso = new JRadioButton("ESO", true);
		JRadioButton btnBachillerato = new JRadioButton("Bachillerato");
		JRadioButton btnGradoMedio = new JRadioButton("Grado medio");
		JRadioButton btnGradoSuperior = new JRadioButton("Grado superior");

		ButtonGroup estudios = new ButtonGroup();
		estudios.add(btnEso);
		estudios.add(btnBachillerato);
		estudios.add(btnGradoMedio);
		estudios.add(btnGradoSuperior);

		add(btnEso);
		add(btnBachillerato);
		add(btnGradoMedio);
		add(btnGradoSuperior);

		setVisible(true);
	}

	public static void main(String[] args) {
		Ejemplo05RadioButton ventana = new Ejemplo05RadioButton();
	}

}
