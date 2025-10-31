package hoja3;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {

// 11.- Escribe un programa que pida un número entero al usuario. A continuación escribirá en pantalla
// todos los números entre ése y 500. Utiliza un bucle do-while.

		Scanner input = new Scanner(System.in);

		System.out.print("Dame un número\n> ");
		int num = input.nextInt();

		do {

			System.out.println(num);
			num++;

		} while (num <= 500);

	}

}