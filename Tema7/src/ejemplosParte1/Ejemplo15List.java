package ejemplosParte1;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Ejemplo15List extends JFrame {

	public Ejemplo15List() {

		super("Lista de la compra");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		String[] comprar = { "Pan", "Fruta", "Leche", "Huevos", "Lavavajillas", "Papel de cocina", "Carne", "Pescado",
				"Embutido" };

		JList<String> lstComprar = new JList<>(comprar);

		JScrollPane panelComprar = new JScrollPane(lstComprar);

		add(panelComprar);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo15List();
	}

}
