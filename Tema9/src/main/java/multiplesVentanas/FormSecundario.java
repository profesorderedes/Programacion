package multiplesVentanas;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FormSecundario extends JFrame {

	public FormSecundario() {

		super("Ventana secundaria");
		setSize(300, 180);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setLocationRelativeTo(null);

		JTextField txtNombre = new JTextField(25);
		JTextField txtApellidos = new JTextField(25);

		JButton btnAceptar = new JButton("Aceptar");

		add(new JLabel("Nombre:"));
		add(txtNombre);
		add(new JLabel("Apellidos:"));
		add(txtApellidos);
		add(btnAceptar);

		setVisible(true);

	}

	public static void main(String[] args) {
		new FormSecundario();
	}

}
