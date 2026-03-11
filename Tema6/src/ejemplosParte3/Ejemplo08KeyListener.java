package ejemplosParte3;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo08KeyListener extends JFrame implements KeyListener {

	private int x = 50, y = 50; // Coordenadas de la imagen.
	private JLabel lblMovil; // Etiqueta que contiene la imagen.

	public Ejemplo08KeyListener() {

		super("StarTV");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);

		setLayout(null);

		addKeyListener(this);

		ImageIcon imgMovil = new ImageIcon("iconos/67.png");
		lblMovil = new JLabel(imgMovil);
		lblMovil.setBounds(x, y, 24, 24);

		add(lblMovil);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo08KeyListener();
	}

	@Override
	public void keyPressed(KeyEvent e) {

		// Cuando se pulse una de las teclas de dirección moveremos 5 px la
		// imagen en la dirección que toque.

		if (e.getKeyChar() == 'w') {
			y -= 5;
		} else if (e.getKeyChar() == 's') {
			y += 5;
		} else if (e.getKeyChar() == 'a') {
			x -= 5;
		} else if (e.getKeyChar() == 'd') {
			x += 5;
		}

		// El siguiente código evita que la tele se salga de la ventana.

		if (x < 0) {
			x = 0;
		} else if (x > getBounds().getWidth() - 24) {
			x = (int) getBounds().getWidth() - 24;
		}

		if (y < 0) {
			y = 0;
		} else if (y > getBounds().getHeight() - 61) {
			y = (int) getBounds().getHeight() - 61;
		}

		lblMovil.setBounds(x, y, 24, 24);
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// No utilizado.
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// No utilizado.
	}
}