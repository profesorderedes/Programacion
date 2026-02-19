package ejemplos;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Ejemplo13 extends JFrame {

	public Ejemplo13() {

		super("Iconos");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		setLayout(layout);

		try {

			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			System.out.println("Error al cambiar el lookandfeel.");
		}

		setLocationRelativeTo(null);

		ImageIcon imgAdvertencia = new ImageIcon("iconos/89.png");

		JButton btnAdvertencia = new JButton(imgAdvertencia);
		JButton btnAdvertencia2 = new JButton("¡Cuidado!", imgAdvertencia);

		ImageIcon imgNotas = new ImageIcon("iconos/47.png");

		JButton btnNotas = new JButton(imgNotas);
		JButton btnNotas2 = new JButton("Música", imgNotas);

		add(btnAdvertencia);
		add(btnAdvertencia2);

		add(btnNotas);
		add(btnNotas2);

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo13 plantilla = new Ejemplo13();
	}

}
