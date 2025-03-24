package ejemplos;

import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Ejemplo04Checkboxes extends JFrame{
	
	public Ejemplo04Checkboxes() {
		
		super("Elegir idioma");
		setSize(250, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JLabel lblIdioma = new JLabel("Marca los idiomas que conozcas:");
		
		JCheckBox chkIngles = new JCheckBox("Inglés", true);
		JCheckBox chkFrances = new JCheckBox("Francés");
		JCheckBox chkItaliano = new JCheckBox("Italiano");
		JCheckBox chkPortugues = new JCheckBox("Portugués");
		
		add(lblIdioma);
		add(chkIngles);
		add(chkFrances);
		add(chkItaliano);
		add(chkPortugues);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Ejemplo04Checkboxes();
	}

}
