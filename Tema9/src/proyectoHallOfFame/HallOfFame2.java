package proyectoHallOfFame;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class HallOfFame2 extends JFrame {

	private final String NOMBRE_ARCHIVO = System.getProperty("user.home") + "/HallOfFame/jugadores.txt";

	private List<Jugador> jugadores;
	private DefaultListModel<String> modelo;

	public HallOfFame2() {

		super("Puntuaciones");
		setSize(400, 570);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		jugadores = new ArrayList<>();

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
		btnBorrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				borrarArchivo();
			}
		});

		addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent arg0) {

			}

			@Override
			public void windowIconified(WindowEvent arg0) {

			}

			@Override
			public void windowDeiconified(WindowEvent arg0) {

			}

			@Override
			public void windowDeactivated(WindowEvent arg0) {

			}

			@Override
			public void windowClosing(WindowEvent arg0) {

				// Borramos el contenido del fichero de jugadores.
				try {
					FileWriter archivo = new FileWriter(NOMBRE_ARCHIVO);
					archivo.close();
				} catch (IOException e) {
					JOptionPane.showMessageDialog(null,
							"Se ha producido un error al eliminar el contenido del archivo.");
				}

				// Guardamos la información de todos los jugadores.
				for (Jugador jugador : jugadores) {
					guardarJugador(jugador);
				}

			}

			@Override
			public void windowClosed(WindowEvent arg0) {

			}

			@Override
			public void windowActivated(WindowEvent arg0) {

			}
		});

		// Creamos la carpeta del programa, dentro de la carpeta
		// personal del usuario.
		File carpeta = new File(System.getProperty("user.home") + "/HallOfFame");
		carpeta.mkdir();

		cargarJugadores();

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

		jugadores.add(jugadorNuevo);

		// Añadimos a la lista el jugador y sus puntos.
		modelo.addElement(jugadorNuevo.getNombre() + " ... " + jugadorNuevo.getPuntuacion() + " puntos");

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
		if (nombre == null || nombre.trim().equals("")) {
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

		try {
			BufferedWriter buffer = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO, true));

			buffer.write("nombre=" + jugador.getNombre() + "\n");
			buffer.write("puntos=" + jugador.getPuntuacion() + "\n");

			buffer.close();

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,
					"Se ha producido un error guardando la información de los jugadores en el disco.");
		}

	}

	/**
	 * Lee los datos sobre nombres y puntuaciones de jugadores. Los añade a la lista
	 * que se muestra en la ventana.
	 */
	public void cargarJugadores() {

		// Cargamos los datos en el ArrayList jugadores.

		try {
			FileReader archivo = new FileReader(NOMBRE_ARCHIVO);
			BufferedReader buffer = new BufferedReader(archivo);

			// Declaras e itera una vez
			String lineaNombre = buffer.readLine();
			String lineaPuntuacion = buffer.readLine();

			// Mientras haya datos se hace...
			while (lineaNombre != null && lineaPuntuacion != null) {

				// Descomponemos cada línea en nombre y puntuacion.

				String[] partesNombre = lineaNombre.split("=");
				String nombre = partesNombre[1];
				String[] partesPuntuacion = lineaPuntuacion.split("=");
				int puntuacion = Integer.parseInt(partesPuntuacion[1]);

				Jugador jugadorNuevo = new Jugador(nombre, puntuacion);
				jugadores.add(jugadorNuevo);

				// Se actualiza e itera todas las veces necesarias dentro del bucle.
				lineaNombre = buffer.readLine();
				lineaPuntuacion = buffer.readLine();
			}

			buffer.close();

		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null,
					"No se han encontrado datos guardados de jugadores. Se creará un archivo nuevo.");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Se ha producido un error leyendo el archivo.");
		}

		// Recorremos el ArrayList y rellenamos el JList con los nombres y puntuaciones.

		for (Jugador jugador : jugadores) {
			modelo.addElement(jugador.getNombre() + " ... " + jugador.getPuntuacion());
		}

	}

	/**
	 * Borra el contenido del archivo de jugadores, dejándolo en blanco. Y la lista
	 * de jugadores en la ventana. Este método es llamado desde el listener del
	 * botón Borrar.
	 */
	public void borrarArchivo() {

		// Pedimos confirmación del borrado.

		int borrar = JOptionPane.showConfirmDialog(null, "¿Seguro que quieres borrar los datos de todos los jugadores?",
				"Advertencia", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

		if (borrar != JOptionPane.OK_OPTION) {
			JOptionPane.showMessageDialog(null, "Operación cancelada. No se ha borrado ningún dato.");
			return;
		}

		// Borramos el JList y el ArrayList de jugadores.
		modelo.clear();
		jugadores.clear();

	}

	public static void main(String[] args) {
		new HallOfFame2();
	}
}
