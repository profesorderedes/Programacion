package ejercicios;

import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca una nota entera entre 0 y 10:");
		int nota = entrada.nextInt();

		if (nota >= 0 && nota < 5) {
			
			System.out.println("Insuficiente");
			
		} else if (nota == 5) {

			System.out.println("Suficiente");

		} else if (nota == 6) {

			System.out.println("Bien");

		} else if (nota > 6 && nota < 9) {

			System.out.println("Notable");

		} else if (nota == 9 || nota == 10) {

			System.out.println("Excelente");

		} else {

			System.out.println("Nota incorrecta");

		}

	}

}