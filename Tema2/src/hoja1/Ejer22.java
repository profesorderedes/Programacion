package hoja1;

import java.util.Scanner;

public class Ejer22 {

	public static void main(String[] args) {

//        Crea un programa que pida un número entero por teclado, entre 1 y 10.
//        Si el usuario escribe un número entero, se escribirá su valor en pantalla.
//        Si lo que escribe no es un entero, se mostará un mensaje de error.

		Scanner input = new Scanner(System.in);

		System.out.print("Introduzca un número entero\nentre 1 y 10: ");
		boolean tipocorrecto = input.hasNextFloat();

		if (tipocorrecto) {

			int numero = input.nextInt();

			if (numero >= 1 && numero <= 10) {
				System.out.println(numero + ".");
			}

			if (numero < 1 || numero > 10) {
				System.out.println("No es válido.");
			}

		} else {
			System.out.println("Introduce un valor entero.");
		}

	}
}