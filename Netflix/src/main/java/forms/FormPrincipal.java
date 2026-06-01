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
import db.Database;
import net.miginfocom.swing.MigLayout;

public class FormPrincipal extends JFrame {

	private Database bd;
	private JTable table;
	private JLabel lblDescription;

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
					JOptionPane.showMessageDialog(null, "No se ha podido desconectar de la base de datos: \n" + sqle.getMessage(),
							"Netflix Database", JOptionPane.ERROR_MESSAGE);
				}
			}

		});

		JPanel panel = (JPanel) getContentPane();

// Menu

		JMenuBar menuBar = new JMenuBar();
		JMenu menuConsultas = new JMenu("Consultas");
		JMenuItem menuConsultaPeliOSerie = new JMenuItem("Todas las películas o series");
		menuConsultaPeliOSerie.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				consulta1Shows();

			}
		});

		menuConsultas.add(menuConsultaPeliOSerie);
		menuBar.add(menuConsultas);

		setJMenuBar(menuBar);

// Table

		DefaultTableModel dataModel = new DefaultTableModel(10, 4);
		table = new JTable(dataModel);
		JScrollPane scrPane = new JScrollPane(table);

		lblDescription = new JLabel("Elija una consulta del menú superior");

		panel.add(lblDescription, "wrap");
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
		lblDescription.setText("Listado con todas las " + peliculasOSeries
				+ ", con sus identificadores y fecha de lanzamiento. Ordenado por título.");

		configuraTabla(new String[] { "ID", "Título", "Lanzamiento", "" }, resultados.size());

		for (int i = 0; i < resultados.size(); i++) {

			table.setValueAt(resultados.get(i).getId(), i, 0);
			table.setValueAt(resultados.get(i).getTitulo(), i, 1);
			table.setValueAt(resultados.get(i).getLanzamiento(), i, 2);

		}

	}
	
	private void consulta2Director() {
		
	}

	public static void main(String[] args) {

		FormPrincipal ventana = new FormPrincipal();

		boolean timer = true;

		if (timer) {
			for (int i = 10; i >= 0; i--) {
				if (i == 1) {
// System.out.println("Closing window...");
				}
				try {
					Thread.sleep(10000);
				} catch (Exception e) {
				}
			}
			ventana.dispose();

// System.out.println("Window closed.");
		}

	}

}