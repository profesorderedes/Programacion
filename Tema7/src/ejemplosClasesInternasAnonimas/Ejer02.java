package ejemplosClasesInternasAnonimas;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejer02 extends JFrame {

	private JComboBox<String> cmbCursos;

	private JLabel lblCursoSelecionado;

	public Ejer02() {

		super("Matrícula");
		setSize(240, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel lblApellidos = new JLabel("Apellidos");
		JTextField txtApellidos = new JTextField(20);

		JLabel lblNombre = new JLabel("Nombre");
		JTextField txtNombre = new JTextField(20);

		JLabel lblCurso = new JLabel("Curso");

		String[] cursos = { "Selecciona un curso", "1º ESO", "2º ESO", "3º ESO", "4º ESO" };

		cmbCursos = new JComboBox<String>(cursos);
		cmbCursos.setPreferredSize(new Dimension(150, 20));
		cmbCursos.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent arg0) {
				mostrarCurso();
			}
		});

		lblCursoSelecionado = new JLabel();

		add(lblApellidos);
		add(txtApellidos);
		add(lblNombre);
		add(txtNombre);

		add(lblCurso);
		add(cmbCursos);

		add(lblCursoSelecionado);

		setVisible(true);

	}

	private void mostrarCurso() {
		if (cmbCursos.getSelectedIndex() == 0) {
			lblCursoSelecionado.setText("");
		} else {
			lblCursoSelecionado.setText("Curso: " + cmbCursos.getSelectedItem());
		}
	}

	public static void main(String[] args) {

		new Ejer02();

	}

}