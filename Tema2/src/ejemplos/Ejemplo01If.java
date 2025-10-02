package ejemplos;

import java.util.Scanner;

public class Ejemplo01If {

	public static void main(String[] args) {

		// Instrucción if

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe tu altura en metros:");
		float altura = entrada.nextFloat();

		// Si la altura es mayor de 1,8 metros, puede entrar en el equipo.
		if (altura > 1.8) {
			System.out.println("¡Puedes entrar al equipo de basket!");
			System.out.println("¡Enhorabuena!");
		}

	}

}
