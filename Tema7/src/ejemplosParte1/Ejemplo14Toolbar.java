package ejemplosParte1;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class Ejemplo14Toolbar extends JFrame {

	public Ejemplo14Toolbar() {

		super("Barra de herramientas");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		setLocationRelativeTo(null);

		// Buscamos los iconos de la barra de herramientas.

		ImageIcon iconoNuevo = new ImageIcon("iconos/2.png");
		ImageIcon iconoAbrir = new ImageIcon("iconos/52.png");
		ImageIcon iconoGuardar = new ImageIcon("iconos/22.png");
		ImageIcon iconoImprimir = new ImageIcon("iconos/16.png");
		ImageIcon iconoPrevisualizar = new ImageIcon("iconos/87.png");

		// Creamos los botones con estos iconos.

		JButton btnNuevo = new JButton(iconoNuevo);
		JButton btnAbrir = new JButton(iconoAbrir);
		JButton btnGuardar = new JButton(iconoGuardar);
		JButton btnImprimir = new JButton(iconoImprimir);
		JButton btnPrevisualizar = new JButton(iconoPrevisualizar);

		// Creamos la barra de herramientas y le añadimos los botones.

		JToolBar barraHerramientas = new JToolBar();

		barraHerramientas.add(btnNuevo);
		barraHerramientas.addSeparator();
		barraHerramientas.add(btnAbrir);
		barraHerramientas.add(btnGuardar);
		barraHerramientas.addSeparator();
		barraHerramientas.add(btnImprimir);
		barraHerramientas.add(btnPrevisualizar);

		// Añadir la barra a la ventana.

		add(barraHerramientas, BorderLayout.NORTH);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo14Toolbar();
	}

}
