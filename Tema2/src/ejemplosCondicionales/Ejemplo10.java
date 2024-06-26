// Programa que pida dos números enteros y nos devuelva 
// la suma.
package ejemplosCondicionales;

import java.util.Scanner;

public class Ejemplo10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num1 = 0, num2 = 0;

		// Pedimos un número entero. Si el usuario se equivoca, el
		// programa termina.
		System.out.println("Escribe el primer número:");
		if (entrada.hasNextInt()) {
			num1 = entrada.nextInt();
		} else {
			System.out.println("No has escrito un número.");
			System.exit(0);
		}

		// Pedimos un número entero. Si el usuario se equivoca, el
		// programa termina.
		System.out.println("Escribe el segundo número:");
		if (entrada.hasNextInt()) {
			num2 = entrada.nextInt();
		} else {
			System.out.println("No has escrito un número.");
			System.exit(0);
		}

		// Hacemos la operación.
		System.out.println("La suma de los dos números es " + (num1 + num2));

	}

}
