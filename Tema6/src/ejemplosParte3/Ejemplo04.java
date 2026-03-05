package ejemplosParte3;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejemplo04 extends JFrame implements FocusListener {

	private JTextField txtNum1, txtNum2, txtNum3;
	private JLabel lblMedia;

	public Ejemplo04() {

		super("Media aritmética");
		setSize(270, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		txtNum1 = new JTextField("0", 5);
		txtNum1.addFocusListener(this);

		txtNum2 = new JTextField("0", 5);
		txtNum2.addFocusListener(this);

		txtNum3 = new JTextField("0", 5);
		txtNum3.addFocusListener(this);

		lblMedia = new JLabel("La media es 0.0");

		add(txtNum1);
		add(txtNum2);
		add(txtNum3);
		add(lblMedia);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo04();
	}

	@Override
	public void focusGained(FocusEvent e) {

		// Con selectAll() hacemos que cuando cualquier casilla reciba el foco,
		// se seleccione automáticamente su contenido.
		txtNum1.selectAll();
		txtNum2.selectAll();
		txtNum3.selectAll();

		// Ponemos fondo amarillo a la casilla de texto que ha recibido el foco.
		((JTextField) e.getSource()).setBackground(Color.YELLOW);
	}

	@Override
	public void focusLost(FocusEvent e) {

		// Ponemos fondo blanco a la casilla de texto que ha perdido el foco.
		((JTextField) e.getSource()).setBackground(Color.WHITE);

		double num1 = Double.parseDouble(txtNum1.getText());
		double num2 = Double.parseDouble(txtNum2.getText());
		double num3 = Double.parseDouble(txtNum3.getText());

		double media = (num1 + num2 + num3) / 3;

		lblMedia.setText("La media es " + media);

	}

}
