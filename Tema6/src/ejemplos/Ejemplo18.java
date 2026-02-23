package ejemplos;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Ejemplo18 extends JFrame {

	public Ejemplo18() {

		super("Menús");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		setLayout(layout);

		setLocationRelativeTo(null);
		
		// Menú Archivo.
		
		JMenu menuArchivo = new JMenu("Archivo");
		
		JMenuItem itemNuevo = new JMenuItem("Nuevo");
		JMenuItem itemAbrir= new JMenuItem("Abrir");
		JMenuItem itemCerrar = new JMenuItem("Cerrar");
		
		menuArchivo.add(itemNuevo);
		menuArchivo.add(itemAbrir);
		menuArchivo.add(itemCerrar);
		
		// Menú Edición.
		
		
		
		// Barra de menú.
		
		JMenuBar barraMenu = new JMenuBar();
		
		barraMenu.add(menuArchivo);
		
		// Ventana
		
		setJMenuBar(barraMenu);
		

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo18 plantilla = new Ejemplo18();
	}

}
