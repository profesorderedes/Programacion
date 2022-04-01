import javax.swing.*;
import java.awt.*;

public class Ejemplo20 extends JFrame {

	public Ejemplo20() {

		super("Título");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		JButton btnBotonNorte = new JButton("NORTE");
		JButton btnBotonOeste = new JButton("OESTE");
		JButton btnBotonEste = new JButton("ESTE");
		JButton btnBotonCentro = new JButton("CENTRO");
		JButton btnBotonSur = new JButton("SUR");

		add(btnBotonNorte, BorderLayout.NORTH);
		add(btnBotonOeste, BorderLayout.WEST);
		add(btnBotonEste, BorderLayout.EAST);
		add(btnBotonCentro, BorderLayout.CENTER);
		add(btnBotonSur, BorderLayout.SOUTH);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo20();
	}

}
