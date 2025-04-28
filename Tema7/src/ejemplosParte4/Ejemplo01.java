package ejemplosParte4;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo01 extends JFrame {

	

	public Ejemplo01() {

		super("Eventos");
		setSize(250, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		JButton btnPulsar = new JButton("¡Púlsame!");
		btnPulsar.setPreferredSize(new Dimension(200, 50));
		JLabel lblMensaje = new JLabel("Aún no has pulsado.");
		
		btnPulsar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				lblMensaje.setText("Gracias por pulsar.");
			}
		});

		

		add(btnPulsar);
		add(lblMensaje);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo01();
	}

}
