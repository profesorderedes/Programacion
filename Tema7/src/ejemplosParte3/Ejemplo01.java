package ejemplosParte3;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo01 extends JFrame implements ActionListener{

	private JLabel lblMensaje;
	
	public Ejemplo01() {

		super("Eventos");
		setSize(250, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);
		
		JButton btnPulsar = new JButton("¡Púlsame!");
		btnPulsar.setPreferredSize(new Dimension(200, 50));
		btnPulsar.addActionListener(this);
		
		lblMensaje = new JLabel("Aún no has pulsado.");

		add(btnPulsar);
		add(lblMensaje);
		
		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo01();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		lblMensaje.setText("Gracias por pulsar.");
	}

}
