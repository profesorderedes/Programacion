package hoja2;

import java.util.Scanner;

public class Ejer19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[][] nominas = new String[4][3];

		double total = 0;

		for (int fila = 0; fila < nominas.length; fila++) {

			System.out.print("Introduce el nombre: ");
			nominas[fila][0] = sc.nextLine();
			
			System.out.print("Introduce el apellidos: ");
			nominas[fila][1] = sc.nextLine();
			
			System.out.print("Introduce el sueldo: ");
			nominas[fila][2] = sc.nextLine();

		}

		System.out.println("Tabla de nóminas:");

		for (int fila = 0; fila < nominas.length; fila++) {

			for (int col = 0; col < 3; col++) {
				System.out.print(nominas[fila][col] + "\t");
			}

			System.out.println();

			total = total + Integer.parseInt(nominas[fila][2]);

		}

		System.out.println("El total de salario que paga la empresa es de " + total + "€.");

	}

}
