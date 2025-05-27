package proyectoHallOfFame;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
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

public class HallOfFame extends JFrame {

	private final String NOMBRE_ARCHIVO = "ficheros/jugadores.txt";

	private List<Jugador> jugadores;
	private DefaultListModel<String> modelo;

	public HallOfFame() {

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

		add(lblHallOfFame);
		add(panelJugadores);
		add(btnNuevo);
		add(btnBorrar);

		setVisible(true);

		cargarJugadores();

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
	 * que se muestra en la ventana.
	 */
	public void cargarJugadores() {

		// Cargamos los datos en el ArrayList jugadores.

		try {
			FileReader archivo = new FileReader(NOMBRE_ARCHIVO);
			BufferedReader buffer = new BufferedReader(archivo);

			String linea = buffer.readLine();

			while (linea != null) {
				System.out.println(linea);
				
				// Descomponemos cada línea en nombre y puntuacion.
				String[] datos = linea.split(",");
				
				String nombre = datos[0];
				int puntuacion = Integer.parseInt(datos[1]);
				
				Jugador jugadorNuevo = new Jugador(nombre, puntuacion);
				jugadores.add(jugadorNuevo);
				
				linea = buffer.readLine();
			}

			buffer.close();

		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null,
					"No se han encontrado datos guardados de jugadores. Se creará un archivo nuevo.");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Se ha producido un error leyendo el archivo.");
		}

		// Recorremos el ArrayList y rellenamos el JList con los nombres y puntuaciones.
		
		for(Jugador jugador : jugadores) {
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
		new HallOfFame();
	}
}
