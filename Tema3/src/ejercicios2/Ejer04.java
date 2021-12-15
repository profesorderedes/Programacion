package ejercicios2;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double productos[] = new double[10];

		boolean preciosCorrectos = true;

		for (int i = 0; i < productos.length; i++) {

			System.out.println((i + 1) + " - Escribe el precio del producto :");

			productos[i] = entrada.nextFloat();

		}

		double total = 0;

		for (int i = 0; i < productos.length; i++) {

			total = productos[i] + total;

			if (productos[i] < 0) {

				System.out.println("Se ha encontrado un valor " + "no válido en la posición " + i);

				preciosCorrectos = false;

				break;

			}

		}

		if (preciosCorrectos) {

			System.out.println("El total de todos los productos es: " + total);

		}

	}

}