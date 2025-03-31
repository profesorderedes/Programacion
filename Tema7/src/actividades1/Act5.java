package actividades1;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Act5 extends JFrame {

	public Act5() {

		super("Diálogo");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		setVisible(true);

		String[] cursos = { "Apache", "IIS", "Nginx", "Node.JS" };
		int response = JOptionPane.showOptionDialog(null, 
				"¿Qué servidor web desea para su hosting?",
				"Elección de servidor web", 0, 
				JOptionPane.INFORMATION_MESSAGE, null, cursos, cursos[1]);

	}

	public static void main(String[] args) {

		new Act5();

	}
}