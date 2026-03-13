package ejemplosParte3ClasesAnonimas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo02ActionListener extends JFrame {

	private JLabel lblPulsado;

	public Ejemplo02ActionListener() {

		super("ActionListener");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setLocationRelativeTo(null);

		JButton btnPulsar = new JButton("¡Púlsame!");

		// Asignamos a nuestro botón un manejador (oyente) de eventos de click.
		btnPulsar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lblPulsado.setText("¡Bien pulsado!");
			}
		});

		lblPulsado = new JLabel();

		add(btnPulsar);
		add(lblPulsado);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo02ActionListener();
	}

}
