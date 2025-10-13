package ejemplos;

import java.util.Scanner;

public class Ejemplo07bVerificarEntrada {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿En qué año se descubrió América?");

		if (!entrada.hasNextInt()) {
			System.out.println("No has escrito un número entero.");
			return;
		}

		int anyo = entrada.nextInt();

		if (anyo == 1492) {
			System.out.println("Correcto.");
		} else {
			System.out.println("No fue ese año.");
		}
	}

}
