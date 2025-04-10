package actividades4;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ejer01 extends JFrame implements ActionListener {

	private JLabel lblImagen;
	private JButton btnMalditos;
	private JButton btnKill;
	private JButton btnShutter;
	private JButton btnDiario;
	private JButton btnFear;

	public Ejer01() {
		super("Fotogramas");
		setSize(640, 470);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		setLocationRelativeTo(null);

		// Panel superior con botones
		JPanel panelBotones = new JPanel(new FlowLayout());

		btnMalditos = new JButton("Malditos bastardos");
		btnMalditos.addActionListener(this);

		btnKill = new JButton("Kill Bill");
		btnKill.addActionListener(this);

		btnShutter = new JButton("Shutter island");
		btnShutter.addActionListener(this);

		btnDiario = new JButton("El diario de Noa");
		btnDiario.addActionListener(this);

		btnFear = new JButton("Primal Fear");
		btnFear.addActionListener(this);

		panelBotones.add(btnMalditos);
		panelBotones.add(btnKill);
		panelBotones.add(btnShutter);
		panelBotones.add(btnDiario);
		panelBotones.add(btnFear);

		// Panel central con imagen
		JPanel panelImagen = new JPanel(new FlowLayout());

		lblImagen = new JLabel(new ImageIcon("fotogramas/img01.jpg"));

		panelImagen.add(lblImagen);

		add(panelBotones, BorderLayout.NORTH);
		add(panelImagen, BorderLayout.CENTER);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejer01();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton boton = (JButton) e.getSource();

		if (boton == btnMalditos) {

			lblImagen.setIcon(new ImageIcon("fotogramas/img01.jpg"));

		} else if (boton == btnKill) {

			lblImagen.setIcon(new ImageIcon("fotogramas/img02.jpg"));

		} else if (boton == btnShutter) {

			lblImagen.setIcon(new ImageIcon("fotogramas/img03.jpg"));

		} else if (boton == btnDiario) {

			lblImagen.setIcon(new ImageIcon("fotogramas/img04.jpg"));

		} else {

			lblImagen.setIcon(new ImageIcon("fotogramas/img05.jpg"));

		}
	}

}