package actividades4;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ejer01 extends JFrame implements ActionListener {

	private JButton btnBlackRain;
	private JButton btnWinslow;
	private JButton btnAsalto;
	private JButton btnBladeRunner;
	private ImageIcon imgBladeRunner;
	private ImageIcon imgWinslow;
	private ImageIcon imgAsalto;
	private ImageIcon imgBlackRain;

	private JLabel lblimagen;

	public Ejer01() {
		super("Fotogramas");
		setSize(650, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		// PANEL BOTONES

		JPanel panelBotones = new JPanel();

		btnBlackRain = new JButton("Black Rain");
		btnBlackRain.addActionListener(this);

		btnWinslow = new JButton("El caso Winslow");
		btnWinslow.addActionListener(this);

		btnAsalto = new JButton("Asalto al distrito 13");
		btnAsalto.addActionListener(this);

		btnBladeRunner = new JButton("Blade Runner");
		btnBladeRunner.addActionListener(this);

		panelBotones.add(btnBlackRain);
		panelBotones.add(btnWinslow);
		panelBotones.add(btnAsalto);
		panelBotones.add(btnBladeRunner);

		// FOTOGRAFÍA ABAJO

		imgBladeRunner = new ImageIcon("iconos/bladerunner.jpg");
		imgWinslow = new ImageIcon("iconos/the-winslow-boy.jpg");
		imgAsalto = new ImageIcon("iconos/distrito13.jpg");
		imgBlackRain = new ImageIcon("iconos/blackrain.jpg");

		lblimagen = new JLabel(imgBladeRunner);

		// VENTANA

		add(panelBotones);
		add(lblimagen);

		setVisible(true);
		btnBladeRunner.requestFocus();

	}

	public static void main(String[] args) {

		new Ejer01();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton boton = (JButton) e.getSource();

		if (boton == btnBladeRunner) {
			lblimagen.setIcon(imgBladeRunner);
		} else if (boton == btnWinslow) {
			lblimagen.setIcon(imgWinslow);

		} else if (boton == btnAsalto) {
			lblimagen.setIcon(imgAsalto);
		} else {
			lblimagen.setIcon(imgBlackRain);
		}

	}

}