package hoja1;

import java.util.Scanner;

// Actividad: modifica este ejercicio para que no permita escribir nada

// que no sea una de las cinco órdenes. Si el usuario se equivoca, la

// orden no se guardará y se le volverá a preguntar, las veces que

// sea necesario.

public class Ejer11b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String[] ordenes = new String[1000];

		// String[] ordenes2 = { "izquierda", "derecha", "arriba", "abajo", "matar" };

		int i = 0;
		String orden;

		while (i < ordenes.length) {

			System.out.println("Orden número " + (i + 1) + ": ");
			orden = entrada.nextLine();

			if (orden.equals("izquierda") || orden.equals("derecha") || orden.equals("arriba") || orden.equals("abajo")
					|| orden.equals("matar")) {

				ordenes[i] = orden;

			} else if (orden.equals("ejecutar")) {

				ordenes[i] = orden;
				break;

			} else {

				System.out.println("Orden incorrecta");
				continue;

			}

			i++;

		}

		i = 0;

		while (i < ordenes.length) {

			if (ordenes[i].equals("ejecutar")) {
				break;
			}

			System.out.println(ordenes[i]);

			i++;

		}

	}

}