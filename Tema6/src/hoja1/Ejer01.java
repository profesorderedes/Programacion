package hoja1;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ejer01 extends JFrame {

	public Ejer01() {
		super("Diálogos");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		setLayout(layout);
		
		setLocationRelativeTo(null);

		setVisible(true);
		
		JOptionPane.showConfirmDialog();
	}

	public static void main(String[] args) {
		Ejer01 plantilla = new Ejer01();
	}

}
