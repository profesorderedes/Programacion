package ejemplo10Persona;

public class Persona {

	// Atributos de la clase Persona.

	public String nombre;
	private String apellidos;
	private int edad;
	private String dni;

	// Métodos de la clase Persona.

	// Constructor que nos permite inicializar todos los atributos.
	public Persona(String nombre, String apellidos, int edad, String dni) {

		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.dni = dni;

	}

	// Constructor implícito. Lo tienen todas las clases, pero desaparece si
	// creamos un constructor explícito.
	public Persona() {

	}

	// Constructor que nos permite inicializar sólo el nombre y apellidos.
	public Persona(String nombre, String apellidos) {

		// Llamamos al constructor que hemos escrito más arriba y acepta
		// cuatro parámetros.
		this(nombre, apellidos, 0, "desconocido");

		// La línea anterior hace lo mismo que las siguientes instrucciones:
		// this.nombre = nombre;
		// this.apellidos = apellidos;
		// dni = "desconocido";

	}

	public void mostrar() {

		System.out.println("\nNombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Edad: " + edad);
		System.out.println("DNI: " + dni);

	}

	// Métodos de acceso

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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

}
