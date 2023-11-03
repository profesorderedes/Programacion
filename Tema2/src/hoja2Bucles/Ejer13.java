package hoja2Bucles;

import java.util.Scanner;

// Escribe un programa que pregunte un

// número entre 1 y 20. Si el número introducido

// no cumple la condición, se le volverá a

// preguntar hasta que la cumpla. Al final

// simplemente se mostrará el número en pantalla.

public class Ejer13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num;

		do {

			System.out.print("Dime un número entre 1 y 20: ");
			num = entrada.nextInt();

		} while (num < 1 || num > 20);

		System.out.println(num);

		entrada.close();

	}

}