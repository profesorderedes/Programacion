package ejemplosParte1;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Ejemplo15List extends JFrame {

	public Ejemplo15List() {

		super("Listas");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		setLayout(layout);

		setLocationRelativeTo(null);

		String[] paises = { "Grecia", "Italia", "Albania", "Rumanía", "Bulgaria", "Hungría", "Polonia", "Alemania",
				"Estonia", "Letonia", "Lituania", "Finlandia" };

		JList<String> lstPaises = new JList<String>(paises);

		JScrollPane scrPaises = new JScrollPane(lstPaises);
		scrPaises.setPreferredSize(new Dimension(100, 200));

		add(new JLabel("Elige un país:"));
		add(scrPaises);

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo15List plantilla = new Ejemplo15List();
	}

}
