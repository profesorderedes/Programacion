package ejemplo17Finalize;

public class Persona {

	// Atributos
	private String nombre;
	private String apellidos;
	private int edad;

	// Constructores
	Persona() {

	}

	Persona(String nombre, String apellidos) {
		this(nombre, apellidos, 0);
	}

	Persona(String nombre, String apellidos, int edad) {

		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;

	}

	// Métodos
	void mostrar() {

		System.out.println("\nDatos de " + nombre);
		System.out.println("===============================");

		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Edad: " + edad);

	}
	
	// Este método se ejecutará automáticamente
	// cuando el objeto Persona sea destruido por
	// el recolector de basura.
	public void finalize(){
		
		
		
	}

	// Métodos de acceso
	String getNombre() {
		return nombre;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	String getApellidos() {
		return apellidos;
	}

	void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	int getEdad() {
		return edad;
	}

	void setEdad(int edad) {
		this.edad = edad;
	}

}
