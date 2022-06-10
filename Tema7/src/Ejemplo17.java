import javax.swing.*;
import java.awt.*;

public class Ejemplo17 extends JFrame {

	public Ejemplo17() {

		super("Título");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Establecemos una separación de 30px en horizontal
		// y 10px en vertical.
		setLayout(new FlowLayout(FlowLayout.LEFT, 30, 10));

		JButton btnBoton1 = new JButton("Botón 1");
		JButton btnBoton2 = new JButton("Botón 2");
		JButton btnBoton3 = new JButton("Botón 3");
		JButton btnBoton4 = new JButton("Botón 4");
		JButton btnBoton5 = new JButton("Botón 5");
		JButton btnBoton6 = new JButton("Botón 6");
		JButton btnBoton7 = new JButton("Botón 7");
		JButton btnBoton8 = new JButton("Botón 8");
		JButton btnBoton9 = new JButton("Botón 9");
		JButton btnBoton10 = new JButton("Botón 10");

		add(btnBoton1);
		add(btnBoton2);
		add(btnBoton3);
		add(btnBoton4);
		add(btnBoton5);
		add(btnBoton6);
		add(btnBoton7);
		add(btnBoton8);
		add(btnBoton9);
		add(btnBoton10);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo17();
	}

}
