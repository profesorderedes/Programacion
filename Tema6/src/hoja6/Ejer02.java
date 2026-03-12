package hoja6;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Ejer02 extends JFrame {

	public Ejer02() {

		super("Salpicadero");
		setSize(450, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		try {

			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(this);

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			System.out.println("Error al cambiar el lookAndFeel");
		}

		setLayout(new GridLayout(1, 2, 0, 5));

		setLocationRelativeTo(null);

		// Configuración parte izquierdo
		JPanel panelLeft = new JPanel(new FlowLayout());

		JSlider sldVelocidad = new JSlider(0, 180, 30);
		sldVelocidad.setMajorTickSpacing(30);
		sldVelocidad.setMinorTickSpacing(10);
		sldVelocidad.setPaintTicks(true);
		sldVelocidad.setPaintLabels(true);

		panelLeft.add(new JLabel("Velocidad"));
		panelLeft.add(sldVelocidad);

		// Configuración parte derecha

		JPanel panelRight = new JPanel(new FlowLayout(FlowLayout.LEFT));

		JButton btnArrancar = new JButton("Arrancar");
		JButton btnParar = new JButton("Parar");
		JButton btnFrenoEstacionamiento = new JButton("Freno estacionamiento");

		Dimension tamanyoBotones = new Dimension(200, 27);

		btnArrancar.setPreferredSize(tamanyoBotones);
		btnParar.setPreferredSize(tamanyoBotones);
		btnFrenoEstacionamiento.setPreferredSize(tamanyoBotones);

		panelRight.add(new JLabel("Controles del vehículo"));
		panelRight.add(btnArrancar);
		panelRight.add(btnParar);
		panelRight.add(btnFrenoEstacionamiento);

		// Añadir paneles

		add(panelLeft);
		add(panelRight);

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejer02 ventana = new Ejer02();
	}
}