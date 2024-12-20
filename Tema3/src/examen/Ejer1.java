package examen;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float gastos[] = new float[6];
		int posMin = 0;
		float aux;
		int gastosAltos = 0; // Número de gastos superiores a 50 euros
		float total = 0; // Consumo total

		// Leemos los gastos.
		System.out.println("Introduce los gastos en electricidad");
		System.out.println("====================================");

		for (int i = 0; i < gastos.length; i++) {
			System.out.print("Gasto " + i + ": ");
			gastos[i] = entrada.nextFloat();
		}

		// Ordenamos el array.
		for (int i = 0; i < gastos.length - 1; i++) {

			// Localizamos la posición del menor elemento entre i y el final del array.
			posMin = i;
			for (int j = i + 1; j < gastos.length; j++) {

				if (gastos[j] < gastos[posMin]) {
					posMin = j;
				}

			}

			// Intercambiamos el elemento más pequeño y el que ocupa la posición i.
			aux = gastos[posMin];
			gastos[posMin] = gastos[i];
			gastos[i] = aux;

		}

		// Mostramos el array ordenado.
		System.out.println("\nGastos ordenados:");
		for (int i = 0; i < gastos.length; i++) {
			System.out.print(gastos[i] + "  ");
		}

		// Contamos cuántos gastos superan los 50 euros y calculamos el gasto medio.
		for (int i = 0; i < gastos.length; i++) {

			total = total + gastos[i];

			if (gastos[i] > 50) {
				gastosAltos++;
			}
		}

		System.out.println("\n\nHogares con gasto superior a 50 euros: " + gastosAltos);
		System.out.println("Consumo medio de los hogares: " + total / gastos.length + " euros.");

	}

}