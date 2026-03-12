package hoja5;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Ejer04 extends JFrame implements MouseListener {

	public Ejer04() {
		super("Paleta");
		setSize(255, 255);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setLocationRelativeTo(null);

		addMouseListener(this);

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejer04 ventana = new Ejer04();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int r = e.getX();
		int g = e.getY();

		getContentPane().setBackground(new Color(r, g, 0));
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		getContentPane().setBackground(Color.WHITE);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		getContentPane().setBackground(Color.WHITE);
	}
}