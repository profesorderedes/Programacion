package hoja2;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ejer03 extends JFrame {

	public Ejer03() {

		super("Comentarios");
		setSize(300, 275);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
		setLayout(layout);

		setLocationRelativeTo(null);

		JTextArea txtComentario = new JTextArea();
		txtComentario.setLineWrap(true);
		txtComentario.setWrapStyleWord(true);

		JScrollPane scrComentario = new JScrollPane(txtComentario);
		scrComentario.setPreferredSize(new Dimension(250, 100));

		JButton btnEnviar = new JButton("Enviar");

		add(new JLabel("Deja un comentario"));
		add(scrComentario);
		add(btnEnviar);

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejer03 ventana = new Ejer03();
	}
}