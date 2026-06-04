package forms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

import auxiliar.TituloEstreno;
import auxiliar.TituloLanzamiento;
import db.Database;
import net.miginfocom.swing.MigLayout;

public class FormPrincipal extends JFrame {

	private Database bd;
	private JTable table;
	private JLabel lblDescripcion;

	public FormPrincipal() {

		super("Netflix Database");
		setSize(750, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		try {
			bd = new Database();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(this, "No se ha podido conectar a la base de datos: \n" + e.getMessage(),
					"Netflix Database", JOptionPane.ERROR_MESSAGE);
			return;
		}

		setLayout(new MigLayout());

		setLocationRelativeTo(null);

		try {

			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {

			System.out.println("Error al establecer LookAndFeel a JTattoo");

		}

		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				try {
					bd.desconectar();
				} catch (SQLException sqle) {
					JOptionPane.showMessageDialog(null,
							"No se ha podido desconectar de la base de datos: \n" + sqle.getMessage(),
							"Netflix Database", JOptionPane.ERROR_MESSAGE);
				} catch (NullPointerException npe) {
					JOptionPane.showMessageDialog(null, "No ha llegado a hacer ninguna consulta.", "Netflix Database",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}

		});

		JPanel panel = (JPanel) getContentPane();

// Menu

		JMenuBar menuBar = new JMenuBar();
		JMenu menuConsultas = new JMenu("Consultas");

		JMenuItem menuConsulta1PeliOSerie = new JMenuItem("Todas las películas o series");
		menuConsulta1PeliOSerie.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				consulta1Shows();
			}
		});

		JMenuItem menuConsulta2Director = new JMenuItem("Todas las producciones de un director");
		menuConsulta2Director.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				consulta2Director();

			}
		});

		JMenuItem menuConsulta3Actor = new JMenuItem("Producciones en las que aparece un actor");
		menuConsulta3Actor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				consulta3Actor();
			}
		});

		JMenuItem menuConsulta4Reparto = new JMenuItem("Todos los actores de un show");
		menuConsulta4Reparto.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				consulta4Reparto();
			}
		});

		menuConsultas.add(menuConsulta1PeliOSerie);
		menuConsultas.add(menuConsulta2Director);
		menuConsultas.add(menuConsulta3Actor);
		menuConsultas.add(menuConsulta4Reparto);

		menuBar.add(menuConsultas);

		setJMenuBar(menuBar);

