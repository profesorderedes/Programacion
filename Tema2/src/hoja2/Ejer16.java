package hoja2;

import java.util.Scanner;

public class Ejer16 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numAleatorio = (int) (Math.random() * 10 + 1);
		System.out.println(numAleatorio);

		int respuesta;

		int intentos = 0;

		do {

			System.out.println("Dime un número del 1 al 10:");
			respuesta = entrada.nextInt();

			intentos++;

		} while (intentos < 3 && respuesta != numAleatorio);

		if (respuesta == numAleatorio) {

			System.out.println("Muy Bien.");

		} else {

			System.out.println("\nYa has superado los intentos.\nHas perdido.");
			System.out.println("El número era " + numAleatorio + ".");
		}

	}

}
