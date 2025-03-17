package ejemplo01Persona;

// Al hacer que Persona sea una clase abstracta, estaremos impidiendo
// que se creen objetos de tipo Persona.
public abstract class Persona {

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

	// El método abstracto leerDatos() obliga a que todas las
	// clases hijas implementen un método leerDatos().
	// Así nos aseguramos de que no se deje a alguna de las clases
	// hijas sin ese método.
	public abstract void leerDatos();

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
