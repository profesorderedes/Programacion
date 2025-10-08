package ejemplos;

import java.util.Scanner;

public class Ejemplo5Switch {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un nombre de color:");
		String color = entrada.nextLine();

		switch (color) {
		case "rojo":
			System.out.println("Longitud de onda: 780 nm");
			break;
		case "naranja":
			System.out.println("Longitud de onda: 650 nm");
			break;
		case "verde":
			System.out.println("Longitud de onda: 550 nm");
			break;
		default:
			System.out.println("No conozco la longitud de onda del " + color + ".");
		}

		System.out.println("Gracias por preguntar.");

	}

}
