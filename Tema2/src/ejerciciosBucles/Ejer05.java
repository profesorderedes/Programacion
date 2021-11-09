package ejerciciosBucles;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un número y te diré " + "su tabla de multiplicar:");
		int num = entrada.nextInt();

		int contador = 1;

		while (contador <= 10) {

			System.out.println(num + " x " + contador + " = " + num * contador);
			contador++;

		}

	}

}
