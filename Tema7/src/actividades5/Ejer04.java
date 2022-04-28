package actividades5;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ejer04 extends JFrame {
	private int rojo, verde = 0;

	public Ejer04() {
		super("Paleta");
		setSize(255, 255);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
// setLayout(new FlowLayout());
		JPanel panel = new JPanel();
		addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
				rojo = e.getX();
				verde = e.getY();
				panel.setBackground(new Color(rojo, verde, 0));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				panel.setBackground(Color.white);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				panel.setBackground(Color.white);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		add(panel);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejer04();
	}
}