package hoja2;

import java.util.Scanner;

// 17.- Crea un programa que pida un número y escriba la tabla de multiplicar 
// de ese número.

public class Ejer17 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("TABLAS DE MULTIPLICAR");
		System.out.println("===========================");

		while (true) {
			System.out.print("\nDime un número: ");
			int num = entrada.nextInt();

			System.out.println("\nTabla del " + num + ":");
			for (int i = 1; i <= 10; i++) {

				System.out.println(num + " x " + i + " = " + num * i);

			}
		}

	}

}
