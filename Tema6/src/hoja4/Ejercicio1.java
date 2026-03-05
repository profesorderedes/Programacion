package hoja4;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejercicio1 extends JFrame implements ActionListener {

	private JButton btnJDH, btnPR, btnLM, btnDG;
	private JLabel lblImagen;

	public Ejercicio1() {

		super("Películas");
		setSize(650, 350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		setLayout(layout);

		setLocationRelativeTo(null);

		btnJDH = new JButton("Los Juegos Del Hambre");
		btnJDH.addActionListener(this);

		btnPR = new JButton("Pacific Rim");
		btnPR.addActionListener(this);

		btnLM = new JButton("La Monja");
		btnLM.addActionListener(this);

		btnDG = new JButton("Divergente");
		btnDG.addActionListener(this);

		lblImagen = new JLabel(new ImageIcon("imagenes/PacificRim.png"));

		add(btnPR);
		add(btnJDH);
		add(btnDG);
		add(btnLM);
		add(lblImagen);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejercicio1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnPR) {
			lblImagen.setIcon(new ImageIcon("imagenes/PacificRim.png"));
		} else if (e.getSource() == btnJDH) {
			lblImagen.setIcon(new ImageIcon("imagenes/JuegosDelHambre.jpeg"));
		} else if (e.getSource() == btnDG) {
			lblImagen.setIcon(new ImageIcon("imagenes/Divergente.png"));
		} else if (e.getSource() == btnLM) {
			lblImagen.setIcon(new ImageIcon("imagenes/LaMonja.png"));
		}

	}

}
