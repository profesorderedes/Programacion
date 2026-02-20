package ejemplos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class Ejemplo14ToolBar extends JFrame {

	public Ejemplo14ToolBar() {
		super("Barra de herramientas");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		BorderLayout layout = new BorderLayout();
		setLayout(layout);

		setLocationRelativeTo(null);

		JToolBar barraHerramientas = new JToolBar();

		JButton btnIpod = new JButton(new ImageIcon("iconos/39.png"));
		JButton btnWalkie = new JButton(new ImageIcon("iconos/40.png"));
		JButton btnCalculadora = new JButton(new ImageIcon("iconos/41.png"));
		JButton btnCalendario = new JButton(new ImageIcon("iconos/43.png"));

		barraHerramientas.add(btnIpod);
		barraHerramientas.add(btnWalkie);
		barraHerramientas.add(btnCalculadora);
		barraHerramientas.addSeparator();
		barraHerramientas.add(btnCalendario);

		add(barraHerramientas, BorderLayout.NORTH);

		setVisible(true);
	}

	public static void main(String[] args) {
		Ejemplo14ToolBar plantilla = new Ejemplo14ToolBar();
	}

}
