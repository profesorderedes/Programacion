package ejemplo05Persona;

public class Persona {

	// Atributos

	String nombre;
	String apellidos;
	String dni;
	int edad;
	double altura;

	// Constructores

	// Constructor implícito (éste existe por defecto, pero se destruye cuando
	// creamos un constructor a mano).
	Persona() {

	}

	// Constructor explícito.
	Persona(String nombre, String apellidos, String dni, int edad, double altura) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
		this.altura = altura;
	}

	Persona(String nombre, String apellidos, String dni) {
		// Si usamos this como un método, estamos llamando
		// a un constructor.
		this(nombre, apellidos, dni, 0, 0);
	}

	// nombre, edad, altura
	Persona(String nombre, int edad, double altura) {
		this(nombre, null, null, edad, altura);
	}

	Persona(String nombre, String apellidos) {
		this(nombre, apellidos, null, 0, 0);
	}

	// Métodos

	void mostrar() {

		System.out.println("\nNombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("DNI: " + dni);
		System.out.println("Edad: " + edad);
		System.out.println("Altura: " + altura);

	}

}
