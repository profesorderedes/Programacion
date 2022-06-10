package ejemploEventos;

import javax.swing.*;
import java.awt.*;

public class Ejemplo extends JFrame {

	public Ejemplo() {

		super("Pulsaciones");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		JButton btnPulsame = new JButton("Púlsame!");

		// Creamos un objeto que gestionará los eventos de
		// acción del botón (las pulsaciones).
		Manejador manejador = new Manejador();

		// Asignamos el manejador al botón.
		btnPulsame.addActionListener(manejador);

		add(btnPulsame);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo();
	}

}
