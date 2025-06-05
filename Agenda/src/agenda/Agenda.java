package agenda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Agenda {

	private final String NOMBRE_ARCHIVO = "contactos.txt";

	private Contacto[] contactos;
	private int limite;
	private int siguienteId; // Id que asignaremos al añadir un nuevo contacto. Siempre irá en aumento.

	public Agenda(int numPosiciones) {

		contactos = new Contacto[numPosiciones];
		limite = 0;
		siguienteId = 1;

	}

	// Añade el contacto proporcionado al array contactos, tras asignarle un
	// identificador. Devuelve true si ha podido añadirlo y false si no.
	public boolean anyadirContacto(Contacto contacto) {

		// Verificamos si hay sitio para el nuevo contacto.
		if (limite == contactos.length) {
			return false;
		}

		// Asignamos un id al contacto.
		contacto.setId(siguienteId);
		siguienteId++;

		// Añadimos el nuevo contacto.
		contactos[limite] = contacto;
		limite++;

		return true;

	}

	// Muestra en la terminal una lista con los contactos de la agenda.
	public void listarContactos() {

		// Verificamos si hay contactos almacenados
		if (limite == 0) {
			System.out.println("No hay ningún contacto almacenado.");
			return;
		}

		// Recorremos el array de contactos y mostramos sus datos.
		for (int i = 0; i < limite; i++) {
			System.out.println(contactos[i].toString());
		}

	}

	// Devuelve la posición del contacto cuyo id vale idContacto. Si no se
	// encuentra, devuelve -1.
	public int buscarContacto(int idContacto) {

		for (int i = 0; i < limite; i++) {
			if (contactos[i].getId() == idContacto) {
				return i;
			}
		}

		return -1;

	}

	// Devuelve el contacto almacenado en la posición indicada del array contactos.
	public Contacto getContacto(int pos) {

		if (pos >= 0 && pos < limite) {
			return contactos[pos];
		}

		return null;

	}

	// Almacena en la posición pos del array contactos el contacto recibido como
	// parámetro.
	public void setContacto(int pos, Contacto contacto) {

		if (pos >= 0 && pos < limite) {
			contactos[pos] = contacto;
		}

	}

	// Elimina del array contactos el contacto con el id proporcionado. Devuelve
	// true si se ha podido hacer y false si no.
	public boolean eliminarContacto(int idContacto) {

		int pos = buscarContacto(idContacto);

		if (pos == -1) {
			return false;
		}

		// Movemos todos los elementos por debajo de pos un sitio hacia arriba.
		for (int i = pos; i < limite - 1; i++) {
			contactos[i] = contactos[i + 1];
		}

		limite--;

		return true;

	}

	public void cargarAgenda() {

		File archivo = new File(NOMBRE_ARCHIVO);
		try {
			FileReader lector = new FileReader(archivo);
			BufferedReader buffer = new BufferedReader(lector);

			String linea = buffer.readLine();

			while (linea != null) {
				String[] partes = linea.split(",");

				String apellidos = partes[0];
				String nombre = partes[1];
				String tel = partes[2];

				Contacto contacto = new Contacto(apellidos, nombre, tel);
				anyadirContacto(contacto);
				linea = buffer.readLine();
			}

			buffer.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void guardarAgenda() {

		try {

			FileWriter archivo = new FileWriter(NOMBRE_ARCHIVO);
			BufferedWriter buffer = new BufferedWriter(archivo);

			for (int i = 0; i < limite; i++) {
				buffer.write(contactos[i].getApellidos() + "," 
						+ contactos[i].getNombre() + "," + contactos[i].getTel() + "\n");
			}

			buffer.close();

		} catch (IOException e) {

			System.out.println("Error");

			e.printStackTrace();

		}

	}

}
