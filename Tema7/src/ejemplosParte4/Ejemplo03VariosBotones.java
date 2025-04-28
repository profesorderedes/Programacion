package ejemplosParte4;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo03VariosBotones extends JFrame implements ActionListener {

	private JLabel lblMensaje;
	private JButton btnPulsar;

	public Ejemplo03VariosBotones() {

		super("Eventos");
		setSize(450, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		btnPulsar = new JButton("¡Púlsame!");
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
		new Ejemplo03VariosBotones();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		JButton boton = (JButton) arg0.getSource();

		if (boton == btnPulsar) {
			lblMensaje.setText("Has pulsado el botón izquierdo.");
		} else {
			lblMensaje.setText("Has pulsado el botón derecho.");
		}
	}

}
