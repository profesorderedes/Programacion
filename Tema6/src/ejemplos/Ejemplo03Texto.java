package ejemplos;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejemplo03Texto extends JFrame {

	public Ejemplo03Texto() {

		super("Etiquetas");
		setSize(200, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		FlowLayout layout = new FlowLayout();
		setLayout(layout);

		JLabel lblCorreo = new JLabel("Correo electrónico");
		JTextField txtCorreo = new JTextField(15);

		add(lblCorreo);
		add(txtCorreo);

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo03Texto ejemplo = new Ejemplo03Texto();
	}

}
