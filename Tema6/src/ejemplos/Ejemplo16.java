package ejemplos;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Ejemplo16 extends JFrame {

	public Ejemplo16() {

		super("Listas");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		setLayout(layout);

		setLocationRelativeTo(null);

		// Creamos un modelo de datos para listas.
		DefaultListModel<String> modelo = new DefaultListModel<String>();

		// Creamos la lista pasándole el modelo de datos que va a usar
		JList<String> lstPaises = new JList<String>(modelo);

		JScrollPane scrPaises = new JScrollPane(lstPaises);
		scrPaises.setPreferredSize(new Dimension(100, 200));

		// Vemos cómo añadir elementos a una lista uno a uno.

		// Añadimos al modelo cada elemento que queremos que se vea en la lista.
		modelo.addElement("Austria");
		modelo.addElement("Alemania");

		add(new JLabel("Elige un país:"));
		add(scrPaises);

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo16 plantilla = new Ejemplo16();
	}

}
