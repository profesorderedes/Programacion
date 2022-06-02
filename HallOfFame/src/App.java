
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
		modeloLista.addElement(formatear(
				nuevoJugador.getNombre(),
				nuevoJugador.getPuntos() + ""));

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
		
		try {
			BufferedReader buffer = new BufferedReader(
					new FileReader(ARCHIVO));
			
			String linea = buffer.readLine();
			
			String datos[];
			
			while(linea != null) {
				
				datos = linea.split(",");
				modeloLista.addElement(
						formatear(datos[0],datos[1]));
				linea = buffer.readLine();
				
			}
			
			buffer.close();
			
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(this, 
					"No se han encontrado datos guardados de jugadores. Se creará uno nuevo.", 
					"Hall of Fame", JOptionPane.INFORMATION_MESSAGE);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, 
					"Error cargando los datos del usuario.", 
					"Hall of Fame", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	private String formatear(String nombre, String puntos) {
		return nombre + " ... " + puntos + " puntos.";
	}

	/**
	 * Borra el contenido del archivo de jugadores, dejándolo en blanco. Y la lista
	 * de jugadores en la ventana. Este método es llamado desde el listener del
	 * botón Borrar.
	 */
	private void borrarArchivo() {
		
		// Comprobar que el usuario quiere borrar 
		// todo el contenido.
		int respuesta = JOptionPane.showConfirmDialog(this, 
				"¿Seguro que quieres borrar los datos de todos "
				+ "los jugadores?", "Hall of Fame", 
				JOptionPane.OK_CANCEL_OPTION, 
				JOptionPane.QUESTION_MESSAGE);
		
		if(respuesta == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(this, 
					"Operación cancelada. No se ha borrado "
					+ "ningún dato.", "Hall of Fame", 
					JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		
		// Borramos el contenido del archivo.
		try {
			
			FileWriter archivo = new FileWriter(ARCHIVO);
			archivo.close();
			
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, 
					"Error borrando los datos del usuario.", 
					"Hall of Fame", JOptionPane.ERROR_MESSAGE);
		}
		
		// Borramos la lista en la ventana.
		modeloLista.clear();
		
	}

	public static void main(String[] args) {
		new App();
	}

}