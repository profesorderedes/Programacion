import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejemplo03 extends JFrame {

	public Ejemplo03() {

		super("Dirección web");
		setSize(400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JLabel lblDireccion = new JLabel("Dirección web:");
		JTextField txtDireccion = new JTextField(30);
		JButton btnEnviar = new JButton("Enviar");

		add(lblDireccion);
		add(txtDireccion);
		add(btnEnviar);

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo03 ejemplo = new Ejemplo03();
	}

}
