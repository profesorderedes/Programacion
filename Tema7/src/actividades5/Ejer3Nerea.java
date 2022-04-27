package actividades5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Ejer3Nerea extends JFrame {

	private JComboBox<String> cmbOpciones;

	public Ejer3Nerea() {

		super("Operaciones");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		JLabel lblA = new JLabel("Operando A");
		JLabel lblB = new JLabel("Operando B");
		JLabel lblOperacion = new JLabel("Operacion");
		JLabel lblResultado = new JLabel("Resultado");

		JTextField txtA = new JTextField(10);
		JTextField txtB = new JTextField(10);
		JTextField txtResultado = new JTextField(10);

		cmbOpciones = new JComboBox<>();
		cmbOpciones.addItem("Suma");
		cmbOpciones.addItem("Resta");
		cmbOpciones.addItem("Multiplicacion");
		cmbOpciones.addItem("Division");

		cmbOpciones.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {

					float numero1 = Float.parseFloat(
							txtA.getText());
					float numero2 = Float.parseFloat(
							txtB.getText());
					float resultado = 0;

					String seleccionado = (String) 
							cmbOpciones.getSelectedItem();

					if ("Suma".equals(seleccionado)) {
						resultado = numero1 + numero2;
					} else if ("Resta".equals(seleccionado)) {
						resultado = numero1 - numero2;
					} else if ("Multiplicacion".equals(seleccionado)) {
						resultado = numero1 * numero2;
					} else if ("Division".equals(seleccionado)) {
						resultado = numero1 / numero2;
					}
					
					txtResultado.setText("" + resultado);

				} catch (Exception ex) {
					txtResultado.setText("ERROR");
				}
			}
		});

		add(lblA);
		add(txtA);
		add(lblB);
		add(txtB);
		add(lblOperacion);
		add(cmbOpciones);
		add(lblResultado);
		add(txtResultado);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejer3Nerea();
	}

}