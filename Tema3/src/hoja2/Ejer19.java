package hoja2;

import java.util.Scanner;

public class Ejer19 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String[][] nominas = new String[4][3];

		System.out.println("Introduzca los datos de los empleados:");
		for (int fila = 0; fila < nominas.length; fila++) {

			// Leemos los datos que se guardarán en la fila "fila".

			System.out.println("\nEmpleado nº " + (fila + 1));

			System.out.print("Apellidos: ");
			nominas[fila][0] = entrada.nextLine();

			System.out.print("Nombre: ");
			nominas[fila][1] = entrada.nextLine();

			System.out.print("Sueldo: ");
			nominas[fila][2] = String.valueOf(entrada.nextDouble());

			entrada.nextLine();

		}

		double total = 0;

		// Mostramos la tabla y calculamos el total.
		for (int fila = 0; fila < nominas.length; fila++) {

			// Acumulamos el sueldo de esta fila en el total.
			total = total + Double.parseDouble(nominas[fila][2]);

			// Mostramos la fila.
			System.out.println(nominas[fila][0] + "\t" + nominas[fila][1] + "\t" + nominas[fila][2]);
		}

		System.out.println("\nSuma de los sueldos: " + total + " euros.");

	}

}
