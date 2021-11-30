package ejercicios1;

import java.util.Scanner;

public class Ejer11b {

	public static void main(String[] args) {
		// Crea un programa que almacene las �rdenes que debe seguir un robot en un
		// array de 1000
		// elementos. Las �rdenes son palabras escritas por el usuario en la consola.

		Scanner entrada = new Scanner(System.in);

		String ordenes[] = new String[1000];
		String orden;
		boolean ordenValida;

		// El array comandos contiene todos los posibles
		// comandos que admite el robot.
		String comandos[] = new String[5];
		comandos[0] = "izquierda";
		comandos[1] = "derecha";
		comandos[2] = "arriba";
		comandos[3] = "abajo";
		comandos[4] = "matar";

		// Leemos la orden.
		System.out.println("Introduce una orden. Puedes introducir cualquiera de los siguientes:");
		for (int i = 0; i < comandos.length; i++) {
			System.out.println(comandos[i]);
		}

		// Pedimos las órdenes del robot
		for (int i = 0; i < ordenes.length; i++) {
			System.out.println("\nIntroduce una orden.");
			orden = entrada.nextLine();

			if (orden.equals("ejecutar")) {
				break;
			}

			// Verificamos que la orden está en el array comandos.
			ordenValida = false;
			for (int j = 0; j < comandos.length; j++) {
				if (orden.equals(comandos[j])) {
					ordenValida = true;
					break;
				}
			}

			// Si la orden es válida (está en el array comandos)
			// la guardamos. Si no, el programa termina.
			if (ordenValida) {
				ordenes[i] = orden;
			} else {
				System.out.println("Orden no válida.");
				System.exit(0);
			}

		}

		System.out.println("Lista completa de órdenes:");
		for (int i = 0; i < ordenes.length; i++) {
			if (ordenes[i] != null) {
				System.out.println(ordenes[i]);
			}

		}

	}

}
