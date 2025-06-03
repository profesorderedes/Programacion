package agendaConArrayList;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	private List<Contacto> contactos;
	private int siguienteId; // Id que asignaremos al añadir un nuevo contacto. Siempre irá en aumento.

	public Agenda() {

		contactos = new ArrayList<>();
		siguienteId = 1;

	}

	// Añade el contacto proporcionado al array contactos, tras asignarle un
	// identificador. Devuelve true si ha podido añadirlo y false si no.
	public boolean anyadirContacto(Contacto contacto) {

		// Asignamos un id al contacto.
		contacto.setId(siguienteId);
		siguienteId++;

		// Añadimos el nuevo contacto.
		contactos.add(contacto);

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
		for (Contacto contacto : contactos) {
			System.out.println(contacto.toString());
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

		if (pos >= 0 && pos < contactos.size()) {
			return contactos.get(pos);
		}

		return null;

	}

	// Almacena en la posición pos del array contactos el contacto recibido como
	// parámetro. El resto de contactos no sufrirá modificaciones.
	public void setContacto(int pos, Contacto contacto) {

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
		contactos.remove(pos);

		return true;

	}

}
