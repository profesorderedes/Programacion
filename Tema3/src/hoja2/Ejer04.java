package hoja2;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double[] productos = new double[10];
		boolean preciosCorrectos = true;
		double suma = 0;

		for (int i = 0; i < 10; i++) {

			System.out.print("Ingresa el precio del producto " + (i + 1) + ": ");
			double precio = entrada.nextDouble();

			if (precio <= 0) {

				preciosCorrectos = false;

				System.out.println(
						"Se ha encontrado un valor no válido en la posición " + i + ". El programa terminará.");

				break;

			}

			productos[i] = precio;
			suma += precio;

		}

		if (preciosCorrectos) {
			System.out.println("La suma total de los precios es: " + suma);
		}

	}
}
