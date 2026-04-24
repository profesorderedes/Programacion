
import java.awt.Color;
import java.awt.Dimension;
import java.awt.JobAttributes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

import org.xml.sax.SAXException;

import net.miginfocom.swing.MigLayout;

public class EditorPersonajes extends JFrame implements ActionListener, WindowListener {

	private List<Personaje> personajes;

	private JTextField txtNick, txtRol, txtInicio;
	private JSlider sldFuerza, sldSalud, sldArmadura, sldMagia;
	private JLabel lblAvatar;
	private JButton btnAnterior, btnSiguiente;

	private int personajeSeleccionado;

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

		btnAnterior = new JButton(new ImageIcon("imgsPersonajes/flecha_izq.png"));
		btnAnterior.addActionListener(this);

		txtNick = new JTextField();
		txtNick.setPreferredSize(new Dimension(200, txtNick.getSize().height));

		txtRol = new JTextField();
		txtRol.setPreferredSize(new Dimension(200, txtRol.getSize().height));

		txtInicio = new JTextField();
		txtInicio.setPreferredSize(new Dimension(200, txtInicio.getSize().height));

		sldFuerza = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);
		sldFuerza.setMajorTickSpacing(2);
		sldFuerza.setMinorTickSpacing(1);
		sldFuerza.setPaintLabels(true);
		sldFuerza.setPaintTicks(true);

		sldSalud = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);
		sldSalud.setMajorTickSpacing(2);
		sldSalud.setMinorTickSpacing(1);
		sldSalud.setPaintLabels(true);
		sldSalud.setPaintTicks(true);

		sldArmadura = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);
		sldArmadura.setMajorTickSpacing(2);
		sldArmadura.setMinorTickSpacing(1);
		sldArmadura.setPaintLabels(true);
		sldArmadura.setPaintTicks(true);

		sldMagia = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);
		sldMagia.setMajorTickSpacing(2);
		sldMagia.setMinorTickSpacing(1);
		sldMagia.setPaintLabels(true);
		sldMagia.setPaintTicks(true);

		lblAvatar = new JLabel();
		lblAvatar.setBorder(BorderFactory.createLineBorder(Color.GRAY));

		btnSiguiente = new JButton(new ImageIcon("imgsPersonajes/flecha_der.png"));
		btnSiguiente.addActionListener(this);

		actualizarVentana(0);
		actualizarBotones();

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

		addWindowListener(this);

		setLocationRelativeTo(null);

		setVisible(true);

	}

	// Actualiza todos los componentes de la ventana con los datos del personaje que
	// se encuentra en la posición pos del ArrayList.
	private void actualizarVentana(int pos) {

		txtNick.setText(personajes.get(pos).getNick());
		txtRol.setText(personajes.get(pos).getRol());
		txtInicio.setText(personajes.get(pos).getInicio().toString());

		sldFuerza.setValue(personajes.get(pos).getCaracteristicas().get("fuerza"));
		sldSalud.setValue(personajes.get(pos).getCaracteristicas().get("salud"));
		sldArmadura.setValue(personajes.get(pos).getCaracteristicas().get("armadura"));
		sldMagia.setValue(personajes.get(pos).getCaracteristicas().get("magia"));

		lblAvatar.setIcon(new ImageIcon("imgsPersonajes/" + personajes.get(pos).getAvatar()));

	}

	private void actualizarBotones() {

		if (personajeSeleccionado == 0) {
			btnAnterior.setEnabled(false);
		} else if (personajeSeleccionado == personajes.size() - 1) {
			btnSiguiente.setEnabled(false);
		} else {
			btnAnterior.setEnabled(true);
			btnSiguiente.setEnabled(true);
		}

	}

	private void guardarDatos() {

		personajes.get(personajeSeleccionado).setNick(txtNick.getText());
		personajes.get(personajeSeleccionado).setRol(txtRol.getText());
		personajes.get(personajeSeleccionado).setInicio(LocalDate.parse(txtInicio.getText()));

		Map<String, Integer> caracteristicas = new HashMap<>();

		caracteristicas.put("fuerza", sldFuerza.getValue());
		caracteristicas.put("salud", sldSalud.getValue());
		caracteristicas.put("armadura", sldArmadura.getValue());
		caracteristicas.put("magia", sldMagia.getValue());

		personajes.get(personajeSeleccionado).setCaracteristicas(caracteristicas);

		try {
			// Guardamos el ArrayList personajes en disco.
			AccesoPersonajes.guardar(personajes);

		} catch (ParserConfigurationException | TransformerFactoryConfigurationError | TransformerException e) {
			JOptionPane.showMessageDialog(null, "Error al guardar datos del personaje", "Personajes del juego",
					JOptionPane.ERROR_MESSAGE);
		}

	}

	// TODO Corregir este método.
	private boolean datosVentanaValidos() {

		// Comprobamos que los TextFields no están en blanco.
		if (txtNick.getText().trim().equals("") || txtRol.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "Las casillas de Nick y Rol no pueden estar vacías.",
					"Personajes de rol", JOptionPane.WARNING_MESSAGE);
			return false;
		}

		// Comprobamos que la fecha de inicio del personaje es correcta.
		try {
			LocalDate.parse(txtInicio.getText());
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "La fecha de inicio del personaje debe tener el formato aaaa-mm-dd.",
					"Personajes de rol", JOptionPane.WARNING_MESSAGE);
			return false;
		}

		return true;

	}

	public static void main(String[] args) {
		new EditorPersonajes();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		guardarDatos();

		if (e.getSource() == btnAnterior) {
			personajeSeleccionado--;
		} else if (e.getSource() == btnSiguiente) {
			personajeSeleccionado++;
		}

		actualizarBotones();
		actualizarVentana(personajeSeleccionado);

	}

	@Override
	public void windowOpened(WindowEvent e) {

	}

	@Override
	public void windowClosing(WindowEvent e) {
		guardarDatos();
	}

	@Override
	public void windowClosed(WindowEvent e) {

	}

	@Override
	public void windowIconified(WindowEvent e) {

	}

	@Override
	public void windowDeiconified(WindowEvent e) {

	}

	@Override
	public void windowActivated(WindowEvent e) {

	}

	@Override
	public void windowDeactivated(WindowEvent e) {

	}

}
