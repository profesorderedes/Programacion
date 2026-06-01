package forms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

import auxiliar.TituloEstreno;
import net.miginfocom.swing.MigLayout;

public class FormPrincipal extends JFrame {

	public FormPrincipal() {

		super("Netflix Database");
		setSize(750, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new MigLayout());

		setLocationRelativeTo(null);

		try {

			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {

			System.out.println("Error al establecer LookAndFeel a JTattoo");

		}

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
		JTable table = new JTable(dataModel);
		JScrollPane scrPane = new JScrollPane(table);

		JLabel lblDescription = new JLabel("Elija una consulta del menú superior");
		
		panel.add(lblDescription, "wrap");
		panel.add(scrPane, "width 100%, growy, pushy");

		setVisible(true);

	}
	
	private void consulta1Shows() {
		
		FormConsulta1Shows consulta = new FormConsulta1Shows(this);
		
		// Cuando la ventana se cierre:
		List<TituloEstreno> resultados;
		
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