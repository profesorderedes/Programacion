package ejerciciosBucles;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un carácter: ");
		String caracter = entrada.nextLine();

		System.out.println("¿Cuántas veces quieres que se repita?");
		int repeticiones = entrada.nextInt();

		int contador = 1;

		while (contador <= repeticiones) {

			System.out.println(contador + " " + caracter);
			contador = contador + 1;

		}

	}
}
