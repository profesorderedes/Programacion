package ejerciciosBucles;

import java.util.Scanner;

public class Ejer10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean semaforo = true;

		while (semaforo) {

			System.out.println(
					"¿Cómo se escribe 30 en hexadecimal?\n\n  1)  1E\n\n  2)  2F\n\n  3)  33\n\n  4)  Ninguno de los anteriores.");
			int opcion = entrada.nextInt();

			if (opcion == 1) {
				System.out.println("\n¡Felicidades, has acertado!");
				semaforo = false;
			} else if (opcion > 4 || opcion < 1) {
				System.out.println("\nEsa opción no existe.\n");
			} else {
				System.out.println("\nEsa opción es incorrecta.\n");
			}
		}

	}

}