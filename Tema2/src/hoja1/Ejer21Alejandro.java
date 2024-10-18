package hoja1;

import java.util.Scanner;

public class Ejer21Alejandro {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println(
				"¡Elige un idioma y te digo cómo saludar! \n (1) Francés \n (2) Inglés \n (3) Alemán \n (4) Italiano ");

		if (entrada.hasNextInt()) {

			int respuestaUsuario = entrada.nextInt();

			switch (respuestaUsuario) {

			case 1:
				System.out.println("Bon jour mon ami");
				break;
			case 2:
				System.out.println("Hello");
				break;
			case 3:
				System.out.println("Hallo");
				break;
			case 4:
				System.out.println("Ciao");

			default:

				System.out.println("Debes escribir un número entre 1 y 4.");
				break;

			}

		} else {

			System.out.println("Introduzca un número entero entre el 1 y el 4");

		}

	}

}