
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejemplo27 extends JFrame {

	public Ejemplo27() {

		super("Pulsaciones");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel lblPulsado = new JLabel();

		JButton btnPulsame = new JButton("Púlsame!");

		// Usamos en este caso una clase interna anónima
		// para manejar el evento de pulsar el botón.
		btnPulsame.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				lblPulsado.setText("Bien!!!");

			}
		});

		add(btnPulsame);
		add(lblPulsado);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo27();
	}

}
