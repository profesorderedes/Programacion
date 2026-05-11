package inventario2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

public class Inventario extends JFrame {

	private final File ARCHIVO = new File("inventario.txt");

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

		addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {

			}

			@Override
			public void windowIconified(WindowEvent e) {

			}

			@Override
			public void windowDeiconified(WindowEvent e) {

			}

			@Override
			public void windowDeactivated(WindowEvent e) {

			}

			@Override
			public void windowClosing(WindowEvent e) {

				try {
					AccesoDiscoTexto.guardarInventario(articulos, ARCHIVO);
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null, "Error al guardar en el archivo de inventario", "Inventario",
							JOptionPane.ERROR_MESSAGE);
				}

			}

			@Override
			public void windowClosed(WindowEvent e) {

			}

			@Override
			public void windowActivated(WindowEvent e) {

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

		try {
			articulos = AccesoDiscoTexto.leerInventario(ARCHIVO);

			for (Articulo articulo : articulos) {
				modelo.addElement(articulo);
			}
		} catch (IOException | NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Error al leer el archivo de inventario", "Inventario",
					JOptionPane.ERROR_MESSAGE);
			System.exit(0);
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

		JOptionPane.showMessageDialog(null, "Se ha borrado el inventario.", "Inventario",
				JOptionPane.INFORMATION_MESSAGE);

	}

	public static void main(String[] args) {

		new Inventario();

	}

}
