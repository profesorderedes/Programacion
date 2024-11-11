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

		int i = 0;

		while (i < ordenes.length) {

			System.out.println("Orden número " + (i + 1) + ": ");
			ordenes[i] = entrada.nextLine();

			if (ordenes[i].equals("ejecutar")) {
				break;
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