package tablas;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

// JTable: Crear una tabla con 8 columnas y 10 filas, vacía.
// DefaultTableModel 
public class Ejemplo01 extends JFrame {

	public Ejemplo01() {

		super("Ejemplo 01 Tablas");
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setLocationRelativeTo(null);

		TableModel dataModel = new DefaultTableModel(10, 8);

		JTable table = new JTable(dataModel);

		JScrollPane scrPane = new JScrollPane(table);

		add(scrPane);

		setVisible(true);

	}
	
	public static void main(String[] args) {
		new Ejemplo01();
	}

}