package ejerciciosBucles;

import java.util.Scanner;

public class Ejer10b {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		boolean semaforo = true;

		System.out.println(
				"¿Cómo se escribe 30 en hexadecimal?\n\n  1)  1E\n\n  2)  2F\n\n  3)  33\n\n  4)  Ninguno de los anteriores.");
		int opcion = entrada.nextInt();

		while (opcion < 1 || opcion > 4) {
			System.out.println(
					"¿Cómo se escribe 30 en hexadecimal?\n\n  1)  1E\n\n  2)  2F\n\n  3)  33\n\n  4)  Ninguno de los anteriores.");
			opcion = entrada.nextInt();
		}

		if (opcion == 1) {
			System.out.println("Acertaste.");
		} else {
			System.out.println("Fallaste.");
		}

	}

}