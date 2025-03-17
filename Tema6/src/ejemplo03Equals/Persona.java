package ejemplo03Equals;

public class Persona {

	private String apellidos;
	private String nombre;
	private String dni;

	public Persona(String apellidos, String nombre, String dni) {
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.dni = dni;
	}

	public void mostrar() {
		System.out.println("\n" + apellidos + ", " + nombre + " (" + dni + ")");
	}

	// Método equals: devuelve true si la persona con la que
	// comparamos tiene el mismo DNI.
	@Override
	public boolean equals(Object obj) {

		// Si el parámetro obj apunta a la misma dirección de memoria que el objeto
		// sobre el que ejecutamos equals(), por fuerza tienen que ser el mismo.
		if (obj == this) {
			System.out.println("Los dos objetos apuntan a la misma dirección de memoria\n-> Son iguales.");
			return true;
		}

		// Si el parámetro obj es null, no puede ser igual al objeto desde el que
		// llamamo al método equals().
		if (obj == null) {
			System.out.println("El objeto sobre el que llamamos a equals() no puede ser null\n-> Son diferentes.");
			return false;
		}

		// Comprobamos que obj es de tipo Persona.
		if (obj instanceof Persona) {
			System.out.println("El parámetro es de tipo persona.");
			Persona p = (Persona) obj;

			// Comprobamos que obj y el objeto desde el que llamamos al método tienen el
			// mismo DNI.
			if (this.dni.equals(p.dni)) {
				System.out.println("Tienen el mismo DNI luego son la misma persona.");
				return true;
			}

		}

		return false;

	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

}
