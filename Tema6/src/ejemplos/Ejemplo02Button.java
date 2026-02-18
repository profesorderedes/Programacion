package ejemplos;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo02Button extends JFrame {

	public Ejemplo02Button() {

		super("Playback");
		setSize(350, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		FlowLayout dis = new FlowLayout();
		setLayout(dis);

		JButton btnPlay = new JButton("Play");
		add(btnPlay);

		JButton btnStop = new JButton("Stop");
		add(btnStop);

		JButton btnPausa = new JButton("Pausa");
		add(btnPausa);

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo02Button miVentana = new Ejemplo02Button();

	}

}