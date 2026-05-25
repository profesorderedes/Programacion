package inventario2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;

public class Inventario extends JFrame {

	private List<Articulo> articulos = new ArrayList<>();
	private DefaultListModel<Articulo> modelo;
	private JList<Articulo> inventario;

	public Inventario() {

		super("Inventario");
		setSize(300, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		setLocationRelativeTo(null);

		JButton btnMas = new JButton(new ImageIcon("iconos/13.png"));
		btnMas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				anyadirArticulo();

			}
		});

		JButton btnMenos = new JButton(new ImageIcon("iconos/14.png"));
		btnMenos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				eliminarArticulo();

			}
		});

		JButton btnLupa = new JButton(new ImageIcon("iconos/84.png"));
		btnLupa.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				buscar();

			}
		});

		JButton btnCalculadora = new JButton(new ImageIcon("iconos/41.png"));
		btnCalculadora.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				calcularTotal();

			}
		});

		JButton btnBorrarTodo = new JButton(new ImageIcon("iconos/31.png"));
		btnBorrarTodo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				borrarTodo();

			}
		});

		JToolBar barra = new JToolBar();

		barra.add(btnMas);
		barra.add(btnMenos);
		barra.addSeparator();
		barra.add(btnLupa);
		barra.add(btnCalculadora);
		barra.add(btnBorrarTodo);

		modelo = new DefaultListModel<>();

		articulos = AccesoDiscoBD.leerInventario();

		if (articulos == null) {
			return;
		}

		for (Articulo articulo : articulos) {
			modelo.addElement(articulo);
		}

		inventario = new JList<>(modelo);

		add(barra, BorderLayout.NORTH);
		add(inventario, BorderLayout.CENTER);

		setVisible(true);

	}

	private void anyadirArticulo() {

		String nombre = JOptionPane.showInputDialog(null, "Introduce el nombre del artículo:", "Alta en el inventario",
				JOptionPane.QUESTION_MESSAGE);

		if (nombre == null || nombre.trim().equals("")) {
			return;
		}

		String precioStr = JOptionPane.showInputDialog(null, "Introduce el precio del artículo:",
				"Alta en el inventario", JOptionPane.QUESTION_MESSAGE);

		if (precioStr == null || precioStr.trim().equals("")) {
			return;
		}

		try {
			double precio = Double.parseDouble(precioStr);

			articulos.add(new Articulo(nombre, precio));
			modelo.addElement(new Articulo(nombre, precio));

			AccesoDiscoBD.nuevoArticulo(new Articulo(nombre, precio));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "No has escrito un precio válido", "Inventario",
					JOptionPane.ERROR_MESSAGE);
			return;
		}

	}

	private void eliminarArticulo() {

		// Si no hay ninguna fila de la lista seleccionada, salimos
		// sin hacer nada.
		int indice = inventario.getSelectedIndex();

		if (indice == -1) {
			return;
		}

		// Avisamos al usuario con un JOptionPane.
		Articulo articulo = modelo.get(indice);

		int respuesta = JOptionPane.showConfirmDialog(null,
				"Va a eliminar el artículo " + articulo.toString() + ". ¿Está seguro?", "Inventario",
				JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

		if (respuesta != JOptionPane.YES_OPTION) {
			return;
		}

		// Borramos el elemento.
		modelo.remove(indice);
		articulos.remove(indice);

		AccesoDiscoBD.borrarArticulo(articulo);

		mostrarArrayList();

	}

	private void mostrarArrayList() {

		for (Articulo art : articulos) {
			System.out.println(art.toString());
		}

	}

	private void buscar() {

		String nombreArticulo = JOptionPane.showInputDialog(null, "¿Qué artículo quieres buscar?", "Inventario",
				JOptionPane.QUESTION_MESSAGE);

		if (nombreArticulo == null || nombreArticulo.trim().equals("")) {
			return;
		}

		String precioArticulo = JOptionPane.showInputDialog(null, "¿Qué precio tiene el artículo?", "Inventario",
				JOptionPane.QUESTION_MESSAGE);

		if (precioArticulo == null || precioArticulo.trim().equals("")) {
			return;
		}

		// Posición en el ArrayList
		int indice = -1;
		try {

			indice = articulos.indexOf(new Articulo(nombreArticulo, Double.parseDouble(precioArticulo)));

		} catch (NumberFormatException e) {

			JOptionPane.showMessageDialog(null, "El precio introducido no es un número.", "Inventario",
					JOptionPane.ERROR_MESSAGE);
			return;

		}

		if (indice == -1) {
			JOptionPane.showMessageDialog(null, "No se ha encontrado el artículo buscado.", "Inventario",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "El artículo está en la posición " + indice + ".", "Inventario",
					JOptionPane.INFORMATION_MESSAGE);
		}

		// Seleccionamos el artículo buscado.
		inventario.setSelectedIndex(indice);

	}

	private void calcularTotal() {

		JOptionPane.showMessageDialog(null, "Hay " + articulos.size() + " artículos almacenados.", "Inventario",
				JOptionPane.INFORMATION_MESSAGE);

	}

	private void borrarTodo() {

		// Pedimos confirmación.
		int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro de querer borrar todo el inventario?",
				"Inventario", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

		if (respuesta != JOptionPane.YES_OPTION) {
			return;
		}

		// Borramos todo.
		articulos.clear();
		modelo.removeAllElements();

		AccesoDiscoBD.clearArticulos();

		JOptionPane.showMessageDialog(null, "Se ha borrado el inventario.", "Inventario",
				JOptionPane.INFORMATION_MESSAGE);

	}

	public static void main(String[] args) {

		new Inventario();

	}

}
