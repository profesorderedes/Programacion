package ejercicios2;

import java.util.Scanner;

public class Ejer20 {

	public static void main(String[] args) {

		// 4 empleados y 3 datos para cada empleado
		String nominas[][] = new String[4][3];

		Scanner entrada = new Scanner(System.in);

		// Leemos los datos para el array.

		for (int fila = 0; fila < nominas.length; fila++) {

			System.out.println("\nEmpleado nº " + fila);
			System.out.println("------------------------");

			System.out.print("Nombre: ");
			nominas[fila][0] = entrada.nextLine();

			System.out.print("Apellidos: ");
			nominas[fila][1] = entrada.nextLine();

			System.out.print("Sueldo: ");
			nominas[fila][2] = entrada.nextLine();

		}

		// Mostramos el array.

		System.out.println("\nNóminas");
		System.out.println("===========================");

		for (int fila = 0; fila < nominas.length; fila++) {

			System.out.printf("%-10s %-15s %5s", nominas[fila][0], nominas[fila][1], nominas[fila][2]);

			System.out.println();

		}

		// Calculamos el total de sueldos.

		float total = 0;

		for (int fila = 0; fila < nominas.length; fila++) {

			total = total + Float.parseFloat(nominas[fila][2]);

		}

		System.out.println("En total la empresa paga " + total + " euros en sueldos cada mes.");

		// Buscamos el salario más bajo.

		int posMin = 0;
		for (int fila = 0; fila < nominas.length; fila++) {

			if (Float.parseFloat(nominas[fila][2]) < Float.parseFloat(nominas[posMin][2])) {
				posMin = fila;
			}

		}

		System.out.println("El salario más bajo corresponde " + "a " + nominas[posMin][0] + " " + nominas[posMin][1]
				+ ", que cobra " + nominas[posMin][2] + " euros.");

	}

}
