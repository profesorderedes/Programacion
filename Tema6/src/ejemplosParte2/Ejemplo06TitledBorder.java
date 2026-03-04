package ejemplosParte2;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejemplo06TitledBorder extends JFrame {
	public static void main(String[] args) {
		new Ejemplo06TitledBorder();
	}

	public Ejemplo06TitledBorder() {
		super("Bordes título");
		setSize(260, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// PANEL DE CONTENIDO
		JPanel panel = (JPanel) this.getContentPane();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel.setBorder(
				BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Datos de usuario"));

		JLabel lblApellidos = new JLabel("Apellidos");
		JTextField txtApellidos = new JTextField(15);

		JLabel lblNombre = new JLabel("Nombre");
		JTextField txtNombre = new JTextField(15);

		JButton btnAceptar = new JButton("Aceptar");

		add(lblApellidos);
		add(txtApellidos);
		add(lblNombre);
		add(txtNombre);
		add(btnAceptar);

		setVisible(true);
	}
}