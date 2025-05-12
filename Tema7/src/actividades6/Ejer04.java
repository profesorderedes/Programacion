package actividades6;

import java.awt.Color;

import java.awt.FlowLayout;

import java.awt.event.MouseEvent;

import java.awt.event.MouseListener;

import javax.swing.JFrame;

import javax.swing.JLabel;

public class Ejer04 extends JFrame {

	private JLabel lblColor;

	public Ejer04() {

		super("Colores");
		setSize(255, 255);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLocationRelativeTo(null);

		setLayout(new FlowLayout());

		lblColor = new JLabel("COLOR");

		addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent arg0) {

			}

			@Override
			public void mousePressed(MouseEvent arg0) {

			}

			@Override
			public void mouseExited(MouseEvent arg0) {

				lblColor.setForeground(Color.BLACK);

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {

				lblColor.setForeground(Color.RED);

			}

			@Override
			public void mouseClicked(MouseEvent arg0) {

				int verde = arg0.getX();
				int azul = arg0.getY();

				lblColor.setForeground(new Color(0, verde, azul));

			}

		});

		add(lblColor);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejer04();

	}

}