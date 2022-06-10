import javax.swing.*;
import java.awt.*;

public class Ejemplo18 extends JFrame {

	public Ejemplo18() {

		super("Título");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Usamos un GridLayout para colocar componentes
		// formando una rejilla.
		setLayout(new GridLayout(2, 4, 30, 10));

		JButton btnBoton1 = new JButton("Botón 1");
		JButton btnBoton2 = new JButton("Botón 2");
		JButton btnBoton3 = new JButton("Botón 3");
		JButton btnBoton4 = new JButton("Botón 4");
		JButton btnBoton5 = new JButton("Botón 5");
		JButton btnBoton6 = new JButton("Botón 6");
		JButton btnBoton7 = new JButton("Botón 7");
		JButton btnBoton8 = new JButton("Botón 8");

		add(btnBoton1);
		add(btnBoton2);
		add(btnBoton3);
		add(btnBoton4);
		add(btnBoton5);
		add(btnBoton6);
		add(btnBoton7);
		add(btnBoton8);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo18();
	}

}
