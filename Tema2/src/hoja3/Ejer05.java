package hoja3;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {

// 5.- Haz un programa que te pida un número y te devuelva su tabla de multiplicar. Esto se repetirá
// indefinidamente hasta que el usuario escriba 0. En ese caso se escribirá la tabla del cero y el
// programa terminará. Usa los bucles do-while y for.

		Scanner input = new Scanner(System.in);

		System.out.println("TABLAS DE MULTIPLICAR\n----------------------");
		int num = 1;

		do {

			System.out.print("Número\n> ");
			num = input.nextInt();

			System.out.println("\nTabla del número " + num + ":");

			for (int i = 1; i <= 10; i++) {
				System.out.println("\t" + num + " x " + i + " = " + num * i);
			}

		} while (num != 0);
		
		

	}

}