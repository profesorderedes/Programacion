package ejemplosParte3;

import java.awt.FlowLayout;
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

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		addKeyListener(this);

		lblMensaje = new JLabel();
		
		add(lblMensaje);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo07KeyListener();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {

	}

	@Override
	public void keyReleased(KeyEvent arg0) {

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		lblMensaje.setText("Has pulsado " + arg0.getKeyChar());
		
		// Si el usuario pulsa la letra A, se le muestra un panel de diálogo 
		// que diga "Felicidades".
		if() {
			
		}
		
	}

}







