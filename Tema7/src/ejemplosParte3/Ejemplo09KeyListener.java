package ejemplosParte3;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo09KeyListener extends JFrame implements KeyListener {

	private JLabel lblTv;
	private int x, y;

	public Ejemplo09KeyListener() {

		super("Star TV");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(null);

		setLocationRelativeTo(null);

		addKeyListener(this);

		x = 50;
		y = 50;

		ImageIcon imgTv = new ImageIcon("iconos/67.png");
		lblTv = new JLabel(imgTv);
		lblTv.setBounds(x, y, 24, 24);

		add(lblTv);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo09KeyListener();
	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	// Ejercicio: impedir que la tele se salga de la ventana.
	@Override
	public void keyTyped(KeyEvent e) {

		if (e.getKeyChar() == 'w' && y > 0) {
			y = y - 5;
		} else if (e.getKeyChar() == 's' && y < 235) {
			y = y + 5;
		} else if (e.getKeyChar() == 'a' && x > 0) {
			x = x - 5;
		} else if (e.getKeyChar() == 'd' && x < 375) {
			x = x + 5;
		}

		lblTv.setBounds(x, y, 24, 24);
	}

}
