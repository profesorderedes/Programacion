package ejemplosParte2;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejemplo03GridLayout extends JFrame {

	public Ejemplo03GridLayout() {

		super("Biblioteca");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(390, 150);

		// Dividimos la ventana en una fila y dos columnas.
		setLayout(new GridLayout(1, 2, 10, 10));

		// CASILLA IZQUIERDA

		JPanel panelDatos = new JPanel();

		panelDatos.setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel lblTitulo = new JLabel("Título");
		JTextField txtTitulo = new JTextField(15);
		JLabel lblAutor = new JLabel("Autor");
		JTextField txtAutor = new JTextField(15);

		panelDatos.add(lblTitulo);
		panelDatos.add(txtTitulo);
		panelDatos.add(lblAutor);
		panelDatos.add(txtAutor);

		// CASILLA DERECHA

		JPanel panelBotones = new JPanel();
		panelBotones.setLayout(new GridLayout(2, 1));

		// CASILLA DERECHA ARRIBA

		JPanel panelAlta = new JPanel();

		JButton btnAlta = new JButton("Alta");

		panelAlta.add(btnAlta);

		// CASILLA DERECHA ABAJO

		JPanel panelBaja = new JPanel();

		JButton btnBaja = new JButton("Baja");

		panelBaja.add(btnBaja);

		panelBotones.add(panelAlta);
		panelBotones.add(panelBaja);

		// VENTANA

		add(panelDatos);
		add(panelBotones);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejemplo03GridLayout();
	}

}
