package hoja2;

import java.util.Scanner;

public class Ejer20 {

	public static void main(String[] args) {

		/*
		 * 
		 * Añade al programa anterior un bucle que busque el salario más bajo, e indique
		 * 
		 * el nombre y apellidos del trabajador al que corresponde, así como la cantidad
		 * 
		 */

		Scanner entrada = new Scanner(System.in);

		String[][] nominas = new String[4][3];

		int suma = 0;
		int posMin = 0;

		for (int fila = 0; fila < nominas.length; fila++) {

			System.out.print("Inserte los apellidos: ");
			nominas[fila][0] = entrada.nextLine();

			System.out.print("Inserte el nombre: ");
			nominas[fila][1] = entrada.nextLine();

			System.out.print("Inserte el sueldo: ");
			nominas[fila][2] = entrada.nextLine();

		}

		for (int fila = 0; fila < nominas.length; fila++) {

			for (int columna = 0; columna < nominas[0].length; columna++) {
				System.out.print(nominas[fila][columna] + "\t");
			}

			System.out.println();

		}

		for (int fila = 0; fila < nominas.length; fila++) {
			suma = suma + Integer.parseInt(nominas[fila][2]);
		}

		for (int fila = 0; fila < nominas.length; fila++) {

			if (Integer.parseInt(nominas[fila][2]) < Integer.parseInt(nominas[posMin][2])) {
				posMin = fila;
			}

		}

		System.out.println("La suma de todas las nóminas es de: " + suma);

		System.out.println("El salario más bajo pertenece a " + nominas[posMin][1] + " " + nominas[posMin][0]
				+ " y son " + nominas[posMin][2] + "€");

	}

}
