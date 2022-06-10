package actividades5;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejer02 extends JFrame {

	private JLabel lblColor;

	public Ejer02() {

		super("Letras - Colores");
		setSize(300, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		lblColor = new JLabel("COLOR");

		add(lblColor);

		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

				// Convertimos el carácter a minúsculas.
				String cadena = ("" + e.getKeyChar()).toLowerCase();
				char caracter = cadena.charAt(0);

				if (caracter == 'r') {

					lblColor.setForeground(Color.RED);

					lblColor.setText("ROJO");

				} else if (caracter == 'a') {

					lblColor.setForeground(Color.BLUE);

					lblColor.setText("AZUL");

				} else if (caracter == 'v') {

					lblColor.setForeground(Color.GREEN);

					lblColor.setText("VERDE");

				}

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejer02();
	}

}