package agenda;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AgendaRuth {

	// private Contacto[] contactos;

	private List<Contacto> contactos;
	private int siguienteId; // Id que asignaremos al añadir un nuevo contacto. Siempre irá en aumento.

	// TODO Eliminar el parámetro numPosiciones que es innecesario.
	public AgendaRuth() {

		contactos = new ArrayList<Contacto>();

		siguienteId = 1;

	}

	// Añade el contacto proporcionado al array contactos, tras asignarle un
	// identificador. Devuelve true si ha podido añadirlo y false si no.
	public boolean anyadirContacto(Contacto contacto) {

		// Verificamos si hay sitio para el nuevo contacto.
		// if (limite == contactos.size()) {
		// return false;
		// }

		// Asignamos un id al contacto.
		contacto.setId(siguienteId);
		siguienteId++;

		// Añadimos el nuevo contacto.
		// contactos[limite] = contacto;
		contactos.add(contacto);
		// limite++;

		return true;

	}

	// Muestra en la terminal una lista con los contactos de la agenda.
	public void listarContactos() {

		// Verificamos si hay contactos almacenados
		if (contactos.isEmpty()) {
			System.out.println("No hay ningún contacto almacenado.");
			return;
		}

		// Recorremos el array de contactos y mostramos sus datos.
		for (int i = 0; i < contactos.size(); i++) {
			System.out.println(contactos.get(i).toString());
		}

	}

	// Devuelve la posición del contacto cuyo id vale idContacto. Si no se
	// encuentra, devuelve -1.
	public int buscarContacto(int idContacto) {

		for (int i = 0; i < contactos.size(); i++) {
			if (contactos.get(i).getId() == idContacto) {
				return i;
			}
		}

		return -1;

	}

	// Devuelve el contacto almacenado en la posición indicada del array contactos.
	public Contacto getContacto(int pos) {

		// contactos[pos]
		if (pos >= 0 && pos < contactos.size()) {
			return contactos.get(pos);
		}

		return null;

	}

	// Almacena en la posición pos del array contactos el contacto recibido como
	// parámetro.
	public void setContacto(int pos, Contacto contacto) {

		// contactos[pos] = contacto;

		contactos.set(pos, contacto);

	}

	// Elimina del array contactos el contacto con el id proporcionado. Devuelve
	// true si se ha podido hacer y false si no.
	public boolean eliminarContacto(int idContacto) {

		int pos = buscarContacto(idContacto);

		if (pos == -1) {
			return false;
		}

		// Movemos todos los elementos por debajo de pos un sitio hacia arriba.
		// for (int i = pos; i < contactos.size(); i++) {
		// contactos[pos] = contactos[pos + 1];

		// }

		contactos.remove(pos);

		return true;

	}

	public void cargarAgenda() {

		File archivo = new File("src/contactos.txt");
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}