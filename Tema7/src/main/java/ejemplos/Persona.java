package ejemplos;

public class Persona {

	public String nombre;
	private String apellidos;
	private String dni;

	public Persona(String nombre, String apellidos, String dni) {

		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;

	}

	public Persona() {

	}

	public Persona(String nombre, String apellidos) {

		// Llamamos al constructor que hemos escrito más arriba y acepta
		// cuatro parámetros.
		this(nombre, apellidos, "desconocido");

	}

	public void mostrar() {

		System.out.println("\nNombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("DNI: " + dni);

	}

	@Override
	public String toString() {
		return nombre + " " + apellidos;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		} else if (this == obj) {
			return true;
		} else if (getClass() != obj.getClass()) {
			return false;
		}

		Persona otraPersona = (Persona) obj;

		if (dni.equals(otraPersona.getDni())) {
			return true;
		} else {
			return false;
		}

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

}
