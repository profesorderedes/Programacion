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
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}

	// nombre, edad, altura
	Persona(String nombre, int edad, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
	}

	Persona(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
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
