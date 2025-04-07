package ejemplosParte2;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejemplo03 extends JFrame {

	public Ejemplo03() {

		super("Alta de libros");
		setSize(430, 170);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new GridLayout(1, 2));

		setLocationRelativeTo(null);

		// PANEL IZQUIERDO

		JPanel panelIzquierdo = new JPanel(new FlowLayout(FlowLayout.LEFT));

		JLabel lblTitulo = new JLabel("Título");
		JTextField txtTitulo = new JTextField(16);

		JLabel lblAutor = new JLabel("Autor");
		JTextField txtAutor = new JTextField(16);

		panelIzquierdo.add(lblTitulo);
		panelIzquierdo.add(txtTitulo);
		panelIzquierdo.add(lblAutor);
		panelIzquierdo.add(txtAutor);

		// PANEL DERECHO

		JButton btnAlta = new JButton("Alta");

		// VENTANA

		add(panelIzquierdo);
		add(btnAlta);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo03();
	}

}
