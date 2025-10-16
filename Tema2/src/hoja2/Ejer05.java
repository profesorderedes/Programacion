package hoja2;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {

// 5.- Escribe un programa que solicite un número al usuario y, a
// continuación, muestre la tabla de multiplicar de ese número

		Scanner entrada = new Scanner(System.in);

		System.out.println("Inserte un número para mostrar su tabla de multiplicar.");
		int numero = entrada.nextInt();

		int repeticiones = 1;

		while (repeticiones < 11) {

			System.out.println(numero + " X " + repeticiones + " = " + numero * repeticiones);
			repeticiones++;

		}

	}

}