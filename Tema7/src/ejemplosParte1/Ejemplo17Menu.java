package ejemplosParte1;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Ejemplo17Menu extends JFrame {

	public Ejemplo17Menu() {

		super("Menús");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		// Menú Archivo

		JMenuItem itemAbrir = new JMenuItem("Abrir");
		JMenuItem itemCerrar = new JMenuItem("Cerrar");
		JMenuItem itemGuardar = new JMenuItem("Guardar");
		JMenuItem itemGuardarComo = new JMenuItem("Guardar como");

		JMenu menuArchivo = new JMenu("Archivo");
		menuArchivo.add(itemAbrir);
		menuArchivo.add(itemCerrar);
		menuArchivo.addSeparator();
		menuArchivo.add(itemGuardar);
		menuArchivo.add(itemGuardarComo);

		// Menú Editar

		JMenuItem itemDeshacer = new JMenuItem("Deshacer");
		JMenuItem itemRehacer = new JMenuItem("Rehacer");
		JMenuItem itemCortar = new JMenuItem("Cortar");
		JMenuItem itemCopiar = new JMenuItem("Copiar");
		JMenuItem itemPegar = new JMenuItem("Pegar");

		JMenu menuEditar = new JMenu("Editar");
		menuEditar.add(itemDeshacer);
		menuEditar.add(itemRehacer);
		menuEditar.addSeparator();
		menuEditar.add(itemCortar);
		menuEditar.add(itemCopiar);
		menuEditar.add(itemPegar);

		// Barra de menús

		JMenuBar barraMenu = new JMenuBar();
		barraMenu.add(menuArchivo);
		barraMenu.add(menuEditar);

		// Añadimos a la ventana.

		setJMenuBar(barraMenu);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo17Menu();
	}

}
