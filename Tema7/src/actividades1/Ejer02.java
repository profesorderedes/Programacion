package actividades1;

import javax.swing.JOptionPane;

public class Ejer02 {

	public Ejer02() {

		String respuesta = JOptionPane.showInputDialog(null, 
				"Escribe tu Dni:", 
				"Confirmación de identidad",
				JOptionPane.QUESTION_MESSAGE);

	}

	public static void main(String[] args) {

		Ejer02 ejer2 = new Ejer02();
	}

}