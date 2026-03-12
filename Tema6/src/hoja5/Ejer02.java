package hoja5;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejer02 extends JFrame implements KeyListener {

	private JLabel lblColor;

	public Ejer02() {

		super("Letras - Colores");
		setSize(250, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.CENTER));

		setLocationRelativeTo(null);

		lblColor = new JLabel("COLOR");

		addKeyListener(this);

		add(lblColor);

		setVisible(true);

	}

	public static void main(String[] args) {

		Ejer02 ventana = new Ejer02();

	}

	@Override

	public void keyTyped(KeyEvent e) {

		if (e.getKeyChar() == 'r') {

			lblColor.setText("ROJO");
			lblColor.setForeground(Color.RED);

		} else if (e.getKeyChar() == 'a') {

			lblColor.setText("AZUL");
			lblColor.setForeground(Color.BLUE);

		} else if (e.getKeyChar() == 'v') {

			lblColor.setText("VERDE");
			lblColor.setForeground(Color.GREEN);

		}

	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}