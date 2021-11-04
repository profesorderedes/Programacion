package ejerciciosBucles;

import java.util.Scanner;

public class Ejer3b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num = 0;
		boolean semaforo = true;

		while (semaforo == true) {

			System.out.print("Escribe un número entero entre 1 " + "y 10: ");
			num = entrada.nextInt();

			if (num > 0 && num < 11) {
				semaforo = false;
			}

		}

		System.out.println("Has introducido el número: " + num);

	}

}
