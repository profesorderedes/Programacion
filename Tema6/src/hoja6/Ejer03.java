package hoja6;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejer03 extends JFrame implements ActionListener {

	// Crear componentes globales necesarios
	private JComboBox<String> cmbOrdenador;
	private JLabel lblImagen;
	private ImageIcon imgAmstrad, imgCommo64, imgCommoAmiga, imgSinclair;

	public Ejer03() {
		super("Ordenadores de 8 bits");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		// Crear listado con nombres de ordenadores
		String[] ordenadores = { "Amstrad CPC 464", "Commodore 64", "Commodore Amiga", "Sinclair ZX Spectrum" };
		cmbOrdenador = new JComboBox<>(ordenadores);
		cmbOrdenador.setPreferredSize(new Dimension(300, 25));
		cmbOrdenador.addActionListener(this);

		// Crear iconos para los imagenes
		imgAmstrad = new ImageIcon("imgs/ordenador1.png");
		imgCommo64 = new ImageIcon("imgs/ordenador2.png");
		imgCommoAmiga = new ImageIcon("imgs/ordenador3.png");
		imgSinclair = new ImageIcon("imgs/ordenador4.png");

		// Establecer imagen predefinido
		lblImagen = new JLabel(imgAmstrad);

		// Añadir listado e "imagen"
		add(cmbOrdenador);
		add(lblImagen);

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejer03 ventana = new Ejer03();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		ImageIcon[] imagenes = { imgAmstrad, imgCommo64, imgCommoAmiga, imgSinclair };

		// Cambiar imagen basado en el ordenador seleccionado
		lblImagen.setIcon(imagenes[cmbOrdenador.getSelectedIndex()]);

	}

}