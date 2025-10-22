package hoja2;

import java.util.Scanner;

public class Ejer05b {

	public static void main(String[] args) {

// Escribe un programa que solicite un número al usuario y, a continuación, muestre la tabla de
// multiplicar de ese número

		Scanner input = new Scanner(System.in);

		System.out.println("Dame un número: ");
		int numero = input.nextInt();

		int i = 1;

		do {

			System.out.println(numero + " x " + i + " = " + (numero * i));
			i++;

		} while (i <= 10);

	}

}