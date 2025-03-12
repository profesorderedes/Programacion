package ejemplo01Persona;

public class Persona {

	private String apellidos;
	private String nombre;
	private String dni;

//	public Persona(String apellidos, String nombre, String dni) {
//		this.apellidos = apellidos;
//		this.nombre = nombre;
//		this.dni = dni;
//	}

	public void mostrar() {
		System.out.println(apellidos + ", " + nombre + " (" + dni + ")");
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
