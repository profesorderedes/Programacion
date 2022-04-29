package actividades6;

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
		setSize(470, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		JPanel panel1 = new JPanel();

		JLabel lblVelocidad = new JLabel("Velocidad");
		JSlider sldVelocidad = new JSlider(0, 180, 30);
		sldVelocidad.setMinorTickSpacing(10);
		sldVelocidad.setMajorTickSpacing(30);
		sldVelocidad.setPaintTicks(true);
		sldVelocidad.setPaintLabels(true);

		panel1.add(lblVelocidad);
		panel1.add(sldVelocidad);

		panel1.setPreferredSize(new Dimension(225, 180));

		JPanel panel2 = new JPanel();

		JLabel lblControles = new JLabel("Controles del vehículo");
		JButton btnArrancar = new JButton("Arrancar");
		JButton btnParar = new JButton("Parar");
		JButton btnFreno = new JButton("Freno Estacionamiento");

		panel2.add(lblControles);
		panel2.add(btnArrancar);
		panel2.add(btnParar);
		panel2.add(btnFreno);

		btnArrancar.setPreferredSize(new Dimension(200, 25));
		btnParar.setPreferredSize(new Dimension(200, 25));
		btnFreno.setPreferredSize(new Dimension(200, 25));

		panel2.setPreferredSize(new Dimension(225, 180));
		panel2.setLayout(new FlowLayout(FlowLayout.LEFT));

		add(panel1);
		add(panel2);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejer02();
	}

}