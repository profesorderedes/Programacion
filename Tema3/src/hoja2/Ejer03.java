package hoja2;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String nombres[] = new String[10];
		boolean nombreEncontrado = false;
		int i = 0;

		System.out.println("Introduce hasta 10 nombres. Si escribes 'nadie' terminara el programa.");

		while (i < 10) {

			System.out.println("Dime un nombre.");
			String nombre = entrada.nextLine();

			if (nombre.equalsIgnoreCase("nadie")) {
				break;
			}

			nombres[i] = nombre;

			if (nombre.equalsIgnoreCase("Calderón")) {
				nombreEncontrado = true;
			}

			i++;

		}

		if (nombreEncontrado) {
			System.out.println("de la Barca");
		} else {
			System.out.println("Nombre no encontrado");
		}

	}

}