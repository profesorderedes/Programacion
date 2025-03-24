package ejemplos;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ejemplo02Botones extends JFrame {

	public Ejemplo02Botones() {

		super("Reproductor");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Layout: objeto que se le asigna a la ventana
		// y que regula cómo se ve el contenido de la misma.
		setLayout(new FlowLayout());

		JButton botonPlay = new JButton("Play");
		JButton botonPause = new JButton("Pause");
		JButton botonStop = new JButton("Stop");

		add(botonPlay);
		add(botonPause);
		add(botonStop);

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo02Botones ventana = new Ejemplo02Botones();
	}

}
