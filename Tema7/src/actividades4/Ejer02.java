package actividades4;

import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejer02 extends JFrame {

	public Ejer02() {

		super("Matrícula");
		setSize(200, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setLocationRelativeTo(null);

		JLabel lblApellidos = new JLabel("Apellidos");
		JTextField txtApellidos = new JTextField(16);

		JLabel lblNombre = new JLabel("Nombre");
		JTextField txtNombre = new JTextField(16);

		JLabel lblCurso = new JLabel("Curso");
		String[] cursos = { "Selecciona un curso", "1º ESO", "2º ESO", "3º ESO", "4º ESO" };

		JComboBox<String> cmbCursos = new JComboBox<String>(cursos);

		add(lblApellidos);
		add(txtApellidos);
		add(lblNombre);
		add(txtNombre);
		add(lblCurso);
		add(cmbCursos);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejer02();
	}

}
