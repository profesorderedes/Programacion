package ejemplos;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ejemplo08Repaso extends JFrame {

	public Ejemplo08Repaso() {
		super("Comentarios");
		setSize(250, 380);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JLabel lblNacimiento = new JLabel("Fecha de nacimiento:");
		JTextField txtNacimiento = new JTextField(22);

		add(lblNacimiento);
		add(txtNacimiento);

		JLabel lblDNI = new JLabel("DNI:");
		JTextField txtDni = new JTextField(22);

		add(lblDNI);
		add(txtDni);

		JCheckBox chkTerminos = new JCheckBox("Acceptar términos y condiciones:");
		JCheckBox chkSpam = new JCheckBox("Acceptar recibir spam", true);

		add(chkTerminos);
		add(chkSpam);

		JLabel lblQuejas = new JLabel("Quejas:");
		JTextArea txtQuejas = new JTextArea();
		txtQuejas.setPreferredSize(new Dimension(220, 180));

		add(lblQuejas);
		add(txtQuejas);

		JButton btnEnviar = new JButton("Enviar");
		JButton btnBorrar = new JButton("Borrar");

		add(btnEnviar);
		add(btnBorrar);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejemplo08Repaso();

	}

}
