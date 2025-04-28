package actividades5;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejer02 extends JFrame {

	public Ejer02() {

		super("Texto decorado");
		setSize(400, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		JLabel lblColor = new JLabel("COLOR");

		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent arg0) {
				
				if (arg0.getKeyChar() == 'r') {
					lblColor.setText("ROJO");
					lblColor.setForeground(Color.RED);
				} else if (arg0.getKeyChar() == 'a') {
					lblColor.setText("AZUL");
					lblColor.setForeground(Color.BLUE);
				} else if (arg0.getKeyChar() == 'v') {
					lblColor.setText("VERDE");
					lblColor.setForeground(Color.GREEN);
				}
			}

			@Override
			public void keyReleased(KeyEvent arg0) {

			}

			@Override
			public void keyPressed(KeyEvent arg0) {

			}
		});

		add(lblColor);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejer02();
	}
}