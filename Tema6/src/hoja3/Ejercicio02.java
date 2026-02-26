package hoja3;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Ejercicio02 extends JFrame {

	public Ejercicio02() {
		super("Selección de modelo");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
		setLayout(layout);

		String[] listaModelos = { "Peugeot", "Volkswaguen", "Renault", "Seat", "Ferrari", "Porsche", "Jaguar", "Dacia",
				"Nissan" };

		JList<String> lista = new JList<>(listaModelos);
		JScrollPane scrollPane = new JScrollPane(lista);

		add(scrollPane);
		add(new JLabel("Modelo?"));

		setVisible(true);

	}

	public static void main(String[] args) {

		Ejercicio02 ventana = new Ejercicio02();

	}
}