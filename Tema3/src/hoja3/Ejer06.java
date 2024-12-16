package hoja3;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double salarios[] = new double[10];

		int extra = 0;
		double total = 0;

		System.out.println("SALARIOS DE LA EMPRESA");
		System.out.println("=======================");

		for (int i = 0; i < salarios.length; i++) {

			System.out.println("Salario:");
			salarios[i] = entrada.nextDouble();

		}

		int posMin = 0, posMax = 0;

		for (int i = 0; i < salarios.length; i++) {

			// Vamos comparando cada elemento del array con los de posMin y
			// posMax, y los actualizamos.
			if (salarios[i] < salarios[posMin]) {
				posMin = i;
			} else if (salarios[i] > salarios[posMax]) {
				posMax = i;
			}

			// Vamos sumando cuántos cobran más de 1500 euros.
			if (salarios[i] > 1500) {
				extra++;
			}

			total = total + salarios[i];

		}

		System.out.println("Salario mínimo: " + salarios[posMin] + " €.");
		System.out.println("Salario máximo: " + salarios[posMax] + " €.");
		System.out.println("Salario medio: " + total / salarios.length + " €.");
		System.out.println("\nLa cantidad de empleados que cobran más de 1500 € es " + extra + ".");

	}

}