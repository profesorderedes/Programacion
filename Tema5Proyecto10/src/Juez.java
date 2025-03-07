
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

}
