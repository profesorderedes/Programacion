package ejerciciosBucles;

import java.util.Scanner;

public class Ejer13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un número y te diré " + "su tabla de multiplicar:");
		int num = entrada.nextInt();

		for (int contador = 1; contador <= 10; contador++) {

			System.out.println(num + " x " + contador + " = " + num * contador);

		}

	}

}
