package actividades4;

import java.awt.*;
import javax.swing.*;

public class Ejer01b extends JFrame {

	public Ejer01b() {
		super("Fotogramas");
		setSize(650, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		// PANEL BOTONES

		JPanel panelBotones = new JPanel();

		JButton btnBlackRain = new JButton("Black Rain");
		JButton btnWinslow = new JButton("El caso Winslow");
		JButton btnAsalto = new JButton("Asalto al distrito 13");
		JButton btnBladeRunner = new JButton("Blade Runner");

		panelBotones.add(btnBlackRain);
		panelBotones.add(btnWinslow);
		panelBotones.add(btnAsalto);
		panelBotones.add(btnBladeRunner);

		// FOTOGRAFÍA ABAJO

		ImageIcon imgBladeRunner = new ImageIcon("iconos/bladerunner.jpg");
		JLabel lblimagen = new JLabel(imgBladeRunner);

		// VENTANA

		add(panelBotones, BorderLayout.NORTH);
		add(lblimagen, BorderLayout.CENTER);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejer01b();

	}

}