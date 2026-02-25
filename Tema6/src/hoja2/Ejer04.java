package hoja2;

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
		setSize(260, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
		setLayout(layout);

		setLocationRelativeTo(null);

		JTextField txtNombre = new JTextField(20);
		JTextField txtEmail = new JTextField(20);

		JTextArea txtMotivo = new JTextArea();
		JScrollPane scrMotivo = new JScrollPane(txtMotivo);
		scrMotivo.setPreferredSize(new Dimension(250, 150));

		JCheckBox chkRecibir = new JCheckBox("Recibir información por correo");

		JButton btnEnviar = new JButton("Enviar");

		add(new JLabel("Nombre"));
		add(txtNombre);
		add(new JLabel("Email"));
		add(txtEmail);
		add(new JLabel("Motivo por el que te suscribes"));
		add(scrMotivo);
		add(chkRecibir);
		add(btnEnviar);

		setVisible(true);

	}

	public static void main(String[] args) {

		Ejer04 ventana = new Ejer04();

	}

}