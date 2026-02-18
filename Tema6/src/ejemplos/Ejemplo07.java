package ejemplos;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ejemplo07 extends JFrame {

	public Ejemplo07() {
		super("Comentarios");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		setLayout(layout);

		JLabel lblComentario = new JLabel("Deja tu comentario:");

		JTextArea txtComentario = new JTextArea();
		txtComentario.setLineWrap(true);
		txtComentario.setWrapStyleWord(true);

		JScrollPane scrComentario = new JScrollPane(txtComentario);

		scrComentario.setPreferredSize(new Dimension(390, 220));
		
		add(lblComentario);
		add(scrComentario);

		setVisible(true);
	}

	public static void main(String[] args) {
		Ejemplo07 plantilla = new Ejemplo07();
	}

}
