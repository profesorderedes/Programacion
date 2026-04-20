
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import net.miginfocom.swing.MigLayout;

public class EditorPersonajes extends JFrame {

	public EditorPersonajes() {

		super("Personajes del juego");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		try {

			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			System.out.println("Error al cambiar el look and feel");
		}

		setResizable(false);

		setLayout(new MigLayout("insets 10"));

		JButton btnAnterior = new JButton(new ImageIcon("imgsPersonajes/flecha_izq.png"));
		btnAnterior.setEnabled(false);

		JTextField txtNick = new JTextField("Carolus");
		txtNick.setFont(new Font("Helvetica", Font.PLAIN, 12));

		txtNick.setPreferredSize(new Dimension(200, txtNick.getSize().height));

		JTextField txtRol = new JTextField("Mago");
		txtRol.setPreferredSize(new Dimension(200, txtRol.getSize().height));

		JTextField txtInicio = new JTextField("2026-04-01");
		txtInicio.setPreferredSize(new Dimension(200, txtInicio.getSize().height));

		JSlider sldFuerza = new JSlider(JSlider.HORIZONTAL, 0, 10, 3);
		sldFuerza.setMajorTickSpacing(2);
		sldFuerza.setMinorTickSpacing(1);
		sldFuerza.setPaintLabels(true);
		sldFuerza.setPaintTicks(true);

		JSlider sldSalud = new JSlider(JSlider.HORIZONTAL, 0, 10, 4);
		sldSalud.setMajorTickSpacing(2);
		sldSalud.setMinorTickSpacing(1);
		sldSalud.setPaintLabels(true);
		sldSalud.setPaintTicks(true);

		JSlider sldArmadura = new JSlider(JSlider.HORIZONTAL, 0, 10, 1);
		sldArmadura.setMajorTickSpacing(2);
		sldArmadura.setMinorTickSpacing(1);
		sldArmadura.setPaintLabels(true);
		sldArmadura.setPaintTicks(true);

		JSlider sldMagia = new JSlider(JSlider.HORIZONTAL, 0, 10, 7);
		sldMagia.setMajorTickSpacing(2);
		sldMagia.setMinorTickSpacing(1);
		sldMagia.setPaintLabels(true);
		sldMagia.setPaintTicks(true);

		JLabel lblAvatar = new JLabel(new ImageIcon("imgsPersonajes/mago.png"));
		lblAvatar.setBorder(BorderFactory.createLineBorder(Color.GRAY));

		JButton btnSiguiente = new JButton(new ImageIcon("imgsPersonajes/flecha_der.png"));

		add(btnAnterior, "span 1 15, gap right 30");

		add(new JLabel("Nick"));

		add(lblAvatar, "span 1 15");
		add(btnSiguiente, "span 1 15, gap left 30, wrap");

		add(txtNick, "wrap, skip 1, gap right 50");

		add(new JLabel("Rol"), "wrap, skip 1");
		add(txtRol, "wrap, skip 1");

		add(new JLabel("Inicio"), "wrap, skip 1");
		add(txtInicio, "wrap, skip 1");

		add(new JLabel("Fuerza"), "wrap, skip 1");
		add(sldFuerza, "wrap, skip 1");

		add(new JLabel("Salud"), "wrap, skip 1");
		add(sldSalud, "wrap, skip 1");

		add(new JLabel("Armadura"), "wrap, skip 1");
		add(sldArmadura, "wrap, skip 1");

		add(new JLabel("Magia"), "wrap, skip 1");
		add(sldMagia, "wrap, skip 1");

		pack();

		setLocationRelativeTo(null);

		setVisible(true);

	}

	public static void main(String[] args) {
		new EditorPersonajes();
	}

}
