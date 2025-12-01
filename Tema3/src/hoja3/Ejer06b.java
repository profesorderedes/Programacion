package hoja3;

import java.util.Scanner;

public class Ejer06b {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que lea desde consola los salarios de los 10 empleados de
		 * un pequeña empresa y los vaya guardando en un array. A continuación el
		 * programa calculará y mostrará por pantalla el salario mínimo, máximo y medio
		 * de los empleados. Así como la cantidad de empleados que cobran más de 1500 €
		 * mensuales
		 */

		/*
		 * Extra: ordenar, al final, el array de mayor a menor.
		 */

		Scanner entrada = new Scanner(System.in);

		int[] empleados = new int[10];

		int posMin = 0;
		int posMax = 0;
		int suma = 0;
		int salarioAlto = 0;

		for (int i = 0; i < empleados.length; i++) {

			System.out.println("Inserta los sueldos de los empleados");
			empleados[i] = entrada.nextInt();

		}

		for (int i = 0; i < empleados.length; i++) {

			if (empleados[i] < empleados[posMin]) {
				posMin = i;
			} else if (empleados[i] > empleados[posMax]) {
				posMax = i;
			}

			suma = suma + empleados[i];

			if (empleados[i] > 1500) {
				salarioAlto++;
			}

		}

		System.out.println("Salario más bajo: " + empleados[posMin]);
		System.out.println("Salario más alto: " + empleados[posMax]);
		System.out.println("Salario medio: " + (suma / empleados.length));
		System.out.println("¿Cuántos empleados cobran más de 1500€? " + salarioAlto + " empleados.");

		// Ordenar el array de mayor a menor.

		int aux;
		for (int i = 0; i < empleados.length - 1; i++) {

			// Buscamos el máximo entre i y el final del array.
			posMax = i;
			for (int j = i + 1; j < empleados.length; j++) {
				if (empleados[j] > empleados[posMax]) {
					posMax = j;
				}
			}

			// Intercambiamos la posición de i con la del máximo.
			aux = empleados[posMax];
			empleados[posMax] = empleados[i];
			empleados[i] = aux;

		}

		System.out.println("\nEmpleados ordenados de mayor a menor sueldo:");
		for (int i = 0; i < empleados.length; i++) {
			System.out.print(empleados[i] + "  ");
		}
	}

}