package actividades6;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Ejer01 extends JFrame {

	public Ejer01() {
		super("LibreOffice");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		setLayout(new FlowLayout(FlowLayout.LEFT));

		// Menu bar
		JMenuBar barraMenu = new JMenuBar();

		// Menu
		JMenu menuFormato = new JMenu("Formato");
		JMenuItem itemLimpiar = new JMenuItem("Limpiar formato directo");
		itemLimpiar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Limpiando formato directo", "Formato",
						JOptionPane.WARNING_MESSAGE);
				;
			}
		});

		JMenuItem itemCaracter = new JMenuItem("Carácter");
		JMenuItem itemParrafo = new JMenuItem("Párrafo");
		JMenuItem itemNumeracion = new JMenuItem("Numeración y Viñetas");
		JMenuItem itemPagina = new JMenuItem("Página");

		// Add items to menu
		menuFormato.add(itemLimpiar);
		menuFormato.addSeparator();
		menuFormato.add(itemCaracter);
		menuFormato.add(itemParrafo);
		menuFormato.add(itemNumeracion);
		menuFormato.addSeparator();
		menuFormato.add(itemPagina);

		// Add menu to bar
		barraMenu.add(menuFormato);

		// Menu Tabla
		JMenu menuTabla = new JMenu("Tabla");
		JMenuItem itemInsertar = new JMenuItem("Insertar");
		JMenuItem itemEliminar = new JMenuItem("Eliminar");
		JMenuItem itemSeleccionar = new JMenuItem("Seleccionar");
		JMenuItem itemUnir = new JMenuItem("Unir Celdas");

		// Add items to menu
		menuTabla.add(itemInsertar);
		menuTabla.add(itemEliminar);
		menuTabla.add(itemSeleccionar);
		menuTabla.addSeparator();
		menuTabla.add(itemUnir);

		// Ad menu to bar
		barraMenu.add(menuTabla);

		setJMenuBar(barraMenu);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejer01();
	}

}