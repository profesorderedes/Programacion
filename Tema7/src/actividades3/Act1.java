package actividades3;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class Act1 extends JFrame {

	public Act1() {

		super("Planificador personal");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		setLocationRelativeTo(null);

		ImageIcon iconoEstadistica = new ImageIcon("iconos/11.png");
		ImageIcon iconoGuardar = new ImageIcon("iconos/22.png");
		ImageIcon iconoAyuda = new ImageIcon("iconos/3.png");
		ImageIcon iconoCalendario = new ImageIcon("iconos/44.png");
		ImageIcon iconoFoto = new ImageIcon("iconos/66.png");
		ImageIcon iconoTV = new ImageIcon("iconos/67.png");
		ImageIcon iconoConfiguracion = new ImageIcon("iconos/73.png");

		JButton btnNuevo = new JButton(new ImageIcon("iconos/1.png"));
		JButton btnEstadistica = new JButton(iconoEstadistica);
		JButton btnGuardar = new JButton(iconoGuardar);
		JButton btnAyuda = new JButton(iconoAyuda);
		JButton btnCalendario = new JButton(iconoCalendario);
		JButton btnFoto = new JButton(iconoFoto);
		JButton btnTV = new JButton(iconoTV);
		JButton btnConfiguracion = new JButton(iconoConfiguracion);

		JToolBar barraHerramientas = new JToolBar();

		barraHerramientas.add(btnNuevo);
		barraHerramientas.add(btnEstadistica);
		barraHerramientas.add(btnGuardar);
		barraHerramientas.add(btnAyuda);
		barraHerramientas.addSeparator();
		barraHerramientas.add(btnCalendario);
		barraHerramientas.add(btnFoto);
		barraHerramientas.add(btnTV);
		barraHerramientas.addSeparator();
		barraHerramientas.add(btnConfiguracion);

		add(barraHerramientas, BorderLayout.NORTH);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Act1();

	}

}