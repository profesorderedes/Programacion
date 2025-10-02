package ejemplos;

import java.util.Scanner;

public class Ejemplo02IfElse {

	public static void main(String[] args) {

		// Instrucción if - else.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe tu altura en metros:");
		float altura = entrada.nextFloat();

		// Si la altura es mayor de 1,8 metros, puede entrar en el equipo.
		if (altura > 1.8) {
			
			System.out.println("¡Puedes entrar al equipo de basket!");
			System.out.println("¡Enhorabuena!");
		}else {
			
			// Si la altura no es mayor de 1,8 metros, no puede entrar.
			System.out.println("No puedes entrar al equipo.");
			System.out.println("Lo lamentamos.");
		}

	}

}
