package hoja3;

import java.util.Scanner;

public class Ejer01 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		final int NUM_ALEATORIO = (int) (Math.random() * 10 + 1);

		System.out.println(NUM_ALEATORIO);

		int intento = 1;

		boolean numAcertado = false;

		while (intento <= 3) {

			System.out.println("¿Cuál es el número secreto?");
			int num = entrada.nextInt();

			if (num == NUM_ALEATORIO) {
				numAcertado = true;
				break;
			}

			intento++;
		}

		if (numAcertado) {
			System.out.println("LO HAS CONSEGUIDO");
			System.out.println("Has necesitado " + intento + " intentos.");
		} else {
			System.out.println("Has fallado");
		}
	}

}
