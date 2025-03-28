package actividades1;

import java.awt.FlowLayout;

import javax.swing.JFrame;

import javax.swing.JOptionPane;

public class Act1 extends JFrame {

	public Act1() {

		super("Formatear disco duro");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		JOptionPane.showConfirmDialog(this, "¿Formatear el disco duro?", "Confirmación de formateo",
				JOptionPane.WARNING_MESSAGE, JOptionPane.OK_CANCEL_OPTION);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Act1();

	}

}