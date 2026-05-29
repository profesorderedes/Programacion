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

		//

		String[] columnNames = { "ID", "Nombre", "Apellidos", "Edad" };
		String[][] data = { { "1", "Jose", "Sánchez", "31" }, { "2", "María", "González", "28" } };

		DefaultTableModel dataModel = new DefaultTableModel(data, columnNames);

		JTable table = new JTable(dataModel);

		// Añadimos una fila más de datos manualmente.

		String[] newRow = { "3", "Susana", "García", "33" };
		dataModel.addRow(newRow);
		
		// Una forma de modificar valores.
		table.setValueAt("3", 2, 0);
		table.setValueAt("Sonia", 2, 1);
		table.setValueAt("Martínez", 2, 2);
		table.setValueAt("20", 2,3); 

		JScrollPane scrPane = new JScrollPane(table);

		add(scrPane);

		//
		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo03();
	}

}
