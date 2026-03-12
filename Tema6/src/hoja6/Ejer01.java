package hoja6;

import java.awt.FlowLayout;

import javax.swing.JFrame;

import javax.swing.JMenu;

import javax.swing.JMenuBar;

import javax.swing.JMenuItem;

import javax.swing.SwingUtilities;

import javax.swing.UIManager;

import javax.swing.UnsupportedLookAndFeelException;

public class Ejer01 extends JFrame {

	public Ejer01() {

		super("LibreOffice");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		try {

			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(this);

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			System.out.println("Error al cambiar el lookAndFeel");
		}

		setLocationRelativeTo(null);

		// Crear menu Formato

		JMenu menuFormato = new JMenu("Formato");

		JMenuItem itemLimpiarFD = new JMenuItem("Limpiar formato directo");
		JMenuItem itemCaracter = new JMenuItem("Cáracter");
		JMenuItem itemParrafo = new JMenuItem("Párrafo");
		JMenuItem itemNumeracionYVinetas = new JMenuItem("Numeración y viñetas");
		JMenuItem itemPagina = new JMenuItem("Página");

		// Añadir elementos a menuFormato

		menuFormato.add(itemLimpiarFD);
		menuFormato.addSeparator();
		menuFormato.add(itemCaracter);
		menuFormato.add(itemParrafo);
		menuFormato.add(itemNumeracionYVinetas);
		menuFormato.addSeparator();
		menuFormato.add(itemPagina);

		// Crear menu Tabla

		JMenu menuTabla = new JMenu("Tabla");

		JMenuItem itemInsertar = new JMenuItem("Insertar");
		JMenuItem itemEliminar = new JMenuItem("Eliminar");
		JMenuItem itemSeleccionar = new JMenuItem("Seleccionar");
		JMenuItem itemUnirCeldas = new JMenuItem("Unir celdas");

		// Añadir elementos a menuTabla

		menuTabla.add(itemInsertar);
		menuTabla.add(itemEliminar);
		menuTabla.add(itemSeleccionar);
		menuTabla.addSeparator();
		menuTabla.add(itemUnirCeldas);

		// Añadir menus a barra de menu

		JMenuBar menuBar = new JMenuBar();

		menuBar.add(menuFormato);
		menuBar.add(menuTabla);

		setJMenuBar(menuBar);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejer01();
	}

}