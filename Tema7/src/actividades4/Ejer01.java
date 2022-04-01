package actividades4;

import java.awt.*;
import javax.swing.*;

public class Ejer01 extends JFrame {

	public Ejer01() {
		super("Fotogramas");
		setSize(650, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

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

		add(panelBotones);
		add(lblimagen);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejer01();

	}

}