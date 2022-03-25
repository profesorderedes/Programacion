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

		
		
	}

	public static void main(String[] args) {
		Ejemplo09 ejemplo = new Ejemplo09();
	}

}
