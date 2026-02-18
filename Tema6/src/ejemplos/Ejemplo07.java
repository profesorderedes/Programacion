package ejemplos;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Ejemplo07 extends JFrame {

	public Ejemplo07() {
		super("Comentarios");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		setLayout(layout);

		JLabel lblComentario = new JLabel("Deja tu comentario:");

		JTextArea txtComentario = new JTextArea(10,20);

		add(lblComentario);
		add(txtComentario);

		setVisible(true);
	}

	public static void main(String[] args) {
		Ejemplo07 plantilla = new Ejemplo07();
	}

}
