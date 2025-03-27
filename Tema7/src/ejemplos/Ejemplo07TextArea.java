package ejemplos;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ejemplo07TextArea extends JFrame {

	public Ejemplo07TextArea() {

		super("Comentarios");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JLabel lblComentarios = new JLabel("Escriba su comentario:");
		JTextArea txtComentarios = new JTextArea();

		// Investigar cómo hacer que al llegar al final de una línea,
		// el cursor salte a la siguiente línea. Y que al saltar a la
		// siguiente línea no deje palabras cortadas.
		JScrollPane panelComentarios = new JScrollPane(txtComentarios);
		panelComentarios.setPreferredSize(new Dimension(350, 200));

		add(lblComentarios);
		add(panelComentarios);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo07TextArea();
	}

}
