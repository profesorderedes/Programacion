
public class Agenda {

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

}
