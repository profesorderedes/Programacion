package actividades4;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ejercicio01 extends JFrame {
	private JLabel lblImagen;

	public Ejercicio01() {
		super("Fotogramas");
		setSize(540, 370);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		setLocationRelativeTo(null);

		// Panel superior con botones
		JPanel panelBotones = new JPanel(new FlowLayout());
		
		JButton btnBlackRain = new JButton("Black Rain");
		JButton btnElCaso = new JButton("El caso Winslow");
		JButton btnAsalto = new JButton("Asalto al distrito 13");
		JButton btnBlade = new JButton("Blade Runner");

		panelBotones.add(btnBlackRain);
		panelBotones.add(btnElCaso);
		panelBotones.add(btnAsalto);
		panelBotones.add(btnBlade);

		// Panel central con imagen
		JPanel panelImagen = new JPanel(new FlowLayout());

		lblImagen = new JLabel();
		lblImagen.setIcon(new ImageIcon("fotos/blade.png"));

		panelImagen.add(lblImagen);

		add(panelBotones, BorderLayout.NORTH);
		add(panelImagen, BorderLayout.CENTER);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejercicio01();
	}

}
