package ejemplos;

import java.util.Scanner;

public class Ejemplo04bIfElseIf {

	public static void main(String[] args) {

		// En un zoo los niños no pagan entrada, los adolescentes (entre 14 y 18) pagan
		// 5 euros y los adultos pagan 10 euros.

		Scanner entrada = new Scanner(System.in);

		System.out.println("¡Bienvenidos al zoo!");
		System.out.println("Edad:");
		int edad = entrada.nextInt();

		// Asumimos que el dato escrito puede no ser una edad correcta.
		if (edad < 14) {
			System.out.println("Tienes que pagar 0 euros.");
		} else if (edad < 18) {
			System.out.println("Tienes que pagar 5 euros.");
		} else {
			System.out.println("Tienes que pagar 10 euros.");
		}

	}

}
