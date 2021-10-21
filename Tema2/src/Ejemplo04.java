
// Programa que te pregunta la edad, y te dice si puedes pasar
// a la discoteca o no.

import java.util.Scanner;

public class Ejemplo04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Preguntar la edad.
		System.out.println("¿Cuántos años tienes?");
		int edad = entrada.nextInt();

		// Si la edad es mayor o igual a 18, se puede pasar.
		if (edad >= 18) {
			System.out.println("Puedes pasar a la discoteca.");
		} else {
			System.out.println("Vete a casa.");
		}

		System.out.println("Gracias por venir a nuestro local.");

	}
}
