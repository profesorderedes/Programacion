package actividades2;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Act4 extends JFrame {

	public Act4() {

		super("Suscripción");
		setSize(280, 380);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		// Hacemos que la ventana se vea centrada
		setLocationRelativeTo(null);

		JLabel lblNombre = new JLabel("Nombre");
		JTextField txtNombre = new JTextField(20);

		JLabel lblApellidos = new JLabel("Apellidos");
		JTextField txtApellidos = new JTextField(20);

		JLabel lblSuscripcion = new JLabel("Motivo por el que te suscribes");
		JTextArea txtSuscripcion = new JTextArea();

		JScrollPane scrSuscripcion = new JScrollPane(txtSuscripcion);
		scrSuscripcion.setPreferredSize(new Dimension(225, 150));

		JCheckBox chbInformacion = new JCheckBox("Recibir información por correo", true);

		JButton btnEnviar = new JButton("Enviar");

		add(lblNombre);
		add(txtNombre);
		add(lblApellidos);
		add(txtApellidos);
		add(lblSuscripcion);
		add(scrSuscripcion);
		add(chbInformacion);
		add(btnEnviar);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Act4();
	}
}