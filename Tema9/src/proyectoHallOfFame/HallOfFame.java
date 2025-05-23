package proyectoHallOfFame;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class HallOfFame extends JFrame {

	private DefaultListModel<String> modelo;

	public HallOfFame() {

		super("Puntuaciones");
		setSize(400, 570);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		JLabel lblHallOfFame = new JLabel("Hall of fame");

		modelo = new DefaultListModel<String>();
		JList<String> lstJugadores = new JList<String>(modelo);

		JScrollPane panelJugadores = new JScrollPane(lstJugadores);
		panelJugadores.setPreferredSize(new Dimension(380, 450));

		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				nuevoJugador();
			}
		});

		JButton btnBorrar = new JButton("Borrar");

		add(lblHallOfFame);
		add(panelJugadores);
		add(btnNuevo);
		add(btnBorrar);

		setVisible(true);

	}

	/**
	 * Añade un jugador nuevo y su puntuación. Este método es llamado desde el
	 * listener del botón Nuevo.
	 */
	private void nuevoJugador() {

		// Leemos los datos del nuevo jugador.
		Jugador jugadorNuevo = leerDatosJugador();

		// Comprobamos que no nos hayan pasado un null (datos incorrectos).
		if (jugadorNuevo == null) {
			return;
		}

		// Añadimos a la lista el jugador y sus puntos.
		modelo.addElement(jugadorNuevo.getNombre() + " ... " + jugadorNuevo.getPuntuacion());

	}

	/**
	 * Pide al usuario los datos de un nuevo jugador y devuelve un objeto Jugador.
	 *
	 * @return Un objeto Jugador con los datos leídos, o null si los datos no son
	 *         válidos.
	 */
	private Jugador leerDatosJugador() {

		String nombre = JOptionPane.showInputDialog(this, "¿Nombre del jugador?", "Nuevo",
				JOptionPane.QUESTION_MESSAGE);

		// Comprobamos que el nombre no esté vacío.
		if (nombre.trim().equals("")) {
			return null;
		}

		String puntos = JOptionPane.showInputDialog(this, "¿Puntuación del jugador?", "Nuevo",
				JOptionPane.QUESTION_MESSAGE);

		// Comprobamos que puntos es un número.
		int puntuacion;
		try {
			puntuacion = Integer.parseInt(puntos);
		} catch (NumberFormatException nfe) {
			return null;
		}

		// Si los datos leídos son correctos, devolvemos un objeto
		// Jugador.
		return new Jugador(nombre, puntuacion);

	}

	/**
	 * Guarda la información de un jugador en el archivo de disco, en formato csv.
	 *
	 * @param jugador Objeto Jugador con el nombre y la puntuación a añadir.
	 */
	public void guardarJugador(Jugador jugador) {
	}

	/**
	 * Lee los datos sobre nombres y puntuaciones de jugadores. Los añade a la lista
	 * que se muestra en la ventana. 6
	 */
	public void cargarJugadores() {
	}

	/**
	 * Borra el contenido del archivo de jugadores, dejándolo en blanco. Y la lista
	 * de jugadores en la ventana. Este método es llamado desde el listener del
	 * botón Borrar.
	 */
	public void borrarArchivo() {
	}

	public static void main(String[] args) {
		new HallOfFame();
	}
}
