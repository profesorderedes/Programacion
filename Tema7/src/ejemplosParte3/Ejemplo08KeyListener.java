package ejemplosParte3;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ejemplo08KeyListener extends JFrame implements KeyListener {

	private JLabel lblMensaje;

	public Ejemplo08KeyListener() {

		super("KeyListener");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		addKeyListener(this);

		lblMensaje = new JLabel();

		add(lblMensaje);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo08KeyListener();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {

		// Se mostrará en el JLabel un mensaje indicando qué tecla de flecha
		// se ha pulsado.
		int codigo = arg0.getKeyCode();

		if (codigo == KeyEvent.VK_UP) {
			lblMensaje.setText("Has pulsado FLECHA ARRIBA.");
		} else if (codigo == KeyEvent.VK_DOWN) {
			lblMensaje.setText("Has pulsado FLECHA ABAJO.");
		} else if (codigo == KeyEvent.VK_LEFT) {
			lblMensaje.setText("Has pulsado FLECHA IZQUIERDA.");
		} else if (codigo == KeyEvent.VK_RIGHT) {
			lblMensaje.setText("Has pulsado FLECHA DERECHA.");
		} else {
			lblMensaje.setText("No has pulsado ninguna tecla de dirección.");
		}

	}

	@Override
	public void keyReleased(KeyEvent arg0) {

	}

	@Override
	public void keyTyped(KeyEvent arg0) {

	}

}
