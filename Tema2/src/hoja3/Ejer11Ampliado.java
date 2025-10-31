package hoja3;

import java.util.Scanner;

public class Ejer11Ampliado {

	public static void main(String[] args) {

// 11.- Escribe un programa que pida un número entero al usuario. A continuación escribirá en pantalla
// todos los números entre ése y 500. Utiliza un bucle do-while.

		Scanner input = new Scanner(System.in);

		// Le pedimos un número al usuario.
		System.out.print("Dame un número\n> ");
		int num = input.nextInt();

		// Bucle que va mostrando números acercándonos a 500, por arriba o por abajo.
		do {

			System.out.println(num);

			// Si el número es mayor de 500, iremos restando. Y si no, iremos sumando.
			if (num > 500) {
				num--;
			} else {
				num++;
			}

		} while (num != 500);
		
		// Mostramos el 500, que no se muestra en el bucle.
		System.out.println(500);

	}

}