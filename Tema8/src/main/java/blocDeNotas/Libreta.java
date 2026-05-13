package blocDeNotas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Libreta {

	private final String NOMBRE_ARCHIVO = "ficheros/notas.txt";

	private List<Nota> notas;

	public Libreta() {

		notas = new ArrayList<>();

		leerNotas();

	}

	/*
	 * Añadir después de la última nota del ArrayList la nota que se nos pasa como
	 * parámetro.
	 */
	public void addNota(Nota nota) {

		notas.add(nota);

	}

	public void setNota(int posicion, Nota nota) {

		notas.set(posicion, nota);

	}

	public Nota getNota(int posicion) {

		return notas.get(posicion);

	}

	/*
	 * Eliminar el elemento del ArrayList notas que ocupa la posición indicada.
	 */
	public void delNota(int posicion) {

		notas.remove(posicion);

	}

	/*
	 * Leer todas las filas del archivo, y rellenar el ArrayList notas. Si no se
	 * encuentra el archivo, hacer que se muestre el mensaje indicado en el
	 * enunciado de la práctica. Si se produce otro tipo de excepción, mostrar un
	 * JOptionPane explicándolo.
	 *
	 * La información de cada nota está guardada en dos líneas de texto, una para el
	 * título y otra para la descripción. Puedes usar el método split() para separar
	 * los datos de los comentarios del archivo.
	 */
	public void leerNotas() {

		try {

			BufferedReader buffer = new BufferedReader(new FileReader(NOMBRE_ARCHIVO));

			String linea = buffer.readLine();

			// Variable temporales para añadir los datos de cada Nota

			String titulo = "";
			String descripcion = "";

			while (linea != null) {

				String[] datos = linea.split("=");

				if (datos[0].equals("TITULO")) {

					titulo = datos[1];

				} else if (datos[0].equals("DESCRIPCION")) {

					descripcion = datos[1];

					notas.add(new Nota(titulo, descripcion));

				}

				linea = buffer.readLine();

			}

			buffer.close();

		} catch (FileNotFoundException e) {

			JOptionPane.showMessageDialog(null,
					"No se ha podido encontrar un archivo válido de tareas.\nSe creará uno automáticamente.",
					"Archivo de tareas no encontrado", JOptionPane.WARNING_MESSAGE);

		} catch (IOException e) {

			JOptionPane.showMessageDialog(null, "No se han podido cargar las tareas correctamente.", "Error de E/S",
					JOptionPane.ERROR_MESSAGE);

		}

	}

	/*
	 * Guarda las notas del ArrayList notas en el archivo "notas.txt". El formato en
	 * que se guardarán debe ser el que aparece en el enunciado de la práctica. Si
	 * se produce una excepción, se mostrará el error que aparece en el enunciado.
	 */
	public void guardarNotas() {

		try {

			BufferedWriter buffer = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO));

			for (Nota nota : notas) {

				buffer.write("TITULO=" + nota.getTitulo() + "\n");
				buffer.write("DESCRIPCION=" + nota.getDescripcion() + "\n");

			}

			buffer.close();

		} catch (IOException e) {

			JOptionPane.showMessageDialog(null, "No se han podido guardar las tareas correctamente.", "Error de E/S",
					JOptionPane.ERROR_MESSAGE);

		}

	}

	public int getNumNotas() {

		return notas.size();

	}

}
