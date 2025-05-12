package actividades6;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ejer03 extends JFrame {

	private JLabel lblImagen;

	private JComboBox cbOpciones;

	public Ejer03() {

		super("Ordenadores de 8 bits");
		setSize(450, 350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		setLocationRelativeTo(null);

		JPanel panelSuperior = new JPanel();

		String[] eleccion = { "Amstrad CPC 464", "Commodore 64", "Commodore Amiga", "Sinclair ZX Spectrum" };

		cbOpciones = new JComboBox<>(eleccion);
		cbOpciones.setPreferredSize(new Dimension(400, 20));

		lblImagen = new JLabel(new ImageIcon("ordenadores/ordenador1.jpeg"));
		cbOpciones.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int imagenSeleccionada = cbOpciones.getSelectedIndex() + 1;
				lblImagen.setIcon((new ImageIcon("ordenadores/ordenador" + imagenSeleccionada + ".jpeg")));

			}
		});

		panelSuperior.add(cbOpciones);

		JPanel panelCentral = new JPanel();

		panelCentral.add(lblImagen);

		add(panelSuperior, BorderLayout.NORTH);
		add(panelCentral, BorderLayout.CENTER);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejer03();

	}

}