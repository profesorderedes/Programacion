package actividades6;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class Ejer02 extends JFrame {

	public Ejer02() {

		super("Salpicadero");
		setSize(400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setLocationRelativeTo(null);

		JPanel panelIzquierdo = new JPanel();
		panelIzquierdo.setPreferredSize(new Dimension(200, 150));
		panelIzquierdo.setLayout(new BorderLayout());

		JLabel lblVelocidad = new JLabel("Velocidad", JLabel.CENTER);

		JSlider sldVelocidad = new JSlider(0, 180, 30);
		sldVelocidad.setMajorTickSpacing(30);
		sldVelocidad.setPaintTicks(true);
		sldVelocidad.setPaintLabels(true);

		panelIzquierdo.add(lblVelocidad, BorderLayout.NORTH);
		panelIzquierdo.add(sldVelocidad, BorderLayout.CENTER);

		JPanel panelDerecho = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelDerecho.setPreferredSize(new Dimension(180, 150));

		JLabel lblControles = new JLabel("Controles del vehículo");

		JButton btnArrancar = new JButton("Arrancar");
		JButton btnParar = new JButton("Parar");
		JButton btnFreno = new JButton("Freno Estacionamiento");

		btnArrancar.setPreferredSize(new Dimension(160, 25));
		btnParar.setPreferredSize(new Dimension(160, 25));
		btnFreno.setPreferredSize(new Dimension(160, 25));

		panelDerecho.add(lblControles);
		panelDerecho.add(btnArrancar);
		panelDerecho.add(btnParar);
		panelDerecho.add(btnFreno);

		add(panelIzquierdo);
		add(panelDerecho);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejer02();

	}

}