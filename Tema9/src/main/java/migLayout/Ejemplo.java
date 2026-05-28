package migLayout;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class Ejemplo extends JFrame {

	public Ejemplo() {
		super("Prueba");
		setSize(550, 350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new MigLayout());
		
		JPanel panel = (JPanel) getContentPane();
		
		panel.add(new JLabel("Nombre"));
		panel.add(new JLabel("Apellidos"));
		panel.add(new JLabel("Sexo"), "wrap");
		panel.add(new JTextField(10));
		panel.add(new JTextField(10));
		panel.add(new JRadioButton("Hombre"), "split 2");
		panel.add(new JRadioButton("Mujer"), "wrap 10");
		panel.add(new JLabel("Comentarios"), "wrap");
		
		JScrollPane scrComentarios = new JScrollPane(new JTextArea());
		scrComentarios.setPreferredSize(new Dimension(300, 200));
		
		panel.add(scrComentarios, "wrap 10, span, width 100%, growy, pushy");
		
		panel.add(new JButton("Aceptar"), "split 2, gapright 10");
		panel.add(new JButton("Cancelar"));
		panel.add(new JButton("Ayuda"), "skip, align right, width 120");
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejemplo();
	}

}
