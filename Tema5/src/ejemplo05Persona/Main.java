package ejemplo05Persona;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Creamos algunos objetos de la clase Persona.
		Persona p1 = new Persona("Carlos", "Sogorb", "10200200T", 49, 1.72);
		p1.mostrar();

		Persona p2 = new Persona("David", "Fernández", "11200301P", 24, 1.80);
		p2.mostrar();

		Persona p3 = new Persona("Ramón", "López", "59190190R");
		p3.mostrar();

		Persona p4 = new Persona("María", 30, 1.80);
		p4.mostrar();

	}

}
