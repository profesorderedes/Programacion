package examen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ejer2 extends JFrame {

	public Ejer2() {
		super("Psicodelia");
		setSize(290, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JPanel panelSuperior = new JPanel();
		panelSuperior.setPreferredSize(new Dimension(270, 150));
		panelSuperior.setBackground(Color.GREEN);

		JTextArea txtColores = new JTextArea();
		JScrollPane scrColores = new JScrollPane(txtColores);
		scrColores.setPreferredSize(new Dimension(270, 90));

		panelSuperior.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseClicked(MouseEvent e) {

				int rojo = (int) (Math.random() * 256);
				int verde = (int) (Math.random() * 256);
				int azul = (int) (Math.random() * 256);

				panelSuperior.setBackground(new Color(rojo, verde, azul));

				txtColores.setText("Rojo: " + rojo + "\nVerde: " + verde + "\nAzul: " + azul);

			}
		});

		add(panelSuperior);
		add(scrColores);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejer2();
	}

}
