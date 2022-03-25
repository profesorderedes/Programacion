import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ejemplo09 extends JFrame {

	public Ejemplo09() {

		super("Términos y condiciones");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		JCheckBox chkAceptarTerminos = new JCheckBox("Acepto los términos y condiciones");
		JCheckBox chkAceptarPublicidad = new JCheckBox("Deseo recibir publicidad");

		add(chkAceptarTerminos);
		add(chkAceptarPublicidad);

		setVisible(true);

		// Diálogos de entrada.
//		String nombre = JOptionPane.showInputDialog(null, 
//				"¿Cuál es tu nombre?");
//		
//		System.out.println("Nombre: " + nombre);

		final String CODIGO_CORRECTO = "1234";

		String codigo = JOptionPane.showInputDialog(null, "¿Código de verificación?", "Verificación",
				JOptionPane.QUESTION_MESSAGE);

		if (codigo != null && codigo.equals(CODIGO_CORRECTO)) {
			JOptionPane.showMessageDialog(null, "Código correcto.");
		} else {
			JOptionPane.showMessageDialog(null, "Código incorrecto.");
		}

	}

	public static void main(String[] args) {
		Ejemplo09 ejemplo = new Ejemplo09();
	}

}
