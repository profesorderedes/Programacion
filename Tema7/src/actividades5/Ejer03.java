package actividades5;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejer03 extends JFrame {

	private JTextField txtOperandoA, txtOperandoB, txtResultado;
	private JComboBox<String> cmbOperaciones;

	public Ejer03() {

		super("Operaciones");
		setSize(240, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		// Ventana
		JLabel lblOperandoA = new JLabel("Operando A");
		txtOperandoA = new JTextField(8);

		JLabel lblOperandoB = new JLabel("Operando B");
		txtOperandoB = new JTextField(8);

		JLabel lblOperacion = new JLabel("Operación");

		cmbOperaciones = new JComboBox<>();
		cmbOperaciones.addItem("Suma");
		cmbOperaciones.addItem("Resta");
		cmbOperaciones.addItem("Multiplicación");
		cmbOperaciones.addItem("División");

		JLabel lblResultado = new JLabel("Resultado");
		txtResultado = new JTextField(8);
		txtResultado.setEditable(false);
		txtResultado.setBackground(Color.WHITE);

		// Operaciones
		cmbOperaciones.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {

					float num1 = Float.parseFloat(txtOperandoA.getText());
					float num2 = Float.parseFloat(txtOperandoB.getText());
					float resultado = 0;
					String seleccion = (String) cmbOperaciones.getSelectedItem();

					if (seleccion.equals("Suma")) {

						resultado = num1 + num2;

					} else if (seleccion.equals("Resta")) {

						resultado = num1 - num2;

					} else if (seleccion.equals("Multiplicación")) {

						resultado = num1 * num2;

					} else if (seleccion.equals("División")) {

						resultado = num1 / num2;

					}

					txtResultado.setText("" + resultado);

				} catch (NumberFormatException ex) {
					ex.printStackTrace();
					txtResultado.setText("ERROR");
				}

			}
		});

		add(lblOperandoA);
		add(txtOperandoA);
		add(lblOperandoB);
		add(txtOperandoB);
		add(lblOperacion);
		add(cmbOperaciones);
		add(lblResultado);
		add(txtResultado);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejer03();
	}

}