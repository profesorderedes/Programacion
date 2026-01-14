package ejemplo05Persona;

public class Persona {

	// Atributos de la clase Persona.

	String nombre;
	String apellidos;
	int edad;
	String dni;

	// Métodos de la clase Persona.

	// Constructor que nos permite inicializar todos los atributos.
	Persona(String nombre, String apellidos, int edad, String dni) {

		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.dni = dni;

	}

	// Constructor implícito. Lo tienen todas las clases, pero desaparece si
	// creamos un constructor explícito.
	Persona() {

	}

	// Constructor que nos permite inicializar sólo el nombre y apellidos.
	Persona(String nombre, String apellidos) {

		// Llamamos al constructor que hemos escrito más arriba y acepta 
		// cuatro parámetros.
		this(nombre, apellidos, 0, "desconocido");
		
		// La línea anterior hace lo mismo que las siguientes instrucciones:
		// this.nombre = nombre;
		// this.apellidos = apellidos;
		// dni = "desconocido";

	}

	void mostrar() {

		System.out.println("\nNombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Edad: " + edad);
		System.out.println("DNI: " + dni);

	}

}
