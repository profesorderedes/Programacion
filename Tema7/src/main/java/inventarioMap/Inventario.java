package inventarioMap;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;

public class Inventario extends JFrame {

	private Map<String, Double> articulos = new HashMap<>();
	private DefaultListModel<String> modelo;
	private JList<String> inventario;

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

		// Para tener los ejemplos del pdf pongo estos

		articulos.put("Monitor ASUS 17\"", 150.0);
		articulos.put("HP con procesador i7", 600.0);
		articulos.put("HP con procesador i5", 500.0);
		articulos.put("HP con procesador i3", 400.0);

		modelo = new DefaultListModel<>();

		for (Map.Entry<String, Double> entrada : articulos.entrySet()) {
			modelo.addElement(entrada.getKey() + " (" + entrada.getValue() + " €)");
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

			articulos.put(nombre, precio);
			modelo.addElement(nombre + " (" + precio + " €)");
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "No has escrito un precio válido", "Inventario",
					JOptionPane.ERROR_MESSAGE);
			return;
		}

	}

	private void eliminarArticulo() {

		int indice = inventario.getSelectedIndex();

		if (indice == -1) {
			return;
		}

		String itemSeleccionado = modelo.get(indice);
		String nombre = itemSeleccionado.substring(0, itemSeleccionado.lastIndexOf(" ("));

		int respuesta = JOptionPane.showConfirmDialog(null,
				"Va a eliminar el artículo " + itemSeleccionado + ". ¿Está seguro?", "Inventario",
				JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

		if (respuesta != JOptionPane.YES_OPTION) {
			return;
		}

		modelo.remove(indice);
		articulos.remove(nombre);

	}

	private void buscar() {

		String nombreArticulo = JOptionPane.showInputDialog(null, "¿Qué artículo quieres buscar?", "Inventario",
				JOptionPane.QUESTION_MESSAGE);

		if (nombreArticulo == null || nombreArticulo.trim().equals("")) {
			return;
		}

		if (articulos.containsKey(nombreArticulo)) {
			JOptionPane.showMessageDialog(null, "El artículo forma parte del inventario.", "Inventario",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "El artículo no se encuentra.", "Inventario",
					JOptionPane.INFORMATION_MESSAGE);
		}

	}

	private void calcularTotal() {

		JOptionPane.showMessageDialog(null, "Hay " + articulos.size() + " artículos almacenados.", "Inventario",
				JOptionPane.INFORMATION_MESSAGE);

	}

	private void borrarTodo() {

		int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro de querer borrar todo el inventario?",
				"Inventario", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

		if (respuesta != JOptionPane.YES_OPTION) {
			return;
		}

		articulos.clear();
		modelo.removeAllElements();

		JOptionPane.showMessageDialog(null, "Se ha borrado el inventario.", "Inventario",
				JOptionPane.INFORMATION_MESSAGE);

	}

	public static void main(String[] args) {

		new Inventario();

	}

}