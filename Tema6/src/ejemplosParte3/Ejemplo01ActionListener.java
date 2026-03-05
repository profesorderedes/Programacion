package ejemplosParte3;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ejemplo01ActionListener extends JFrame {

	public Ejemplo01ActionListener() {

		super("ActionListener");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setLocationRelativeTo(null);

		JButton btnPulsar = new JButton("¡Púlsame!");

		// Creamos un objeto que va a ser el manejador de eventos de click
		// para nuestro botón.
		ManejadorClicBoton manejador = new ManejadorClicBoton();

		// Asignamos a nuestro botón un manejador (oyente) de eventos de click.
		btnPulsar.addActionListener(manejador);

		add(btnPulsar);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo01ActionListener();
	}

}
