package juzgado;

public class Juez {

	private String dni;
	private String apellidos;
	private String nombre;

	public Juez(String dni, String apellidos, String nombre) {
		this.dni = dni;
		this.apellidos = apellidos;
		this.nombre = nombre;
	}

	public String toString() {
		return dni + "\t" + apellidos + ", " + nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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

}
