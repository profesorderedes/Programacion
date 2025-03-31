package ejemplos;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo13Iconos extends JFrame {

	public Ejemplo13Iconos() {

		super("Barras de herramientas");
		setSize(500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setLocationRelativeTo(null);

		// Para trabajar con una imagen, tenemos que crear un ImageIcon
		// asociado al archivo con la imagen.
		ImageIcon imgAbrir = new ImageIcon("iconos/openfile.gif");

		// Para ver la imagen, hay que asignársela a un JLabel o un JButton.
		JLabel lblAbrir = new JLabel(imgAbrir);

		JButton btnAbrir = new JButton("Abrir", imgAbrir);

		add(lblAbrir);
		add(btnAbrir);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo13Iconos();
	}

}
