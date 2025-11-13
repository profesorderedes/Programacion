package hoja2;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double[] productos = new double[10];

		System.out.println("Introduzca 10 precios");
		boolean preciosCorrectos = true;

		for (int i = 0; i < productos.length; i++) {

			System.out.print("> ");
			productos[i] = entrada.nextDouble();

		}

		double suma = 0;
		for (int i = 0; i < productos.length; i++) {

			if (productos[i] < 0) {
				System.out.println(

						"Se ha encontrado un valor no válido en la posición " + i + ". El programa terminará.");
				preciosCorrectos = false;
				break;

			}

			suma = suma + productos[i];

		}

		if (preciosCorrectos) {
			System.out.println("La suma de todos los precios da " + suma + " euros.");
		}

	}

}