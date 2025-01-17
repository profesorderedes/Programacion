package ejemplo01;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Pedir los datos de una persona por consola y
		// guardarlos en una variable de tipo Persona.

		Persona p1 = new Persona();

		System.out.print("¿Cuál es tu nombre? ");
		p1.nombre = entrada.nextLine();

		System.out.print("¿Tus apellidos? ");
		p1.apellidos = entrada.nextLine();

		System.out.print("¿Cuál es tu DNI? ");
		p1.dni = entrada.nextLine();

		System.out.print("¿Cuántos años tienes? ");
		p1.edad = entrada.nextInt();

		System.out.print("¿Cuánto mides (en metros)? ");
		p1.altura = entrada.nextDouble();

		// Mostramos los datos que acabamos de guardar.
		p1.mostrar();

	}

}
