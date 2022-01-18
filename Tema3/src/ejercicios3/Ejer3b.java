package ejercicios3;

import java.util.Arrays;

public class Ejer3b {

	public static void main(String[] args) {

		double cotizaciones[] = { 47.5, 47.8, 48, 48.1, 
				47.7, 47.3, 46, 47.9, 48.05, 48.7 };

		int posMin = 0;
		int posMax = 0;

		for (int i = 0; i < cotizaciones.length; i++) {

			if (cotizaciones[i] < cotizaciones[posMin]) {

				posMin = i;

			}

			if (cotizaciones[i] > cotizaciones[posMax]) {

				posMax = i;

			}

		}

		System.out.println("El valor máximo es de: " 
				+ cotizaciones[posMax]);

		System.out.println("El valor mínimo es de: " 
				+ cotizaciones[posMin]);

		System.out.println("\nA continuación se ordenarán "
				+ "de menor a mayor.");

		// Usamos el método de la burbuja para ordenar.
		
		double aux = 0;

		for (int i = 0; i < cotizaciones.length - 1; i++) {

			for (int j = 0; j < cotizaciones.length - i - 1; j++) {

				if (cotizaciones[j + 1] < cotizaciones[j]) {

					aux = cotizaciones[j + 1];
					cotizaciones[j + 1] = cotizaciones[j];
					cotizaciones[j] = aux;

				}
				
				

			}
		}

		System.out.println();

		for (int i = 0; i < cotizaciones.length; i++) {

			System.out.print(cotizaciones[i] + ", ");

		}

	}

}