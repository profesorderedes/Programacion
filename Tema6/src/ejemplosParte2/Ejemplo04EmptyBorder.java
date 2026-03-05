package ejemplosParte2;

import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejemplo04EmptyBorder extends JFrame {
	public static void main(String[] args) {
		new Ejemplo04EmptyBorder();
	}

	public Ejemplo04EmptyBorder() {

		super("Bordes vacíos");
		setSize(270, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		JPanel panel = (JPanel) this.getContentPane();
		panel.setBorder(BorderFactory.createEmptyBorder(40, 100, 0, 0));

		JLabel lblNombre = new JLabel("Nombre completo");
		JTextField txtNombre = new JTextField(15);

		add(lblNombre);
		add(txtNombre);
		setVisible(true);
	}
}