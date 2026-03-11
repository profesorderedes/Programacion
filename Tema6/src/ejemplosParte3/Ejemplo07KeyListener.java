package ejemplosParte3;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo07KeyListener extends JFrame implements KeyListener {

	private JLabel lblMensaje;

	public Ejemplo07KeyListener() {

		super("KeyListener");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setLocationRelativeTo(null);

		lblMensaje = new JLabel("Pulsa alguna tecla...");
		lblMensaje.setFont(new Font("Arial", Font.PLAIN, 24));

		add(lblMensaje);

		addKeyListener(this);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo07KeyListener();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("Pulsado");
	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_UP) {
			lblMensaje.setText("Arriba");
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			lblMensaje.setText("Abajo");
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			lblMensaje.setText("Izquierda");
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			lblMensaje.setText("Derecha");
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}
