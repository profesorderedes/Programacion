package ejemplos;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ejemplo01 extends JFrame {

	public Ejemplo01() {

		super("Mi primera ventana");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Configuramos un layout en la ventana.
		FlowLayout layout = new FlowLayout();
		setLayout(layout);
		
		// Creamos los componentes a la ventana.
		JButton btnAceptar = new JButton("Aceptar");
		JButton btnCancelar = new JButton("Cancelar");
		
		// Añadimos los componentes a la ventana.
		add(btnAceptar);
		add(btnCancelar);

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo01 miVentana = new Ejemplo01();
	}

}
