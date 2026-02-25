package ejemplosParte1;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Ejemplo18Menus extends JFrame {

	public Ejemplo18Menus() {

		super("Menús");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		setLayout(layout);

		try {

			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			System.out.println("Error al cambiar el lookandfeel.");
		}

		setLocationRelativeTo(null);

		// Menú Archivo.

		JMenu menuArchivo = new JMenu("Archivo");

		JMenuItem itemNuevo = new JMenuItem("Nuevo");
		JMenuItem itemAbrir = new JMenuItem("Abrir");
		JMenuItem itemCerrar = new JMenuItem("Cerrar");
		JMenuItem itemGuardar = new JMenuItem("Guardar");

		menuArchivo.add(itemNuevo);
		menuArchivo.add(itemAbrir);
		menuArchivo.add(itemCerrar);
		menuArchivo.addSeparator();
		menuArchivo.add(itemGuardar);

		// Menú Edición.

		JMenu menuEdicion = new JMenu("Edición");

		JMenuItem itemCortar = new JMenuItem("Cortar");
		JMenuItem itemCopiar = new JMenuItem("Copiar");
		JMenuItem itemPegar = new JMenuItem("Pegar");
		JMenuItem itemBorrar = new JMenuItem("Borrar");

		// Podemos añadir un submenú al menú Edición
		
		JMenu submenuExpandSelectionTo = new JMenu("Expand selection to");
		JMenuItem itemEnclosingElement = new JMenuItem("Enclosing element");
		JMenuItem itemNextElement = new JMenuItem("Next element");

		submenuExpandSelectionTo.add(itemEnclosingElement);
		submenuExpandSelectionTo.add(itemNextElement);

		menuEdicion.add(itemCortar);
		menuEdicion.add(itemCopiar);
		menuEdicion.add(itemPegar);
		menuEdicion.addSeparator();
		menuEdicion.add(itemBorrar);
		menuEdicion.add(submenuExpandSelectionTo);

		// Barra de menú.

		JMenuBar barraMenu = new JMenuBar();

		barraMenu.add(menuArchivo);
		barraMenu.add(menuEdicion);

		// Ventana

		setJMenuBar(barraMenu);

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo18Menus plantilla = new Ejemplo18Menus();
	}

}
