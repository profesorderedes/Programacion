package actividades5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import net.iessonferrer.mates.Mates;

public class Ejer03 extends JFrame {

	private JComboBox<String> cmbOperacion;
	private JTextField txtResultado;

	public Ejer03() {
		super("Operaciones");
		setSize(250, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);

		JLabel lblOperandoA = new JLabel("Operando A ");
		JTextField txtOperandoA = new JTextField(10);

		JLabel lblOperandoB = new JLabel("Operando B ");
		JTextField txtOperandoB = new JTextField(10);

		JLabel lblOperacion = new JLabel("Operacion ");

		String[] Operaciones = { "Suma", "Resta", "Multiplicación", "División" };
		cmbOperacion = new JComboBox<>(Operaciones);
		cmbOperacion.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				try {

					float a = Integer.parseInt(txtOperandoA.getText());
					float b = Integer.parseInt(txtOperandoB.getText());

					if (cmbOperacion.getSelectedItem().equals("Suma")) {
						txtResultado.setText(String.valueOf(a + b));
					} else if (cmbOperacion.getSelectedItem().equals("Resta")) {
						txtResultado.setText(String.valueOf(a - b));

					} else if (cmbOperacion.getSelectedItem().equals("Multiplicación")) {
						txtResultado.setText(String.valueOf(a * b));

					} else if (cmbOperacion.getSelectedItem().equals("División")) {
						txtResultado.setText(String.valueOf(Mates.redondear(a / b)));
					}

				} catch (Exception e) {
					txtResultado.setText("ERROR");
				}
			}

		});

		JLabel lblResultado = new JLabel("Resultado ");
		txtResultado = new JTextField(10);

		add(lblOperandoA);
		add(txtOperandoA);

		add(lblOperandoB);
		add(txtOperandoB);

		add(lblOperacion);
		add(cmbOperacion);

		add(lblResultado);
		add(txtResultado);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejer03();
	}

}