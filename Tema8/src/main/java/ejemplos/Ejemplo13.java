package ejemplos;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class Ejemplo13 extends JFrame {

	public Ejemplo13() {

		super("Editor");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLocationRelativeTo(null);

		setLayout(new BorderLayout());

		// Barra de herramientas.

		JButton btnAbrir = new JButton(new ImageIcon("iconos/52.png"));
		JButton btnGuardar = new JButton(new ImageIcon("iconos/22.png"));

		JToolBar barraHerramientas = new JToolBar();

		barraHerramientas.add(btnAbrir);
		barraHerramientas.add(btnGuardar);

		// Ventana general.

		add(barraHerramientas, BorderLayout.NORTH);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo13();
	}

}
