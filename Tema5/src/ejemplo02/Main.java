package ejemplo02;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		Persona persona1 = new Persona();
		
		// Leemos los datos de persona1 desde la terminal.
		System.out.println("Nombre: ");
		persona1.nombre = entrada.nextLine();
		
		System.out.println("Apellidos: ");
		persona1.apellidos = entrada.nextLine();
		
		System.out.println("Edad: ");
		persona1.edad = entrada.nextInt();
		
		// Los mostramos.
		System.out.println("Datos de " + persona1.nombre);
		System.out.println("===============================");
		
		System.out.println("Nombre: " + persona1.nombre);
		System.out.println("Apellidos: " + persona1.apellidos);
		System.out.println("Edad: " + persona1.edad);
		
	}
	
}
