package ejemplosParte3;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ejemplo05FocusListener extends JFrame implements FocusListener {

	private JTextField txtUsuario;
	private JPasswordField txtPassword;

	public Ejemplo05FocusListener() {

		super("Eventos de foco");
		setSize(250, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setLocationRelativeTo(null);

		JLabel lblUsuario = new JLabel("Usuario");
		txtUsuario = new JTextField(20);
		txtUsuario.addFocusListener(this);

		JLabel lblPassword = new JLabel("Contraseña");
		txtPassword = new JPasswordField(20);
		txtPassword.addFocusListener(this);

		JButton btnEnviar = new JButton("Enviar");

		add(lblUsuario);
		add(txtUsuario);
		add(lblPassword);
		add(txtPassword);
		add(btnEnviar);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo05FocusListener();
	}

	@Override
	public void focusGained(FocusEvent e) {

		JTextField casilla = (JTextField) e.getSource();

		if (casilla == txtUsuario) {
			txtUsuario.setBackground(Color.YELLOW);
		} else if (casilla == txtPassword) {
			txtPassword.setBackground(Color.YELLOW);
		}

	}

	@Override
	public void focusLost(FocusEvent e) {

		JTextField casilla = (JTextField) e.getSource();

		if (casilla == txtUsuario) {
			txtUsuario.setBackground(Color.WHITE);
		} else if (casilla == txtPassword) {
			txtPassword.setBackground(Color.WHITE);
		}

	}

}
