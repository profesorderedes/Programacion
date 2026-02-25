package ejemplosParte2;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo01FlowLayout extends JFrame {

	public Ejemplo01FlowLayout() {

		super("Playback");
		setSize(350, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		FlowLayout dis = new FlowLayout(FlowLayout.CENTER, 50, 10);
		setLayout(dis);

		JButton btnPlay = new JButton("Play");
		JButton btnStop = new JButton("Stop");
		JButton btnPausa = new JButton("Pausa");

		add(btnPlay);
		add(btnStop);
		add(btnPausa);
		add(new JButton("Botón 1"));
		add(new JButton("Botón 2"));
		add(new JButton("Botón 3"));
		add(new JButton("Botón 4"));
		add(new JButton("Botón 5"));
		add(new JButton("Botón 6"));
		add(new JButton("Botón 7"));

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo01FlowLayout miVentana = new Ejemplo01FlowLayout();

	}

}