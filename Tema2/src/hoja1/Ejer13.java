package hoja1;

import java.util.Scanner;

public class Ejer13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca una nota entre 0 y 10:");
		float nota = entrada.nextFloat();

		if (nota >= 0 && nota < 5) {

			System.out.println("Insuficiente");

		} else if (nota >= 5 && nota < 6) {

			System.out.println("Suficiente");

		} else if (nota >= 6 && nota < 7) {

			System.out.println("Bien");

		} else if (nota >= 7 && nota < 9) {

			System.out.println("Notable");

		} else if (nota >= 9 && nota <= 10) {

			System.out.println("Excelente");

		} else {

			System.out.println("Nota incorrecta");

		}

	}

}