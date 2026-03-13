package ejemplosParte3ClasesAnonimas;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo06KeyListener extends JFrame {

	private JLabel lblMensaje;

	public Ejemplo06KeyListener() {

		super("KeyListener");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setLocationRelativeTo(null);

		lblMensaje = new JLabel("Pulsa alguna tecla...");
		lblMensaje.setFont(new Font("Arial", Font.PLAIN, 24));

		add(lblMensaje);

		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				letraPulsada(e);
			}

			@Override
			public void keyReleased(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {

			}
		});

		setVisible(true);

	}
	
	public void letraPulsada(KeyEvent e) {
		
		// Pasamos la letra a minúsculas.
		char letra = e.getKeyChar();
		String cadena = letra + "";
		cadena = cadena.toLowerCase();
		letra = cadena.charAt(0);

		// Según qué letra sea, indicamos un movimiento.
		if (letra == 'w') {
			lblMensaje.setText("Arriba");
		} else if (letra == 's') {
			lblMensaje.setText("Abajo");
		} else if (letra == 'a') {
			lblMensaje.setText("Izquierda");
		} else if (letra == 'd') {
			lblMensaje.setText("Derecha");
		}
		
	}

	public static void main(String[] args) {
		new Ejemplo06KeyListener();
	}

}
