package hoja4;

import java.awt.FlowLayout;

import java.awt.event.ItemEvent;

import java.awt.event.ItemListener;

import javax.swing.JComboBox;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JTextField;

public class Ejer02 extends JFrame implements ItemListener {

	private String[] cursos = { "Selecciona un curso", "1º ESO", "2º ESO", "3º ESO", "4º ESO" };
	private JComboBox<String> cmbCursos;
	private JLabel lblSeleccionado;

	public Ejer02() {

		super("Matrícula");
		setSize(250, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setLocationRelativeTo(null);

//

		cmbCursos = new JComboBox<>(cursos);
		cmbCursos.addItemListener(this);

		lblSeleccionado = new JLabel();

		add(new JLabel("Apellidos"));
		add(new JTextField(21));
		add(new JLabel("Nombre"));
		add(new JTextField(21));
		add(new JLabel("Curso"));
		add(cmbCursos);
		add(lblSeleccionado);

//

		setVisible(true);

	}

	public static void main(String[] args) {

		Ejer02 ventana = new Ejer02();

	}

	@Override

	public void itemStateChanged(ItemEvent e) {

		if (cmbCursos.getSelectedIndex() == 0) {

			lblSeleccionado.setText("");

		} else {

			lblSeleccionado.setText("Curso: " + (String) cmbCursos.getSelectedItem());

		}

	}

}