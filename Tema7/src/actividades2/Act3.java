package actividades2;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Act3 extends JFrame {

	public Act3() {

		super("Comentarios");
		setSize(350, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		JLabel lbltexto = new JLabel("Deja un comentario");

		JTextArea txtComentarios = new JTextArea("En un lugar de La Mancha de cuyo nombre no quiero acordarme");

		JScrollPane panelTexto = new JScrollPane(txtComentarios);
		panelTexto.setPreferredSize(new Dimension(290, 200));

		JButton btnEnviar = new JButton("Enviar");

		add(lbltexto);
		add(panelTexto);
		add(btnEnviar);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Act3();

	}

}