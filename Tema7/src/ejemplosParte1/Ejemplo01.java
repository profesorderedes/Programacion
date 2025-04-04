package ejemplosParte1;

import javax.swing.JFrame;

public class Ejemplo01 extends JFrame {

	public Ejemplo01() {

		super("Hola, Mundo");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setVisible(true);

	}

	public static void main(String[] args) {

		Ejemplo01 ventana = new Ejemplo01();

	}

}
