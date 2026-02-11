package ejemplo01Herencia;

// Declaramos esta clase como abstracta porque sólo nos interesa
// para que otras clases (Cliente, Empleado, Proveedor) hereden
// de ella.
// Al ser abstracta no se pueden crear objetos de esta clase.
public abstract class Persona {

	private String nombre;
	private String apellidos;
	private String dni;

	public Persona(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}

	public void mostrar() {
		System.out.println("\nNombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("DNI: " + dni);
	}
	
	public abstract void darDeAlta();

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
