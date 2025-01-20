package ejemplo05Persona;

public class Persona {
	
	// Atributos
	
	String nombre;
	String apellidos;
	String dni;
	int edad;
	double altura;
	
	// Constructores
	
	// Constructor implícito.
	Persona(){
		
	}
	
	// Constructor explícito.
	Persona(String nombre, String apellidos, String dni, int edad, double altura){
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
		this.altura = altura;
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
