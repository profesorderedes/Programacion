package biblioteca;

public class Autor {

	private String nombre;
	private String email;
	private int fechaNacimiento;

	public Autor(String nombre, String email, int fechaNacimiento) {

		this.email = email;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public Autor() {

	}

	public Autor(String nombre) {
		this.nombre = nombre;
	}

	public String toString() {

		if (email == null) {
			email = "Unknown";
		}

		return "\nNombre:" + nombre + "\nemail:" + email + "\nFecha de nacimiento:" + fechaNacimiento;

	}

	// getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(int fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
}
