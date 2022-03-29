import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ejemplo10 extends JFrame {

	public Ejemplo10() {

		super("Términos y condiciones");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		JCheckBox chkAceptarTerminos = new JCheckBox("Acepto los términos y condiciones");
		JCheckBox chkAceptarPublicidad = new JCheckBox("Deseo recibir publicidad");

		add(chkAceptarTerminos);
		add(chkAceptarPublicidad);

		setVisible(true);

		String[] estilos = {"Pop", "Rock", "Disco", "Clásica"};
		
		int genero = JOptionPane.showOptionDialog(null, 
				"¿Cuál es tu género de música preferido?", 
				"Género de música", 0, 
				JOptionPane.QUESTION_MESSAGE, 
				null, estilos, estilos[2]);
		
		switch(genero) {
		case 0:
			System.out.println("Has elegido Pop");
			break;
		case 1:
			System.out.println("Has elegido Rock");
			break;
		case 2:
			System.out.println("Has elegido Disco");
			break;
		case 3:
			System.out.println("Has elegido Clásica");
			break;
		}

	}

	public static void main(String[] args) {
		Ejemplo10 ejemplo = new Ejemplo10();
	}

}









