package hoja3;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {

// 8.- Escribe un programa que pida un número entero al usuario. A continuación 
// escribirá en pantalla todos los números entre el 1 y ése. Utiliza un bucle for.

		Scanner input = new Scanner(System.in);

		System.out.print("Dame un número entero\n> ");
		int num = input.nextInt();

		for (int i = 1; i <= num; i++) {

			System.out.println(i);

		}

	}

}