package actividades4;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejer02 extends JFrame implements ItemListener {

	private JComboBox<String> cmbCursos;
	private JLabel lblCursoSeleccionado;
	private String cursos[] = { "Selecciona un curso", "1º ESO", "2º ESO", "3º ESO", "4º ESO" };

	public Ejer02() {

		super("Matrícula");
		setSize(250, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel lblApellidos = new JLabel("Apellidos");
		JTextField txtApellidos = new JTextField(20);

		JLabel lblNombre = new JLabel("Nombre");
		JTextField txtNombre = new JTextField(20);

		JLabel lblCurso = new JLabel("Curso");

		cmbCursos = new JComboBox<>(cursos);
		cmbCursos.addItemListener(this);

		lblCursoSeleccionado = new JLabel("");

		add(lblApellidos);
		add(txtApellidos);
		add(lblNombre);
		add(txtNombre);
		add(lblCurso);
		add(cmbCursos);
		add(lblCursoSeleccionado);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejer02();
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {

		int curso = cmbCursos.getSelectedIndex();

		if (curso == 0) {
			lblCursoSeleccionado.setText("");
		} else {
			lblCursoSeleccionado.setText("Curso: " + cursos[curso]);
		}

	}

}