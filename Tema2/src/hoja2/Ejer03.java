package hoja2;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

// 3.- Escribe una aplicación que pregunte
// repetidamente un número entero hasta que el usuario
// escriba un valor entre 1 y 10. A continuación el
// programa escribirá un mensaje informando del número introducido

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca un número entero entre 1 y 10.");
		int numero = entrada.nextInt();

		while (numero < 1 || numero > 10) {

			System.out.println("Introduzca un numero válido");
			numero = entrada.nextInt();

		}

		System.out.println("Ha escrito el numero " + numero);

	}

}