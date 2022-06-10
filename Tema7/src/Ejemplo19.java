import javax.swing.*;
import java.awt.*;

public class Ejemplo19 extends JFrame {

	public Ejemplo19() {

		super("Biblioteca");
		setSize(300, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new GridLayout(1, 2));

		// PANEL IZQUIERDO

		JPanel panelIzquierdo = new JPanel();
		panelIzquierdo.setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel lblTitulo = new JLabel("Título");
		JTextField txtTitulo = new JTextField(10);

		JLabel lblAutor = new JLabel("Autor");
		JTextField txtAutor = new JTextField(10);

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
		new Ejemplo19();
	}

}
