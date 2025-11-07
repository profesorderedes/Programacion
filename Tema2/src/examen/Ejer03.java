package examen;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("ENTRADA DEL TÚNEL");
		System.out.println("PROHIBIDA LA ENTRADA A VEHÍCULOS DE ALTURA SUPERIOR A 2 METROS");

		System.out.println("\nIntroduzca la altura de su vehículo:");
		while (!entrada.hasNextFloat()) {
			System.out.println("\nTiene que introducir un número:");
			entrada.nextLine();
		}

		float altura = entrada.nextFloat();

		if (altura > 2) {
			System.out.println("\nNo puede pasar. Su vehículo es demasiado alto.");
		} else {
			System.out.println("\nPuede circular por el túnel.");
		}

	}

}
