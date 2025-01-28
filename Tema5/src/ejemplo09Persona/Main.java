package ejemplo09Persona;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Persona p1 = new Persona("Carlos", "Sogorb", "10200200T", 49, 1.72);
		p1.mostrar();

		// Queremos leer y mostrar en pantalla el nombre de p1.
		System.out.println("\nNombre de p1: " + p1.getNombre());

		// Queremos cambiar el nombre de p1.
		p1.setNombre("Luis");
		System.out.println("\nNombre de p1: " + p1.getNombre());

		// Queremos leer y mostrar en pantalla los apellidos de p1.
		System.out.println("\nApellidos de p1: " + p1.getApellidos());

		// Queremos cambiar los apellidos de p1.
		p1.setApellidos("López");
		System.out.println("\nApellidos de p1: " + p1.getApellidos());

	}

}
