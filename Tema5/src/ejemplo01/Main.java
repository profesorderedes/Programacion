package ejemplo01;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// Creamos algunos objetos de la clase Persona.
		Persona p1;
		p1 = new Persona();
		
		Persona p2 = new Persona();
		
		// Damos valor a los atributos de la persona p1.
		p1.nombre = "Carlos";
		p1.apellidos = "Pérez";
		p1.dni = "10200200T";
		p1.edad = 30;
		p1.altura = 1.80;
		
		// Damos valor a los atributos de la persona p2.
		p2.nombre = "Luisa";
		p2.apellidos = "Ramos";
		p2.dni = "21000000E";
		p2.edad = 35;
		p2.altura = 1.75;
		
		// Mostramos los atributos de p1.
		System.out.println("Datos de p1:");
		System.out.println("Nombre: " + p1.nombre);
		System.out.println("DNI: " + p1.dni);
		System.out.println("Edad: " + p1.edad + " años.");
		
		// Mostramos los atributos de p2.
		System.out.println("\nDatos de p2:");
		System.out.println("Nombre: " + p2.nombre);
		System.out.println("Apellidos: " + p2.apellidos);
		System.out.println("Altura: " + p2.altura);
		
		// Llamamos al método mostrar de p1.
		p1.mostrar();
		
		// LLamamos al método mostrar de p2.
		p2.mostrar();
	}

}






