package ejemplos;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ejemplo08Repaso extends JFrame {

	public Ejemplo08Repaso() {

		super("Comentarios");
		setSize(250, 420);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JLabel lblNacimiento = new JLabel("Fecha de nacimiento:");
		JTextField txtNacimiento = new JTextField(22);

		JLabel lblDNI = new JLabel("DNI:");
		JTextField txtDni = new JTextField(22);

		JCheckBox chkTerminos = new JCheckBox("Aceptar términos y condiciones:");
		JCheckBox chkSpam = new JCheckBox("Aceptar recibir spam", true);

		JLabel lblQuejas = new JLabel("Quejas:");
		JTextArea txtQuejas = new JTextArea();
		JScrollPane panelQuejas = new JScrollPane(txtQuejas);

		panelQuejas.setPreferredSize(new Dimension(220, 180));

		JButton btnEnviar = new JButton("Enviar");
		JButton btnBorrar = new JButton("Borrar");

		add(lblNacimiento);
		add(txtNacimiento);

		add(lblDNI);
		add(txtDni);

		add(chkTerminos);
		add(chkSpam);

		add(lblQuejas);
		add(panelQuejas);

		add(btnEnviar);
		add(btnBorrar);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejemplo08Repaso();

	}

}
