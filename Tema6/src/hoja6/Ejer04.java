package hoja6;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class Ejer04 extends JFrame implements MouseListener {

	private JLabel mensaje;

	public Ejer04() {

		setTitle("Ejercicio 4");
		setSize(255, 255);
		setLayout(new FlowLayout());

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mensaje = new JLabel("Haz clic en la ventana");

		add(mensaje);

		addMouseListener(this);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejer04();

	}

	@Override

	public void mouseClicked(MouseEvent e) {

		int x = e.getX();
		int y = e.getY();

		Color color = new Color(0, x, y);

		mensaje.setForeground(color);

	}

	@Override

	public void mouseEntered(MouseEvent e) {

		mensaje.setForeground(Color.RED);

	}

	@Override

	public void mouseExited(MouseEvent e) {

		mensaje.setForeground(Color.BLACK);

	}

	@Override

	public void mousePressed(MouseEvent e) {
	}

	@Override

	public void mouseReleased(MouseEvent e) {
	}

}