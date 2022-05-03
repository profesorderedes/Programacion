package actividades6;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ejer03 extends JFrame implements ItemListener {

	private String[] ordenadores = { "Amstrad CPC 464", "Commodore 64", "Commodore Amiga", "Sinclair ZX Spectrum" };
	private JComboBox<String> cmbOrdenadores;

	private JLabel lblImagen;
	private ImageIcon ordenador1;
	private ImageIcon ordenador2;
	private ImageIcon ordenador3;
	private ImageIcon ordenador4;

	public Ejer03() {
		super("Ordenadores");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		// Panel superior
		JPanel panelSuperior = new JPanel();

		cmbOrdenadores = new JComboBox<>(ordenadores);
		cmbOrdenadores.setPreferredSize(new Dimension(350,22));
		cmbOrdenadores.addItemListener(this);
		
		panelSuperior.add(cmbOrdenadores);

		// Panel inferior.
		JPanel panelInferior = new JPanel();
		
		ordenador1 = new ImageIcon("imgs/ordenador1.jpg");
		ordenador2 = new ImageIcon("imgs/ordenador2.jpg");
		ordenador3 = new ImageIcon("imgs/ordenador3.jpg");
		ordenador4 = new ImageIcon("imgs/ordenador4.jpg");

		lblImagen = new JLabel(ordenador1);
		
		panelInferior.add(lblImagen);

		// Ventana.
		add(panelSuperior, BorderLayout.NORTH);
		add(panelInferior, BorderLayout.CENTER);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejer03();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		int ordenador = cmbOrdenadores.getSelectedIndex();

		if (ordenador == 0) {
			lblImagen.setIcon(ordenador1);
		} else if (ordenador == 1) {
			lblImagen.setIcon(ordenador2);
		} else if (ordenador == 2) {
			lblImagen.setIcon(ordenador3);
		} else if (ordenador == 3) {
			lblImagen.setIcon(ordenador4);
		}
	}

}