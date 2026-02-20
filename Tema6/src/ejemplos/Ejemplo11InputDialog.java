package ejemplos;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ejemplo11InputDialog extends JFrame {

	public Ejemplo11InputDialog() {
		
		super("Diálogos");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		setLayout(layout);
		
		setLocationRelativeTo(null);
		
		

		setVisible(true);
		
		String correo = JOptionPane.showInputDialog("Escriba su correo:");
		System.out.println(correo);
		
		String cupon = JOptionPane.showInputDialog(this,  "Escriba su cupón de descuento:", "cupón");
		
		String edad = JOptionPane.showInputDialog(this, "Indique su edad:", "Edad", JOptionPane.INFORMATION_MESSAGE);
		
	}

	public static void main(String[] args) {
		Ejemplo11InputDialog plantilla = new Ejemplo11InputDialog();
	}

}
