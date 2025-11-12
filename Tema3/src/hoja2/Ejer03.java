package hoja2;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

// 3.- Escribe un programa que lea una lista de nombres (uno a uno, hasta un máximo de 10) por
// consola y los vaya guardando en un array llamado nombres. La aplicación terminará de pedir
// palabras cuando el usuario escriba "nadie".
// A continuación revisará el array y averiguará si se ha introducido el nombre "Calderón". Si es así
// escribirá "de la Barca". Si no, escribirá "Nombre no encontrado". Utiliza una variable semáforo
// llamándola nombreEncontrado.

		Scanner input = new Scanner(System.in);

		String[] nombres = new String[10];

		System.out.println(
				"Dime nombres, hasta 10 como mucho.\nIntroduce 'nadie' cuando no quieras introducir más nombres.\n");

		for (int i = 0; i < nombres.length; i++) {

			System.out.println("Dime un nombre: ");
			String nombre = input.nextLine();

			if (nombre.equals("nadie")) {
				break;
			}

			nombres[i] = nombre;

		}

		String buscar = "Calderón";
		boolean nombreEncontrado = false;

		for (int i = 0; i < nombres.length; i++) {

			if (nombres[i] == null) {

				break;

			} else if (nombres[i].equals(buscar)) {

				System.out.println("de la Barca.");
				nombreEncontrado = true;
				break;

			}

		}

		if (!nombreEncontrado) {

			System.out.println("Nombre no encontrado.");

		}

	}

}