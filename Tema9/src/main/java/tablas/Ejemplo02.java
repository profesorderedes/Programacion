package tablas;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

// JTable: Crear una tabla con 4 columnas con los encabezados ID, Nombre, Apellidos, Edad.
// Y dos filas con datos inventados.

public class Ejemplo02 extends JFrame {

	public Ejemplo02() {
		super("Ejemplo 02 Tablas");
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setLocationRelativeTo(null);

		String[] columnNames = { "ID", "Nombre", "Apellidos", "Edad" };
		String[][] data = { { "1", "Jose", "Sánchez", "31" }, { "2", "María", "González", "28" } };

		TableModel dataModel = new DefaultTableModel(data, columnNames);

		JTable table = new JTable(dataModel);

		JScrollPane scrPane = new JScrollPane(table);

		add(scrPane);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo02();
	}
}