package actividades3;

import javax.swing.*;
import java.awt.*;

public class Ejer02 extends JFrame {

	public Ejer02() {

		super("Seleccion de modelo");
		setSize(220, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel lblModelo = new JLabel("Modelo?");

		String[] modelos = { "Peugeot", "Volkswagen", 
				"Renault", "Seat", "Ferrari", "Porshe", 
				"Jaguar", "Dacia" };

		JList<String> lstModelos = new JList<>(modelos);

		JScrollPane panelModelos = new JScrollPane(lstModelos);
		panelModelos.setPreferredSize(new Dimension(120,120));
		
		add(panelModelos);
		add(lblModelo);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejer02();
	}

}