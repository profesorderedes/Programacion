package ejemplosParte3;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// Programa que indica en la ventana cuántas veces se ha pulsado un botón.
public class Ejemplo04 extends JFrame implements ActionListener {

	private int pulsaciones = 0;
	private JLabel lblPulsar;

	public Ejemplo04() {

		super("Contar pulsaciones");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		JButton btnPulsar = new JButton("¡Púlsame!");
		btnPulsar.setPreferredSize(new Dimension(300, 60));
		btnPulsar.setFont(new Font("Arial", Font.PLAIN, 24));
		btnPulsar.addActionListener(this);

		lblPulsar = new JLabel("Llevas 0 clicks.");
		lblPulsar.setFont(new Font("Arial", Font.PLAIN, 30));

		add(btnPulsar);
		add(lblPulsar);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo04();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		pulsaciones++;
		lblPulsar.setText("Llevas " + pulsaciones + " clicks.");

	}

}
