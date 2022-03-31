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

public class Ejer04 extends JFrame {

	public Ejer04() {

		super("Suscripción");
		setSize(250, 325);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JLabel lblNombre = new JLabel("Nombre");
		JTextField txtNombre = new JTextField(20);

		JLabel lblEmail = new JLabel("Email");
		JTextField txtEmail = new JTextField(20);

		JLabel lblTituloCaja = new JLabel("Motivo por el que te suscribes");
		
		JTextArea txtCaja = new JTextArea();
		JScrollPane scroll = new JScrollPane(txtCaja);
		scroll.setPreferredSize(new Dimension(220, 100));

		JCheckBox chkCasillaInfo = new JCheckBox("Recibir información por correo", true);

		JButton btnEnviar = new JButton("Enviar");

		add(lblNombre);
		add(txtNombre);
		add(lblEmail);
		add(txtEmail);
		add(lblTituloCaja);
		add(scroll);
		add(chkCasillaInfo);
		add(btnEnviar);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejer04();

	}

}