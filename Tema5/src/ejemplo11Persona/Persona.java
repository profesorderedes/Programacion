package ejemplo11Persona;

public class Persona {

	// Atributos
	String nombre;
	String apellidos;
	int edad;
	
	// Constructores
	Persona(){
		
	}
	
	Persona(String nombre, String apellidos){
		
	}
	
	Persona(String nombre, String apellidos, int edad){
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
				
	}

	// Métodos
	void mostrar() {

		System.out.println("Datos de " + nombre);
		System.out.println("===============================");

		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Edad: " + edad);

	}

}