// Table

		DefaultTableModel dataModel = new DefaultTableModel(10, 4);
		table = new JTable(dataModel);
		JScrollPane scrPane = new JScrollPane(table);

		lblDescripcion = new JLabel("Elija una consulta del menú superior");

		panel.add(lblDescripcion, "wrap");
		panel.add(scrPane, "width 100%, growy, pushy");

		setVisible(true);

	}

	private void configuraTabla(String[] campos, int numFilas) {

		DefaultTableModel modelo = new DefaultTableModel(0, 4);
		table.setModel(modelo);

		for (int col = 0; col < campos.length; col++) {

			table.getColumnModel().getColumn(col).setHeaderValue(campos[col]);

		}

		modelo.setRowCount(numFilas);

	}

	private void consulta1Shows() {

		FormConsulta1Shows consulta = new FormConsulta1Shows(this);

		// Cuando la ventana se cierre:
		int tipoShow = consulta.getTipoShow();

		List<TituloEstreno> resultados;

		try {
			resultados = bd.consulta1TipoShow(tipoShow);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(this, "Error al consultar a la base de datos: \n" + e.getMessage(),
					"Netflix Database", JOptionPane.ERROR_MESSAGE);
			return;
		}

		String peliculasOSeries = tipoShow == 1 ? "películas" : "series";
		lblDescripcion.setText("Listado con todas las " + peliculasOSeries
				+ ", con sus identificadores y fecha de lanzamiento. Ordenado por título.");

		configuraTabla(new String[] { "ID", "Título", "Lanzamiento", "" }, resultados.size());

		for (int i = 0; i < resultados.size(); i++) {

			table.setValueAt(resultados.get(i).getId(), i, 0);
			table.setValueAt(resultados.get(i).getTitulo(), i, 1);
			table.setValueAt(resultados.get(i).getLanzamiento(), i, 2);

		}

	}

	private void consulta2Director() {

		FormConsulta2Director consulta = new FormConsulta2Director(this);

		String director = consulta.getDirector();

		List<TituloLanzamiento> resultados;

		try {

			resultados = bd.consulta2Director(director);

		} catch (SQLException e) {

			JOptionPane.showMessageDialog(null, "Error durante la conexión al base de datos\n" + e.getMessage(),
					"Netflix Database", JOptionPane.ERROR_MESSAGE);
			return;

		}

		// El texto sale cortado, pero porque es demasiado largo para la ventana y no se
		// como aplicarle wrap a la descripción.

		lblDescripcion.setText("Listado con todas las producciones del director " + director
				+ ", con sus titulos, fecha de lanzamiento y descripción. Ordenado por título.");

		// Configurar la tabla

		configuraTabla(new String[] { "TITULO", "LANZAMIENTO", "DESCRIPCIÓN", "" }, resultados.size());

		for (int i = 0; i < resultados.size(); i++) {

			table.setValueAt(resultados.get(i).getTitulo(), i, 0);
			table.setValueAt(resultados.get(i).getLanzamiento(), i, 1);
			table.setValueAt(resultados.get(i).getDescripcion(), i, 2);

		}

	}

	private void consulta3Actor() {

		FormConsulta3Actor consulta = new FormConsulta3Actor(this);

		String actor = consulta.getActor();

		List<TituloLanzamiento> resultados;

		try {

			resultados = bd.consulta3Actor(actor);

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error durante la conexión al base de datos\n" + e.getMessage(),
					"Netflix Database", JOptionPane.ERROR_MESSAGE);
			return;
		}

		lblDescripcion.setText("Listado con todas las producciones del actor " + actor + ".");

		// Configurar la tabla

		configuraTabla(new String[] { "TITULO", "LANZAMIENTO", "DESCRIPCIÓN", "" }, resultados.size());

		for (int i = 0; i < resultados.size(); i++) {

			table.setValueAt(resultados.get(i).getTitulo(), i, 0);
			table.setValueAt(resultados.get(i).getLanzamiento(), i, 1);
			table.setValueAt(resultados.get(i).getDescripcion(), i, 2);

		}

	}

	private void consulta4Reparto() {

		FormConsulta4Reparto consulta = new FormConsulta4Reparto(this);

		String produccion = consulta.getProduccion();

		List<String> resultados;

		try {
			resultados = bd.consulta4Reparto(produccion);
		} catch (SQLException e) {

			JOptionPane.showMessageDialog(null, "Error durante la conexión al base de datos\n" + e.getMessage(),
					"Netflix Database", JOptionPane.ERROR_MESSAGE);
			return;
		}

		lblDescripcion.setText("Reparto de la producción " + produccion + ".");

		// Configurar la tabla

		configuraTabla(new String[] { "ACTOR", "", "", "" }, resultados.size());

		for (int i = 0; i < resultados.size(); i++) {
			table.setValueAt(resultados.get(i), i, 0);
		}

	}

	private void insertar1ActorDirector() {

		FormInsertar1ActorDirector insertar = new FormInsertar1ActorDirector(this);

		String nombre = insertar.getNombre();
		boolean actor = insertar.isActor();
		boolean director = insertar.isDirector();

		try {

			if (!actor && !director) {

				JOptionPane.showMessageDialog(null,
						"No se ha seleccionado si '" + nombre
								+ "' es actor, director o ambos.\nNo se ha insertado nada en el base de datos",
						"Netflix Database", JOptionPane.WARNING_MESSAGE);

			} else if (actor && !director) {
				bd.insertar1ActorDirector(nombre, 1);
			} else if (!actor && director) {
				bd.insertar1ActorDirector(nombre, 2);
			} else {
				bd.insertar1ActorDirector(nombre, 3);
			}

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al intentar insertar " + nombre + "\n" + e.getMessage(),
					"Netflix Database", JOptionPane.ERROR_MESSAGE);
			return;
		}

		lblDescripcion.setText("Se ha insertado " + nombre + " correctamente.");
		configuraTabla(new String[] { "", "", "", "" }, 0);

	}

	public static void main(String[] args) {

		FormPrincipal ventana = new FormPrincipal();

	}

}