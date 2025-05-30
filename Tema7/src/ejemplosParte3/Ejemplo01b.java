package ejemplosParte3;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo01b extends JFrame implements ActionListener {

	private JLabel lblMensaje;

	public Ejemplo01b() {

		super("Eventos");
		setSize(450, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		JButton btnPulsar = new JButton("¡Púlsame!");
		btnPulsar.setPreferredSize(new Dimension(200, 50));
		btnPulsar.addActionListener(this);

		JButton btnPulsar2 = new JButton("¡Púlsame a mí!");
		btnPulsar2.setPreferredSize(new Dimension(200, 50));
		btnPulsar2.addActionListener(this);

		lblMensaje = new JLabel("Aún no has pulsado.");

		add(btnPulsar);
		add(btnPulsar2);
		add(lblMensaje);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo01b();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		lblMensaje.setText("Gracias por pulsar.");
	}

}
