package ejercicios2;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String nombres[] = new String[10];
		boolean nombreEncontrado = false;

		for (int i = 0; i < nombres.length; i++) {
			System.out.println((i + 1) + " Dime un nombre: ");
			nombres[i] = entrada.nextLine();
			if (nombres[i].equals("nadie")) {
				System.out.println("Ya no deseas guardar nombres.");
				break;
			}
		}

		for (int i = 0; i < nombres.length; i++) {
			
			if (nombres[i] != null && 
					nombres[i].equals("Calderón")) {
				nombreEncontrado = true;
				break;
			}

		}

		if (nombreEncontrado) {
			System.out.println("de la Barca.");
		} else {
			System.out.println("Nombre no encontrado.");
		}

	}

}