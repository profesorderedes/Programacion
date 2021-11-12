
// Programa que va pidiendo números y mostrando su tabla de 
// multiplicar. Si el usuario escribe un nº que no esté entre 1
// y 10, le mostrará un aviso y le volverá a preguntar.

import java.util.Scanner;

public class Ejemplo23 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("TABLAS DE MULTIPLICAR");
		System.out.println("=====================\n");

		int num;
		for (int i = 1; i <= 10; i++) {

			System.out.print("\nNúmero? ");
			num = entrada.nextInt();

			// Comprobamos si num está fuera del rango permitido.
			if (num < 1 || num > 10) {
				System.out.println("Tienes que escribir un número " + "entre 1 y 10");
				continue;
			}

			// Si el número es correcto, mostramos su tabla.
			for (int j = 1; j <= 10; j++) {
				System.out.println(num + " x " + j + " = " + num * j);
			}

		}

	}

}
