package ejemplos;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejemplo03Texto extends JFrame{

	public Ejemplo03Texto() {
		
		super("Textos");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JLabel etiqueta = new JLabel("Nombre:");
		JTextField campo = new JTextField(30);
		
		add(etiqueta);
		add(campo);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Ejemplo03Texto();
	}
	
}
