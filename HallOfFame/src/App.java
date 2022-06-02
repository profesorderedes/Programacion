
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class App extends JFrame {
	
	private final String ARCHIVO = "ficheros/jugadores.txt";

	private JList<String> lstJugadores;
	private DefaultListModel<String> modeloLista;
	private JButton btnNuevo, btnBorrar;

	public App() {
		super("Puntuaciones");
		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);

		JLabel halloffame = new JLabel("*** Hall of Fame ***");

		modeloLista = new DefaultListModel<>();
		
		lstJugadores = new JList<String>(modeloLista);
		
		JScrollPane panelJugadores = new JScrollPane(lstJugadores);
		panelJugadores.setPreferredSize(new Dimension(280, 300));

		btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				nuevoJugador();
			}
		});

		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				borrarArchivo();
			}
		});

		add(halloffame);
		add(panelJugadores);
		add(btnNuevo);
		add(btnBorrar);

		cargarJugadores();

		setVisible(true);
	}

	/**
	 * Añade un jugador nuevo y su puntuación. Este método es llamado desde el
	 * listener del botón Nuevo.
	 */
	private void nuevoJugador() {

		// Leemos los datos del jugador.
		Jugador nuevoJugador = leerDatosJugador();
		
		if(nuevoJugador == null) {
			return;
		}

		// Añadimos la línea con los datos del jugador
		// al modelo del JList.
		modeloLista.addElement(nuevoJugador.getNombre() 
				+ " ... " + nuevoJugador.getPuntos() 
				+ " puntos.");

		// Guardamos los datos del jugador en el archivo.
		guardarJugador(nuevoJugador);

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

		String puntuacion = JOptionPane.showInputDialog(this, "¿Puntuacion del jugador?", "Nuevo",
				JOptionPane.QUESTION_MESSAGE);

		if (nombre == null || nombre.trim().equals("")) {
			return null;
		}

		int puntos;

		try {
			puntos = Integer.parseInt(puntuacion);
		} catch (NumberFormatException e) {
			return null;
		}

		Jugador jugador = new Jugador(nombre, puntos);

		return jugador;

	}

	/**
	 * Guarda la información de un jugador en el archivo de disco, en formato csv.
	 * 
	 * @param jugador Objeto Jugador con el nombre y la puntuación a añadir.
	 */
	private void guardarJugador(Jugador jugador) {
		
		try {
			BufferedWriter buffer = new BufferedWriter(
					new FileWriter(ARCHIVO, true));
			
			buffer.write(jugador.getNombre() + "," 
			        + jugador.getPuntos() + "\n");
			
			buffer.close();
			
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, 
					"Error guardando los datos del usuario.", 
					"Hall of Fame", JOptionPane.ERROR_MESSAGE);
		}
			
	}

	/**
	 * Lee los datos sobre nombres y puntuaciones de jugadores. Los añade a la lista
	 * que se muestra en la ventana.
	 */
	private void cargarJugadores() {

	}

	/**
	 * Borra el contenido del archivo de jugadores, dejándolo en blanco. Y la lista
	 * de jugadores en la ventana. Este método es llamado desde el listener del
	 * botón Borrar.
	 */
	private void borrarArchivo() {

	}

	public static void main(String[] args) {
		new App();
	}

}