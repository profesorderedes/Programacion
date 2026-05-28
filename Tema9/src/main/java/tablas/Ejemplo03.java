package tablas;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

// Añadir otra fila de datos (después de creada la tabla).

public class Ejemplo03 extends JFrame {

	public Ejemplo03() {

		super("Ejemplo 02 Tablas");
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setLocationRelativeTo(null);

		String[] columnNames = { "ID", "Nombre", "Apellidos", "Edad" };
		String[][] data = { { "1", "Jose", "Sánchez", "31" }, { "2", "María", "González", "28" } };

		TableModel dataModel = new DefaultTableModel(data, columnNames);

		JTable table = new JTable(dataModel);

		// Añadimos una fila más de datos manualmente.
		
		

		JScrollPane scrPane = new JScrollPane(table);

		add(scrPane);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo03();
	}
}



