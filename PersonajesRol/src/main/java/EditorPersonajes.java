
import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import net.miginfocom.swing.MigLayout;

public class EditorPersonajes extends JFrame {

	private List<Personaje> personajes;

	private JTextField txtNick, txtRol, txtInicio;
	private JSlider sldFuerza, sldSalud, sldArmadura, sldMagia;
	private JLabel lblAvatar;

	public EditorPersonajes() {

		super("Personajes del juego");
		try {

			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			System.out.println("Error al cambiar el look and feel");
		}

		try {
			personajes = AccesoPersonajes.leer();
		} catch (ParserConfigurationException | SAXException | IOException e) {
			JOptionPane.showMessageDialog(null, "Se ha producido un error al leer el archivo de personajes.",
					"Personajes del juego", JOptionPane.ERROR_MESSAGE);
			return;
		}

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setResizable(false);

		setLayout(new MigLayout("insets 10"));

		JButton btnAnterior = new JButton(new ImageIcon("imgsPersonajes/flecha_izq.png"));
		btnAnterior.setEnabled(false);

		txtNick = new JTextField(personajes.get(0).getNick());
		txtNick.setPreferredSize(new Dimension(200, txtNick.getSize().height));

		txtRol = new JTextField(personajes.get(0).getRol());
		txtRol.setPreferredSize(new Dimension(200, txtRol.getSize().height));

		txtInicio = new JTextField(personajes.get(0).getInicio().toString());
		txtInicio.setPreferredSize(new Dimension(200, txtInicio.getSize().height));

		sldFuerza = new JSlider(JSlider.HORIZONTAL, 0, 10, personajes.get(0).getCaracteristicas().get("fuerza"));
		sldFuerza.setMajorTickSpacing(2);
		sldFuerza.setMinorTickSpacing(1);
		sldFuerza.setPaintLabels(true);
		sldFuerza.setPaintTicks(true);

		sldSalud = new JSlider(JSlider.HORIZONTAL, 0, 10, personajes.get(0).getCaracteristicas().get("salud"));
		sldSalud.setMajorTickSpacing(2);
		sldSalud.setMinorTickSpacing(1);
		sldSalud.setPaintLabels(true);
		sldSalud.setPaintTicks(true);

		sldArmadura = new JSlider(JSlider.HORIZONTAL, 0, 10, personajes.get(0).getCaracteristicas().get("armadura"));
		sldArmadura.setMajorTickSpacing(2);
		sldArmadura.setMinorTickSpacing(1);
		sldArmadura.setPaintLabels(true);
		sldArmadura.setPaintTicks(true);

		sldMagia = new JSlider(JSlider.HORIZONTAL, 0, 10, personajes.get(0).getCaracteristicas().get("magia"));
		sldMagia.setMajorTickSpacing(2);
		sldMagia.setMinorTickSpacing(1);
		sldMagia.setPaintLabels(true);
		sldMagia.setPaintTicks(true);

		lblAvatar = new JLabel(new ImageIcon("imgsPersonajes/" + personajes.get(0).getAvatar()));
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

	// Actualiza todos los componentes de la ventana con los datos del personaje que
	// se encuentra en la posición pos.
	private void actualizarVentana(int pos) {

		txtNick.setText(personajes.get(pos).getNick());
		txtRol.setText(personajes.get(pos).getRol());
		txtInicio.setText(personajes.get(pos).getInicio().toString());

		sldFuerza.setValue(personajes.get(pos).getCaracteristicas().get("fuerza"));
		sldSalud.setValue(personajes.get(pos).getCaracteristicas().get("salud"));
		sldArmadura.setValue(personajes.get(pos).getCaracteristicas().get("fuerza"));
		sldFuerza.setValue(personajes.get(pos).getCaracteristicas().get("fuerza"));

		// TODO Acabar el método.
		
	}

	public static void main(String[] args) {
		new EditorPersonajes();
	}

}




