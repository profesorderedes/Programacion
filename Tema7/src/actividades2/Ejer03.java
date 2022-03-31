package actividades2;

import javax.swing.*;
import java.awt.*;

public class Ejer03 extends JFrame {

	public Ejer03() {

		super("Comentarios");
		setSize(300, 185);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JLabel lblComentario = new JLabel("Deja un comentario");

		JTextArea txtComentario = new JTextArea("En un lugar de La Mancha, de cuyo nombre no " + "quiero acordarme");

		JScrollPane panelComentario = new JScrollPane(txtComentario);
		panelComentario.setPreferredSize(new Dimension(290, 80));

		JButton btnEnviar = new JButton("Enviar");

		add(lblComentario);
		add(panelComentario);
		add(btnEnviar);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejer03();
	}

}