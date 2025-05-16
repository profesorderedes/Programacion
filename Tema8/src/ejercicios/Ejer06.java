package ejercicios;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Ejer06 extends JFrame {

	JLabel lblRuta;

	public Ejer06() {

		super("Rutas Archivo");
		setSize(500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		JMenuBar mnbMenu = new JMenuBar();

		JMenu mnMenu = new JMenu("File");

		JMenuItem mntAbrir = new JMenuItem("Open File");

		lblRuta = new JLabel();

		mntAbrir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				leerRuta("open");

			}

		});

		JMenuItem mntGuardar = new JMenuItem("Save File");
		mntGuardar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				leerRuta("save");

			}

		});

		mnbMenu.add(mnMenu);
		mnMenu.add(mntAbrir);
		mnMenu.add(mntGuardar);

		add(lblRuta);

		setJMenuBar(mnbMenu);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejer06();

	}

	private void leerRuta(String accion) {

		JFileChooser elegir = new JFileChooser();

		int eleccion;
		if (accion.equals("open")) {
			eleccion = elegir.showOpenDialog(null);
		} else {
			eleccion = elegir.showSaveDialog(null);
		}

		if (eleccion == JFileChooser.APPROVE_OPTION) {

			lblRuta.setText(elegir.getSelectedFile().toString());

		}

	}

}