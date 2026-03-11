package hoja5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejer03 extends JFrame implements ActionListener {

	private JTextField txtOperandoA, txtOperandoB, txtResultado;
	private JComboBox<String> cmbOperacion;

	public Ejer03() {

		super("Operaciones");
		setSize(200, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.RIGHT));

		setLocationRelativeTo(null);

		String[] operaciones = { "Suma", "Resta", "Multiplicación", "División" };

		cmbOperacion = new JComboBox<>(operaciones);
		cmbOperacion.addActionListener(this);

		txtOperandoA = new JTextField(10);
		txtOperandoB = new JTextField(10);
		txtResultado = new JTextField(10);

		add(new JLabel("Operando A"));
		add(txtOperandoA);

		add(new JLabel("Operando B"));
		add(txtOperandoB);

		add(new JLabel("Operación"));
		add(cmbOperacion);

		add(new JLabel("Resultado"));
		add(txtResultado);

		setVisible(true);

	}

	public static void main(String[] args) {

		Ejer03 ventana = new Ejer03();

	}

	@Override

	public void actionPerformed(ActionEvent e) {

		try {

			double a = Double.parseDouble(txtOperandoA.getText());
			double b = Double.parseDouble(txtOperandoB.getText());

			if (cmbOperacion.getSelectedIndex() == 0) {

				txtResultado.setText("" + (a + b));

			} else if (cmbOperacion.getSelectedIndex() == 1) {

				txtResultado.setText("" + (a - b));

			} else if (cmbOperacion.getSelectedIndex() == 2) {

				txtResultado.setText("" + (a * b));

			} else if (cmbOperacion.getSelectedIndex() == 3) {

				txtResultado.setText("" + (a / b));

			}

		} catch (NumberFormatException nfe) {

			nfe.printStackTrace();
			txtResultado.setText("ERROR");

		} 

	}

}