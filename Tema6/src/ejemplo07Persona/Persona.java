package ejemplo07Persona;

public abstract class Persona {

	private String dni;
	private String nombre;
	private String apellidos;

	public Persona(String dni, String nombre, String apellidos) {

		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;

	}

	public void mostrar() {

		System.out.println("DNI: " + dni);
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);

	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

}
